package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl;

import android.app.Activity;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

    // vars

    private Activity mActivity;
    private MyApp mGlobal;

    // Constructor

    public Data(Activity pActivity) {

        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();

    }

    // methods (getter)

    public Activity getActivity() {
        return mActivity;
    }

    public String getRightAnswereText(){

       return mGlobal.getCurrentChallenge().getRightAnswerText();

    }

    public Challenge getCurrentChallenge() {

        return mGlobal.getCurrentChallenge();

    }

    public boolean incCurrentChallengeIndex() {

        return mGlobal.incCurrentChallengeIndex();

    }

    public void incRightAnsweredCount() {

        mGlobal.incRightAnsweredCount();

    }

    // put challenge in next progress clas

    public void pushChallenge() {

        mGlobal.pushChallenge();

    }

    // put chaleng in lower progess class

    public void dropChallenge() {

        mGlobal.dropChallenge();

    }

}
