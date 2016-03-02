package de.fhdw.mfws413a.fluffy_potato.ChallengeThink;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.ChallengeThink.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.ChallengeThink.Gui;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnAnswerThink().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {

        mLogic.onButtonAnswerThinkClick();

    }
}

