package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink;

import android.view.View;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    // Construktor

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnAnswerThink().setOnClickListener(this);
        mLogic = pLogic;

    }

    // Methods

    @Override public void onClick(View v) {

        mLogic.onButtonAnswerThinkClick();

    }

}

