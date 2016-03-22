package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink;

import android.app.Activity;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

    // vars

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

    public Challenge getCurrentChallenge() {

        return mGlobal.getCurrentChallenge();

    }

}
