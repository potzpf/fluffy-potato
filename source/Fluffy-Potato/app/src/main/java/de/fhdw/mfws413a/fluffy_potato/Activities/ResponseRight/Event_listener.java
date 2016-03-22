package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseRight;

import android.view.View;

public class Event_listener implements View.OnClickListener{

    // Vars

    private AppLogic mLogic;

    // Constructor

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnNextChallenge().setOnClickListener(this);
        mLogic = pLogic;

    }

    // Methods

    @Override public void onClick(View v) {

        mLogic.onButtonNextChallengeClick();

    }
}

