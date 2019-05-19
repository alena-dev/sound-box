package com.example.testapp;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

public class QuestionHelperTest {
    private int mFirstArg;
    private int mSecondArg;
    private QuestionHelper mSubject;

    @Before
    public void setUp() throws Exception {
        mFirstArg = 1;
        mSecondArg = 2;
        mSubject = new QuestionHelper(mFirstArg, mSecondArg);
    }

    @Test
    public void exposesArgsSumAsAnswer(){
        int sum = mFirstArg + mSecondArg;
        assertThat(mSubject.getAnswer(), is(sum));
    }
}