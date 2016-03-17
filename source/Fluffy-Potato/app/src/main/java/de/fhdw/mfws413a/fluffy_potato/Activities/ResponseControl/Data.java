package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl;

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
