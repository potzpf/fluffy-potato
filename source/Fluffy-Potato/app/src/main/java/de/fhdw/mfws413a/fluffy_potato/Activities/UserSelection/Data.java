package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import android.app.Activity;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;
import de.fhdw.mfws413a.fluffy_potato.Storage;
import de.fhdw.mfws413a.fluffy_potato.UserPotato;

public class Data {

  //vars

    private Activity          mActivity;
    private ArrayList<String> mUserList;
    private MyApp             mGlobal;

  //Methods

    public Data(Activity pActivity) {
        String lUser;

        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();
        mUserList = mGlobal.getAppIF().getUserNames();

        lUser = mActivity.getIntent().getStringExtra(Const.P_USER_List);
        if (lUser.equals("")){
          //nix
        }else{
            mUserList.add(lUser);
        }
        //speichern!
    }

    public Activity getActivity() {
        return mActivity;
    }

    public ArrayList<String> getUsers() {
        return mUserList;
    }

    public String getActUser() {
        return mGlobal.getActUser();
    }

    public void setActUser(String pActUser) {
        mGlobal.setActUser(pActUser);
    }
}
