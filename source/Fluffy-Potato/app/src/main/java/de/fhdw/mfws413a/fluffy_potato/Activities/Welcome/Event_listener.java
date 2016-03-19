package de.fhdw.mfws413a.fluffy_potato.Activities.Welcome;

import android.view.View;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {
        pGui.getBtnStart().setOnClickListener(this);
        mLogic = pLogic;
    }

    @Override public void onClick(View v) {
        mLogic.onButtonStartClick();
    }
}

