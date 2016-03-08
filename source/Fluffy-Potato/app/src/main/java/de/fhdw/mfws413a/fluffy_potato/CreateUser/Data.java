package de.fhdw.mfws413a.fluffy_potato.CreateUser;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.UserPotato;

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
