package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    // Vars

    private AppLogic mLogic;

    // Constructor

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtn_Edit().setOnClickListener(this);
        pGui.getBtn_Default().setOnClickListener(this);
        mLogic = pLogic;

    }

    // Methods

    @Override public void onClick(View v) {

        switch(v.getId()){

            case R.id.usredt_btn_default: mLogic.OnButtonDefaultClick();
                break;
            case R.id.usredt_btn_edit: mLogic.OnButtonEditClick();
                break;

        }

    }

}

