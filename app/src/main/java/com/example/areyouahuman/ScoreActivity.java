package com.example.areyouahuman;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoreText;
    private TextView scoreDesc;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("System info", "Метод onCreate() запущен!");
        setContentView(R.layout.activity_score);

        returnBtn = findViewById(R.id.btnReturn);
        scoreText = findViewById(R.id.textScore);

        Bundle arguments = getIntent().getExtras();
        String finalScore = arguments.get("score").toString();

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