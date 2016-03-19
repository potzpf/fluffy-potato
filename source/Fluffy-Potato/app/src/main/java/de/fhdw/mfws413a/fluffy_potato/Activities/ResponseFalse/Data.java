package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseFalse;

import android.app.Activity;

import java.util.ArrayList;

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


    public String getRightAnswerText(){
        return Global.getCurrentChallenge().getRightAnswerText();
    }


}
