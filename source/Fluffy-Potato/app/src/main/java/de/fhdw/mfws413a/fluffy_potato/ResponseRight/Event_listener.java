package de.fhdw.mfws413a.fluffy_potato.ResponseRight;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.ResponseRight.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.ResponseRight.Gui;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnNextChallenge().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {

        mLogic.onButtonNextChallengeClick();

    }
}

