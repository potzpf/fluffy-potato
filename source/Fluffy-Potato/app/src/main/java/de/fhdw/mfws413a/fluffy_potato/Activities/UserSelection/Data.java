package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import android.app.Activity;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

    // vars

    private Activity          mActivity;
    private ArrayList<String> mUserList;
    private MyApp             mGlobal;

    // Constructor

    public Data(Activity pActivity) {

        // local Vars

        String lUser;

        // Logic

        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();
        mUserList = mGlobal.getUserNames();
        lUser = mActivity.getIntent().getStringExtra(Const.P_USER_LIST);

        // if there was an username in Intent add it

        if (lUser.equals("")){

          //empty

        }else{

            mGlobal.getAppIF().addUser(lUser);
            mGlobal.getAppIF().init();

        }

    }

    // Methods (getter)

    public Activity getActivity() {

        return mActivity;

    }

    public ArrayList<String> getUsers() {

        return mUserList;

    }

    public String getActUser() {

        return mGlobal.getActUser();

    }

    // Methods (setter)

    public void setActUser(String pActUser) {

        mGlobal.setActUser(pActUser);

    }

}
