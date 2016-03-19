package de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection;

import android.app.Activity;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

  //vars

    private Activity mActivity;
    private MyApp mGlobal;
    private String mSelectedFile;
    //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();
        mSelectedFile = "";
    }

    public Activity getActivity() {
        return mActivity;
    }

    public ArrayList<String> getFiles(){
        return mGlobal.getAppIF().getFileNames();
    }

    public Integer getDuePerFile(String pFile){
        return mGlobal.getAppIF().getDueChallenges(mGlobal.getActUser(), pFile).size();
    }

    public void setSelectedFile(String pSelectedFiel) {
        mSelectedFile = pSelectedFiel;
    }

    public String getSelectedFile() {
        return mSelectedFile;
    }

    public void buildChallengeList(String pFile){
        mGlobal.setChallengeList(pFile);
    }

    public String GetCurrentChallengeTyp(){
        return mGlobal.getCurrentChallengeType();
    }
}
