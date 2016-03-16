package de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseFalse;

import android.app.Activity;
import android.app.Application;

import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

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
