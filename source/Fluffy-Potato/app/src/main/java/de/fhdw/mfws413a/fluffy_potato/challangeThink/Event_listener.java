package de.fhdw.mfws413a.fluffy_potato.challangeThink;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.Welcome.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.Welcome.Gui;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtn_Show().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {

        mLogic.OnButtonShowClick();

    }
}

