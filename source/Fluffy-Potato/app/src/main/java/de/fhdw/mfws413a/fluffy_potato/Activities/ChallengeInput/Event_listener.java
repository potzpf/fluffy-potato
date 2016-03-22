package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import android.view.View;

public class Event_listener implements View.OnClickListener{

    // Vars

    private AppLogic mLogic;

    // Constructor

    public Event_listener(AppLogic pLogic, Gui pGui) {

        mLogic = pLogic;
        pGui.getBtnAnswerInput().setOnClickListener(this);

    }

    // Methods

    @Override public void onClick(View v) {

        mLogic.onButtonAnswerInputClick();

    }

}

