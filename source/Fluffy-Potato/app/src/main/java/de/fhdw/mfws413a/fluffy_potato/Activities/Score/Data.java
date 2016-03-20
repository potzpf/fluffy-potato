package de.fhdw.mfws413a.fluffy_potato.Activities.Score;

import android.app.Activity;

import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

  //vars

    private Activity mActivity;
    private MyApp mGlobal;

    //Methods

    public Data(Activity pActivity) {

        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();
    }

    public Activity getActivity() {
        return mActivity;
    }

    public int getDone() {
        return mGlobal.getDoneChallengesCount();
    }

    public double getPercentage() {
        return ( (double)mGlobal.getRightAnsweredCount())/( (double) mGlobal.getDoneChallengesCount());
    }

    public int getRight() {
        return mGlobal.getRightAnsweredCount();
    }

    public int getWrong() {
        return mGlobal.getDoneChallengesCount()-mGlobal.getRightAnsweredCount();
    }
}
