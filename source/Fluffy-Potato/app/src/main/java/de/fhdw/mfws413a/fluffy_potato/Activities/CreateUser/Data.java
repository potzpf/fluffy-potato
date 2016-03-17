package de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser;

import android.app.Activity;

public class Data {

  //vars

    private Activity mActivity;
    private String mUser;

  //Methods

    public Data(Activity pActivity ) {
        mActivity = pActivity;
    }

    public Activity getActivity() {
        return mActivity;
    }

    public String getUser() {
        return mUser;
    }

    public void setUser(String pUser) {
        mUser = pUser;
    }
}
