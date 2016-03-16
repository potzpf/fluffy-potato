package de.fhdw.mfws413a.fluffy_potato.Activitys.UserSelection;

import android.app.Activity;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Storage;
import de.fhdw.mfws413a.fluffy_potato.UserPotato;

public class Data {

  //vars

    private Activity          mActivity;
    private Storage           mFio;
    private UserPotato        mUsers;
    private String            mActUser;  //in global verschieben

  //Methods

    public Data(Activity pActivity) {
        String lUser;

        mActivity = pActivity;
        lUser = mActivity.getIntent().getStringExtra(Const.P_USER_List);

        try {
            mFio = new Storage();
            mUsers = mFio.users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (lUser != "" && mUsers != null){
            mUsers.add(lUser);
        }
    }

    public Activity getActivity() {
        return mActivity;
    }

    public UserPotato getUsers() {
        return mUsers;
    }

    public String getActUser() {
        return mActUser;
    }

    public void setActUser(String pActUser) {
        mActUser = pActUser;
    }
}
