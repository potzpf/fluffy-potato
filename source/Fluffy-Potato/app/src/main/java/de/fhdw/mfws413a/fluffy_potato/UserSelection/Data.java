package de.fhdw.mfws413a.fluffy_potato.UserSelection;

import android.app.Activity;
import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Storage;
import de.fhdw.mfws413a.fluffy_potato.UserPotato;

public class Data {

  //vars

    private Activity          mActivity;
    private Storage           mFio;
    private ArrayList<String> mUsers;
    private String            mActUser;

  //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        try {
            mFio = new Storage();
            mUsers = mFio.users.getNameList();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Activity getActivity() {
        return mActivity;
    }

    public ArrayList<String> getUsers() {
        return mUsers;
    }

    public String getActUser() {
        return mActUser;
    }

    public void setActUser(String pActUser) {
        mActUser = pActUser;
    }
}
