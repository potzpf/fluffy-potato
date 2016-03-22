package de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser;

import android.app.Activity;

public class Data {

    // vars

    private Activity mActivity;
    private String mUser;

    // Constructor

    public Data(Activity pActivity ) {

        mActivity = pActivity;

    }

    // Methods (getter)

    public Activity getActivity() {

        return mActivity;

    }

    public String getUser() {

        return mUser;

    }

    // save new username for next Activity

    public void setUser(String pUser) {

        mUser = pUser;

    }

}
