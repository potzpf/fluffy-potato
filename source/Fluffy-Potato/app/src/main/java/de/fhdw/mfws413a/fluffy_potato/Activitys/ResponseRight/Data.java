package de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseRight;

import android.app.Activity;
import android.app.Application;

import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

  //vars

    private Activity mActivity;
    public MyApp Global;
  //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        Global = (MyApp) mActivity.getApplication();
    }

    public Activity getActivity() {
        return mActivity;
    }

}
