package de.fhdw.mfws413a.fluffy_potato.Activities.Score;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getmBtn_ToFiles().setOnClickListener(this);
        mLogic = pLogic;
    }

    @Override public void onClick(View v) {
        switch(v.getId()){
            case R.id.scr_button_detail:
                mLogic.onButtonDetailClick();
                break;
            case R.id.scr_button_start:
                mLogic.onButtonStartClick();
                break;
        }
    }
}

