package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseFalse;

import android.app.Activity;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

    // vars

    private Activity mActivity;
    private MyApp mGlobal;

    // constructor

    public Data(Activity pActivity) {

        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();

    }

    // methods (getter)

    public Activity getActivity() {

        return mActivity;

    }

    public String getRightAnswerText(){

        return mGlobal.getCurrentChallenge().getRightAnswerText();

    }

    public Challenge getCurrentChallenge() {

        return mGlobal.getCurrentChallenge();

    }

    public boolean incCurrentChallengeIndex() {

        return mGlobal.incCurrentChallengeIndex();

    }

    // put challenge in lower pogress class

    public void dropChallenge() {

        mGlobal.dropChallenge();

    }

}
