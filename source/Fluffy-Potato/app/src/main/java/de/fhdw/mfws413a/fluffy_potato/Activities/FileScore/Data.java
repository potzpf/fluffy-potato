package de.fhdw.mfws413a.fluffy_potato.Activities.FileScore;

import android.app.Activity;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

    // vars

    private Activity mActivity;
    private MyApp mGlobal;
    private ArrayList<String> mFileData = new ArrayList<String>();

    //Constructor

    public Data(Activity pActivity) {

        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();

    }

    // Methods (getter)

    public Activity getActivity() {

        return mActivity;

    }

    public ArrayList<String> getFileData() {

        return mFileData;

    }

    // adding File data to ArrayStringList for 3 columned gridview

    public void addFileData(String pFile, String pQuestion,String pDue){

        mFileData.add(pFile);
        mFileData.add(pQuestion);
        mFileData.add(pDue);

    }

    // loading file datas from AppInterface

    public void makeFileData() {

        // local vars

        ArrayList<String> lFiles;

        // logic

        lFiles = mGlobal.getAppIF().getFileNames();
        for (int i = 0; i < lFiles.size(); i++) {

            addFileData(lFiles.get(i),
                        mGlobal.getAppIF().getFilesQuestionCount(lFiles.get(i)),
                        Integer.toString(mGlobal.getAppIF().getDueChallenges(mGlobal.getActUser(),
                                                                             lFiles.get(i)).size()
                                                                             )
                       );

        }

    }

}
