package de.fhdw.mfws413a.fluffy_potato.ResponseRight;

import android.app.Activity;

import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;

public class Data {

  //vars

    private Activity mActivity;

  //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
    }

    public Activity getActivity() {
        return mActivity;
    }
}
