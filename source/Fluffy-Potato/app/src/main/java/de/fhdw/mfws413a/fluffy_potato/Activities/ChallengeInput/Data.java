package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import android.app.Activity;
import android.text.Editable;

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

    public boolean isAnswerRight(String pAnswer) {
        return mGlobal.getCurrentChallenge().isRightAnswere(pAnswer);
    }

    public Challenge getCurrentChallenge() {
        return mGlobal.getCurrentChallenge();
    }
}
