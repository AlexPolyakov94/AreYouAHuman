package com.example.areyouahuman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HintActivity extends AppCompatActivity {

    private TextView hintText;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button tenBtn;
    private int hintIndex=0;


    private Hint [] hint = new Hint[]{
            new Hint(R.string.hint0),
            new Hint(R.string.hint1),
            new Hint(R.string.hint2),
            new Hint(R.string.hint3),
            new Hint(R.string.hint4),
            new Hint(R.string.hint5),
            new Hint(R.string.hint6),
            new Hint(R.string.hint7),
            new Hint(R.string.hint8),
            new Hint(R.string.hint9),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Log.d("System info", "Метод onCreate() запущен!");

        setContentView(R.layout.activity_hint);

        Bundle arguments = getIntent().getExtras();
        hintIndex = arguments.getInt("questId");

        hintText = findViewById(R.id.hintText);
        oneBtn = findViewById(R.id.btn1);
        twoBtn = findViewById(R.id.btn2);
        threeBtn = findViewById(R.id.btn3);
        fourBtn = findViewById(R.id.btn4);
        fiveBtn = findViewById(R.id.btn5);
        sixBtn = findViewById(R.id.btn6);
        sevenBtn = findViewById(R.id.btn7);
        eightBtn = findViewById(R.id.btn8);
        nineBtn = findViewById(R.id.btn9);
        tenBtn = findViewById(R.id.btn10);

        hintText.setText(hint[hintIndex].getHintRedId());


        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 0;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 1;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 2;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 3;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 4;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 5;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 6;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 7;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 8;
                hintText.setText(hint[hintIndex].getHintRedId());
            }
        });
        tenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintIndex = 9;
                hintText.setText(hint[hintIndex].getHintRedId());
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

