package de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore;

import android.view.View;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {
        mLogic = pLogic;
    }

    @Override public void onClick(View v) {
        mLogic.onButtonBackClick(); //
    }
}

