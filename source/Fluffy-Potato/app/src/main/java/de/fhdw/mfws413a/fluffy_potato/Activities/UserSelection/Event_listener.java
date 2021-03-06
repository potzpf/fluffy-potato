package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import android.view.View;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    // Vars

    private AppLogic mLogic;

    // Constructor

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnCreateNewUser().setOnClickListener(this);
        pGui.getBtnGoToFileSelection().setOnClickListener(this);
        pGui.getBtnEditUser().setOnClickListener(this);
        mLogic = pLogic;

    }

    // Methods

    @Override public void onClick(View v) {

        // decision for next Chalklenge Type

        switch(v.getId()) {

            case R.id.usrsel_btn_next:
                mLogic.onButtonGoToFileSelectionClick();
                break;
            case R.id.usrsel_btn_create:
                mLogic.onButtonCreateNewUserClick();
                break;
            case R.id.usrsel_btn_time:
                mLogic.onButtonEditUserClick();
                break;

        }

    }

}

