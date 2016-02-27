package de.fhdw.mfws413a.fluffy_potato.ResponseControl;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.Welcome.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.Welcome.Gui;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtn_True().setOnClickListener(this);
        pGui.getBtn_False().setOnClickListener(this);
        mLogic = pLogic;


    }

    @Override public void onClick(View v) {
        switch(v.getId(){
            case R.id.resc_btn_true: mLogic.OnButtonTrueClick();
                break;
            case R.id.resc_btn_false: mLogic.OnButtonFalseClick();
                break;
        }
    }
}

