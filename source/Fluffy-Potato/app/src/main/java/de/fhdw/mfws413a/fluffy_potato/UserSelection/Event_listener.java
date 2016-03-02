package de.fhdw.mfws413a.fluffy_potato.UserSelection;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.R;
import de.fhdw.mfws413a.fluffy_potato.UserSelection.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.UserSelection.Gui;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtn_CreateNewUser().setOnClickListener(this);
        pGui.getBtn_GoToFileSelection().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {
        switch(v.getId()){
            case R.id.usrsel_btn_select: mLogic.OnButtonCreateNewUserClick();
                break;
            case R.id.usrsel_spinner_user:
                mLogic.OnButtonGoToFileSelection();
                break;
        }
    }
    // on items select list, kein clicked event

}

