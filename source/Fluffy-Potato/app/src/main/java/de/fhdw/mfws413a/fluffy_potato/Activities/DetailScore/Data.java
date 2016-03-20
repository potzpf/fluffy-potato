package de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore;

import android.app.Activity;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;

public class Data {

  //vars

    private Activity mActivity;
    private String mFileName;
  //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        mFileName = mActivity.getIntent().getStringExtra(Const.P_USER_List);
    }

    public Activity getActivity() {
        return mActivity;
    }

    public String getFileName() {
        return mFileName;
    }
}
