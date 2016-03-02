package de.fhdw.mfws413a.fluffy_potato.CreateUser;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.CreateUser.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.CreateUser.Gui;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnCreateUser().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {

        mLogic.onButtonCreateUserClick();

    }
}

