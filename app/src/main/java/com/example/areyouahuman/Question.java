package com.example.areyouahuman;

public class Question {
    private int questionRedId;
    private boolean answerTrue;

    public Question(int questionRedId, boolean answerTrue) {
        this.questionRedId = questionRedId;
        this.answerTrue = answerTrue;
    }

    public int getQuestionRedId() {
        return questionRedId;
    }

    public boolean isAnswerTrue() {
        return answerTrue;
    }
}
