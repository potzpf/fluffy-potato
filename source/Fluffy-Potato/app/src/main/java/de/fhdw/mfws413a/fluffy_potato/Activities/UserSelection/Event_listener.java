package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {
        pGui.getBtnCreateNewUser().setOnClickListener(this);
        pGui.getBtnGoToFileSelection().setOnClickListener(this);
        //pGui.getSpSelectUser().setOnClickListener(this);
        mLogic = pLogic;
    }

    @Override public void onClick(View v) {
        switch(v.getId()) {

            case R.id.usrsel_spinner_user:
                //something
                break;
            case R.id.usrsel_btn_next:
                mLogic.onButtonGoToFileSelectionClick();
                break;
            case R.id.usrsel_btn_create:
                mLogic.onButtonCreateNewUserClick();
                break;
        }
    }
    // on items select list, kein clicked event

}

