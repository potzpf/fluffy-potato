package de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore;

import android.app.Activity;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

  //vars

    private Activity mActivity;
    private String mFileName;
    private MyApp mGlobal;

  //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        mFileName = mActivity.getIntent().getStringExtra(Const.P_SELECTED_FILE);
        mGlobal = (MyApp) mActivity.getApplication();
    }

    public Activity getActivity() {
        return mActivity;
    }

    public String getFileName() {
        return mFileName;
    }

    public void setQuestionCount(Gui pGui) {
        ArrayList<String> lQuestionCountList = mGlobal.getAppIF().getClassesQuestionCount(mFileName);

        pGui.getmTvQuestion1().setText(lQuestionCountList.get(0));
        pGui.getmTvQuestion2().setText(lQuestionCountList.get(1));
        pGui.getmTvQuestion3().setText(lQuestionCountList.get(2));
        pGui.getmTvQuestion4().setText(lQuestionCountList.get(3));
        pGui.getmTvQuestion5().setText(lQuestionCountList.get(4));
        pGui.getmTvQuestion6().setText(lQuestionCountList.get(5));
    }
}
