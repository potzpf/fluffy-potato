package de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore;

import android.app.Activity;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

    // vars

    private Activity mActivity;
    private String mFileName;
    private MyApp mGlobal;

    // Constructor

    public Data(Activity pActivity) {

        mActivity = pActivity;

        // getting filename for detailed statistic

        mFileName = mActivity.getIntent().getStringExtra(Const.P_SELECTED_FILE);
        mGlobal = (MyApp) mActivity.getApplication();

    }

    // methods (getter)

    public Activity getActivity() {

        return mActivity;

    }

    public String getFileName() {

        return mFileName;

    }

    public void setQuestionCount(Gui pGui) {

        // local vars

        ArrayList<String> lQuestionCountList;

        // logic

        // loading count of questions per progress class

        lQuestionCountList = mGlobal.getAppIF().getClassesQuestionCount(mFileName,mGlobal.getActUser());

        // setting depending GUI elements

        pGui.getmTvQuestion1().setText(lQuestionCountList.get(0));
        pGui.getmTvQuestion2().setText(lQuestionCountList.get(1));
        pGui.getmTvQuestion3().setText(lQuestionCountList.get(2));
        pGui.getmTvQuestion4().setText(lQuestionCountList.get(3));
        pGui.getmTvQuestion5().setText(lQuestionCountList.get(4));
        pGui.getmTvQuestion6().setText(lQuestionCountList.get(5));

    }

    public void setDueCount(Gui pGui) {

        // local vars

        ArrayList<String> lDueCountList;

        // logic

        // loading count of due questions per progress class

        lDueCountList = mGlobal.getAppIF().getClassesDuenCount(mFileName,mGlobal.getActUser());

        // setting depending GUI elements

        pGui.getmTvDue1().setText(lDueCountList.get(0));
        pGui.getmTvDue2().setText(lDueCountList.get(1));
        pGui.getmTvDue3().setText(lDueCountList.get(2));
        pGui.getmTvDue4().setText(lDueCountList.get(3));
        pGui.getmTvDue5().setText(lDueCountList.get(4));
        pGui.getmTvDue6().setText(lDueCountList.get(5));

    }

}
