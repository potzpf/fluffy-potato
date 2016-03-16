package de.fhdw.mfws413a.fluffy_potato.Activitys.FileSelection;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnNext().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_start_challenge: mLogic.onButtonStartChallengeClick();;
                break;
        }
    }
}

