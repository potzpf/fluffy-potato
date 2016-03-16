package de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseControl;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnAnswerRight().setOnClickListener(this);
        pGui.getBtnAnswerWrong().setOnClickListener(this);
        mLogic = pLogic;


    }

    @Override public void onClick(View v) {
        switch(v.getId()){
            case R.id.resc_btn_true: mLogic.onButtonAnswerRightClick();
                break;
            case R.id.resc_btn_false: mLogic.onButtonAnswerWrongClick();
                break;
        }
    }
}

