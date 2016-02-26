package de.fhdw.mfws413a.fluffy_potato.Welcome;

import android.app.Activity;

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
