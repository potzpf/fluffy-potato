package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import android.app.Activity;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

    // Vars

    private Activity mActivity;
    private MyApp mGlobal;

    // Constructor

    public Data(Activity pActivity) {

        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();

    }

    // Methods (getter)

    public Activity getActivity() {

        return mActivity;

    }

    // proov answer

    public boolean isAnswerRight(String pAnswer) {

        return mGlobal.getCurrentChallenge().isRightAnswere(pAnswer);

    }

    // load current challenge Data

    public Challenge getCurrentChallenge() {

        return mGlobal.getCurrentChallenge();

    }

}
