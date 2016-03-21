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

    public void addFileData(String pFile, String pQuestion,String pDue){
        mFileData.add(pFile);
        mFileData.add(pQuestion);
        mFileData.add(pDue);
    }

    public ArrayList<String> getFileData() {
        mFileData.add("Layout");
        mFileData.add("9");
        mFileData.add("5");
        return mFileData;
    }

    public void makeFileData() {
        ArrayList<String> lFiles = mGlobal.getAppIF().getFileNames();
        for (int i = 0; i < lFiles.size(); i++) {
            addFileData(lFiles.get(i),
                        mGlobal.getAppIF().getFilesQuestionCount(lFiles.get(i)),
                        Integer.toString(mGlobal.getAppIF().getDueChallenges(mGlobal.getActUser(),lFiles.get(i)).size()));

        }
    }

    //* methode für s laden der kartei daten über global appif
}
