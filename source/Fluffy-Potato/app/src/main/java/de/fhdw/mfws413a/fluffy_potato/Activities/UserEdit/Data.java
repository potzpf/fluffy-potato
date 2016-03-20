package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

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

    public String getTimespan(Integer pClass){
        //mGlobal.getAppIF().getDuration(mGlobal.getActUser(),pClass);
        //*in integer umwandeln
        return pClass.toString();
    }

    public void setTimespan(Integer pClass, Integer pTimespan){
        mGlobal.getAppIF().setDuration(mGlobal.getActUser(),pClass-1,pTimespan);
    }
}
