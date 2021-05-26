package com.example.areyouahuman;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class AnswerActivity extends AppCompatActivity {

    private TextView answerText1;
    private TextView answerText2;
    private TextView answerText3;
    private TextView answerText4;
    private TextView answerText5;
    private TextView answerText6;
    private TextView answerText7;
    private TextView answerText8;
    private TextView answerText9;
    private TextView answerText10;
    private TextView resText1;
    private TextView resText2;
    private TextView resText3;
    private TextView resText4;
    private TextView resText5;
    private TextView resText6;
    private TextView resText7;
    private TextView resText8;
    private TextView resText9;
    private TextView resText10;
    private boolean[] answer = new boolean[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Log.d("System info", "Метод onCreate() запущен!");

        Resources res1 = getResources();
        Drawable drawableRed = res1.getDrawable(R.color.redColor);
        Resources res2 = getResources();
        Drawable drawableGreen = res2.getDrawable(R.color.greenColor);

        Bundle arguments = getIntent().getExtras();
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

        answerText1 = findViewById(R.id.textAnswer1);
        answerText2 = findViewById(R.id.textAnswer2);
        answerText3 = findViewById(R.id.textAnswer3);
        answerText4 = findViewById(R.id.textAnswer4);
        answerText5 = findViewById(R.id.textAnswer5);
        answerText6 = findViewById(R.id.textAnswer6);
        answerText7 = findViewById(R.id.textAnswer7);
        answerText8 = findViewById(R.id.textAnswer8);
        answerText9 = findViewById(R.id.textAnswer9);
        answerText10 = findViewById(R.id.textAnswer10);

        resText1 = findViewById(R.id.textRes1);
        resText2 = findViewById(R.id.textRes2);
        resText3 = findViewById(R.id.textRes3);
        resText4 = findViewById(R.id.textRes4);
        resText5 = findViewById(R.id.textRes5);
        resText6 = findViewById(R.id.textRes6);
        resText7 = findViewById(R.id.textRes7);
        resText8 = findViewById(R.id.textRes8);
        resText9 = findViewById(R.id.textRes9);
        resText10 = findViewById(R.id.textRes10);


        answerText1.setText(getString(R.string.answer) + " 1");
        answerText2.setText(getString(R.string.answer) + " 2");
        answerText3.setText(getString(R.string.answer) + " 3");
        answerText4.setText(getString(R.string.answer) + " 4");
        answerText5.setText(getString(R.string.answer) + " 5");
        answerText6.setText(getString(R.string.answer) + " 6");
        answerText7.setText(getString(R.string.answer) + " 7");
        answerText8.setText(getString(R.string.answer) + " 8");
        answerText9.setText(getString(R.string.answer) + " 9");
        answerText10.setText(getString(R.string.answer) + " 10");


        if(answer[0]){
            resText1.setText(R.string.human);
            resText1.setBackground(drawableGreen);}
        else{
            resText1.setText(R.string.human);
            resText1.setBackground(drawableRed);}

        if(answer[1]){
            resText2.setText(R.string.human);
            resText2.setBackground(drawableGreen);}
        else{
            resText2.setText(R.string.robot);
            resText2.setBackground(drawableRed);}

        if(answer[2]){
            resText3.setText(R.string.human);
            resText3.setBackground(drawableGreen);}
        else {
            resText3.setText(R.string.robot);
            resText3.setBackground(drawableRed); }

        if(answer[3]){
            resText4.setText(R.string.human);
            resText4.setBackground(drawableGreen);}
        else {
            resText4.setText(R.string.robot);
            resText4.setBackground(drawableRed); }

        if(answer[4]){
            resText5.setText(R.string.human);
            resText5.setBackground(drawableGreen);}
        else {
            resText5.setText(R.string.robot);
            resText5.setBackground(drawableRed);
        }

        if(answer[5]){
            resText6.setText(R.string.human);
            resText6.setBackground(drawableGreen);}
        else {
            resText6.setText(R.string.robot);
            resText6.setBackground(drawableRed);}

        if(answer[6]){
            resText7.setText(R.string.human);
            resText7.setBackground(drawableGreen);}
        else {
            resText7.setText(R.string.robot);
            resText7.setBackground(drawableRed); }

        if(answer[7]){
            resText8.setText(R.string.human);
            resText8.setBackground(drawableGreen);}
        else {
            resText8.setText(R.string.robot);
            resText8.setBackground(drawableRed);}

        if(answer[8]){
            resText9.setText(R.string.human);
            resText9.setBackground(drawableGreen);}
        else {
            resText9.setText(R.string.robot);
            resText9.setBackground(drawableRed);}

        if(answer[9]){
            resText10.setText(R.string.human);
            resText10.setBackground(drawableGreen);}
        else {
            resText10.setText(R.string.robot);
            resText10.setBackground(drawableRed);}

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