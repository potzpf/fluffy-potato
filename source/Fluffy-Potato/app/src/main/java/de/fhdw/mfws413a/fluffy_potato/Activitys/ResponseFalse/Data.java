package de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseFalse;

import android.app.Activity;
import android.app.Application;

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

    public String getRightAnswereText(){
        String lAnswereText = "";
        ArrayList<String> lAnswereList = Global.getCurrentChallenge().getRightAnswereList();

        for (int i = 0; i <lAnswereList.size()-1 ; i++) {
            lAnswereText = lAnswereText + lAnswereList.get(i);
            if (i+1 < lAnswereList.size()){
                lAnswereText = lAnswereText + "\n";
            }
        }
        return lAnswereText;
    }

}
