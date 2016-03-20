package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseFalse;

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

    public String getRightAnswerText(){
        return mGlobal.getCurrentChallenge().getRightAnswerText();
    }

    public boolean incCurrentChallengeIndex() {
        return mGlobal.incCurrentChallengeIndex();
    }

    public Challenge getCurrentChallenge() {
        return mGlobal.getCurrentChallenge();
    }
}
