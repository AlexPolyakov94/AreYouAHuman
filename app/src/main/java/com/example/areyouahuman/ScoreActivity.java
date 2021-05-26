package com.example.areyouahuman;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoreText;
    private TextView scoreDesc;
    private Button returnBtn;
    private Button answerBtn;
    private boolean[] answer = new boolean[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("System info", "Метод onCreate() запущен!");
        setContentView(R.layout.activity_score);
        if(savedInstanceState != null){
            answer = savedInstanceState.getBooleanArray("answer");
        }

        returnBtn = findViewById(R.id.btnReturn);
        answerBtn = findViewById(R.id.btnAnswer);
        scoreText = findViewById(R.id.textScore);

        Bundle arguments = getIntent().getExtras();
        String finalScore = arguments.get("score").toString();
        answer[0] = (Boolean) arguments.get("answer1");
        answer[1] = (Boolean) arguments.get("answer2");
        answer[2] = (Boolean) arguments.get("answer3");
        answer[3] = (Boolean) arguments.get("answer4");
        answer[4] = (Boolean) arguments.get("answer5");
        answer[5] = (Boolean) arguments.get("answer6");
        answer[6] = (Boolean) arguments.get("answer7");
        answer[7] = (Boolean) arguments.get("answer8");
        answer[8] = (Boolean) arguments.get("answer9");
        answer[9] = (Boolean) arguments.get("answer10");

        scoreText.setText(finalScore);
        scoreDesc = findViewById(R.id.textDescription);

        int score = arguments.getInt("score");
        if (score > 5 && score <= 10){
            scoreDesc.setText(R.string.finalScore0);
        } else if (score >= 0 && score <=5){
            scoreDesc.setText(R.string.finalScore1);
        } else {
            scoreDesc.setText(R.string.finalScore2);
        }

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        answerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this, AnswerActivity.class);
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