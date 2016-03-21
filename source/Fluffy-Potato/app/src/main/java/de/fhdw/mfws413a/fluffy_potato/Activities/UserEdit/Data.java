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
        int lTimeSpan;
        lTimeSpan = mGlobal.getAppIF().getDurationMin(mGlobal.getActUser(), pClass);
        if (lTimeSpan < 60){
            pUnitSpinner.setSelection(0);
            return Integer.toString(lTimeSpan);
        }else {lTimeSpan = lTimeSpan/60;}

        if (lTimeSpan < 24 ){
            pUnitSpinner.setSelection(1);
            return Integer.toString(lTimeSpan);
        }else{
            lTimeSpan = lTimeSpan/24;
            pUnitSpinner.setSelection(2);
            return Integer.toString(lTimeSpan);
        }
    }

    public void setTimespan(Integer pClass, Integer pTimespan,String pUnit){
        //mGlobal.getAppIF().setDuration(mGlobal.getActUser(),pClass,pTimespan);
        //*prüfen
    }
}
