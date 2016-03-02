package de.fhdw.mfws413a.fluffy_potato.ChallengeInput;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.ChallengeInput.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.ChallengeInput.Gui;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnAnswerInput().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {

        mLogic.onButtonAnswerInputClick();

    }
}

