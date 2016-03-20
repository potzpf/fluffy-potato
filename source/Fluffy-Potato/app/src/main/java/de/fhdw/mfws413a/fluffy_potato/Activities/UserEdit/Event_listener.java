package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

import android.view.View;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;// variable fr alle klassen, da hier die funktionen deklariert sind, die wirklich aufgerufen werden

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtn_Edit().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {

        mLogic.OnButtonEditClick(); //

    }
}

