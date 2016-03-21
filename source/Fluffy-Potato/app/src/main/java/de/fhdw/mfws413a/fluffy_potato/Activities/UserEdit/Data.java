package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

import android.app.Activity;
import android.widget.Spinner;

import de.fhdw.mfws413a.fluffy_potato.Data.MyApp;

public class Data {

  //vars

    private Activity mActivity;
    private MyApp mGlobal;
    //* default zeitspannen gegebenenfalls hard codieren
  //Methods

    public Data(Activity pActivity) {
        mActivity = pActivity;
        mGlobal = (MyApp) mActivity.getApplication();
    }

    public Activity getActivity() {
        return mActivity;
    }

    public String getTimespan(Integer pClass, Spinner pUnitSpinner){
        return TimeSpan2Text(pUnitSpinner,mGlobal.getAppIF().getDurationMin(mGlobal.getActUser(), pClass));
    }

    private String TimeSpan2Text(Spinner pUnitSpinner,int pTimeSpan){
        if (pTimeSpan < 60){
            pUnitSpinner.setSelection(0);
            return Integer.toString(pTimeSpan);
        }else {pTimeSpan = pTimeSpan/60;}

        if (pTimeSpan < 24 ){
            pUnitSpinner.setSelection(1);
            return Integer.toString(pTimeSpan);
        }else{
            pTimeSpan = pTimeSpan/24;
            pUnitSpinner.setSelection(2);
            return Integer.toString(pTimeSpan);
        }
    }

    public void setTimespan(Integer pClass, Integer pTimespan,String pUnit){
        int lTimeSpan=0;
        switch (pUnit){
            case "min": lTimeSpan=pTimespan;
                break;
            case "hour": lTimeSpan=pTimespan*60;
                break;
            case "day": lTimeSpan=pTimespan*60*24;
        }
        mGlobal.getAppIF().setDurationMin(mGlobal.getActUser(), pClass, lTimeSpan);

    }

    public String getDefaultTimespan(int pClass, Spinner pUnitSpinner) {
        return TimeSpan2Text(pUnitSpinner,mGlobal.getAppIF().getDurationMin("default", pClass));
    }
}
