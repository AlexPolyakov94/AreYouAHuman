package com.example.areyouahuman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button yesBtn;
    private Button noBtn;
    private Button hintBtn;
    private TextView textView;
    private Question [] question = new Question[]{
            new Question(R.string.question0, true),
            new Question(R.string.question1, true),
            new Question(R.string.question2, true),
            new Question(R.string.question3, true),
            new Question(R.string.question4, true),
            new Question(R.string.question5, false),
            new Question(R.string.question6, false),
            new Question(R.string.question7, false),
            new Question(R.string.question8, false),
            new Question(R.string.question9, false),
    };
    private boolean[] answer = new boolean[10];



    private int questionIndex = 0;
    private int finalScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("System info", "Метод onCreate() запущен!");

        for(int i =0; i<10; i++){
            answer[i] = true;
        }

        if(savedInstanceState != null){
            questionIndex = savedInstanceState.getInt("questionIndex");
            finalScore = savedInstanceState.getInt("finalScore");
            answer = savedInstanceState.getBooleanArray("answer");
        }

        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        textView.setText(question[questionIndex].getQuestionRedId());
        yesBtn = findViewById(R.id.btnYes);
        noBtn = findViewById(R.id.btnNo);
        hintBtn = findViewById(R.id.btnHint);

        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(question[questionIndex].isAnswerTrue()) {
                        Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_LONG).show();
                        finalScore ++;
                        answer[questionIndex] = true;
                    }
                    else{
                        Toast.makeText(MainActivity.this, R.string.incorrect, Toast.LENGTH_LONG).show();
                        finalScore--;
                        answer[questionIndex] = false;
                    }

                questionIndex += 1;
                if (questionIndex == 10){
                    Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                    intent.putExtra("score",finalScore);
                    intent.putExtra("answer1", answer[0]);
                    intent.putExtra("answer2", answer[1]);
                    intent.putExtra("answer3", answer[2]);
                    intent.putExtra("answer4", answer[3]);
                    intent.putExtra("answer5", answer[4]);
                    intent.putExtra("answer6", answer[5]);
                    intent.putExtra("answer7", answer[6]);
                    intent.putExtra("answer8", answer[7]);
                    intent.putExtra("answer9", answer[8]);
                    intent.putExtra("answer10", answer[9]);
                    startActivity(intent);
                }
                textView.setText(question[questionIndex%question.length].getQuestionRedId());
            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (question[questionIndex].isAnswerTrue()){
                    Toast.makeText(MainActivity.this, R.string.incorrect, Toast.LENGTH_LONG).show();
                    finalScore--;
                    answer[questionIndex] = false;
                }
                else {
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_LONG).show();
                    finalScore++;
                    answer[questionIndex] = true;
                }

                questionIndex += 1;
                if (questionIndex == 10){
                    Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                    intent.putExtra("score",finalScore);
                    intent.putExtra("answer1", answer[0]);
                    intent.putExtra("answer2", answer[1]);
                    intent.putExtra("answer3", answer[2]);
                    intent.putExtra("answer4", answer[3]);
                    intent.putExtra("answer5", answer[4]);
                    intent.putExtra("answer6", answer[5]);
                    intent.putExtra("answer7", answer[6]);
                    intent.putExtra("answer8", answer[7]);
                    intent.putExtra("answer9", answer[8]);
                    intent.putExtra("answer10", answer[9]);
                    startActivity(intent);
                }
                textView.setText(question[questionIndex%question.length].getQuestionRedId());
            }
        });

        hintBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HintActivity.class);
                intent.putExtra("questId", questionIndex);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("System info", "Метод onStart() запущен!");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("System info", "Метод onResume() запущен!");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.d("System info", "Метод onSaveInstanceState() запущен!");

        savedInstanceState.putInt("questionIndex", questionIndex);
        savedInstanceState.putInt("finalScore", finalScore);
        savedInstanceState.putBooleanArray("answer", answer);
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("System info", "Метод onPause() запущен!");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("System info", "Метод onStop() запущен!");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("System info", "Метод onDestroy() запущен!");
    }
}