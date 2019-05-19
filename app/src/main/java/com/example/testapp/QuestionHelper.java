package com.example.testapp;

public class QuestionHelper {

    private int mFirstArg;
    private int mSecondArg;

    public QuestionHelper(int firstArg, int secondArg) {
        mFirstArg = firstArg;
        mSecondArg = secondArg;
    }


    public int getAnswer() {
       int result = mFirstArg + mSecondArg;
       return result;
    }
}
