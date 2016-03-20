package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl;

import android.app.Activity;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

  //vars

    private Activity mActivity;
    private MyApp mGlobal;
  //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();
    }

    public Activity getActivity() {
        return mActivity;
    }

    public String getRightAnswereText(){
       return mGlobal.getCurrentChallenge().getRightAnswerText();
    }

    public boolean incCurrentChallengeIndex() {
        return mGlobal.incCurrentChallengeIndex();
    }

    public Challenge getCurrentChallenge() {
        return mGlobal.getCurrentChallenge();
    }

    public void incRightAnsweredCount() {
        mGlobal.incRightAnsweredCount();
    }

    public void pushChallenge() {
        mGlobal.pushChallenge();
    }

    public void dropChallenge() {
        mGlobal.dropChallenge();
    }
}
