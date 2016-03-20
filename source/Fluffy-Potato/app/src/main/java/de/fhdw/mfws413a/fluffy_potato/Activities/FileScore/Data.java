package de.fhdw.mfws413a.fluffy_potato.Activities.FileScore;

import android.app.Activity;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

  //vars

    private Activity mActivity;
    private MyApp mGlobal;
    private ArrayList<String> mFileData = new ArrayList<String>();

    //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();
    }

    public Activity getActivity() {
        return mActivity;
    }

    public void addFileData(String pFile, int pQuestion,int pDue){
        mFileData.add(pFile);
        mFileData.add(Integer.toString(pQuestion));
        mFileData.add(Integer.toString(pDue));
    }

    public ArrayList<String> getFileData() {
        mFileData.add("Layout");
        mFileData.add("9");
        mFileData.add("5");
        return mFileData;
    }

    //* methode für s laden der kartei daten über global appif
}
