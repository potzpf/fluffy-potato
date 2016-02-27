package de.fhdw.mfws413a.fluffy_potato.Challange3of1;

import android.view.View;

import de.fhdw.mfws413a.fluffy_potato.Welcome.AppLogic;
import de.fhdw.mfws413a.fluffy_potato.Welcome.Gui;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtn_answera().setOnClickListener(this);
        pGui.getBtn_answerb().setOnClickListener(this);
        pGui.getBtn_answerc().setOnClickListener(this);
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {
        switch(v.getId(){
            case R.id.challa_btn_answer_a: mLogic.OnButtonStartClick();
                break;
            case R.id.challa_btn_answer_b: mLogic.OnButtonStartClick();
                break;
            case R.id.challa_btn_answer_c: mLogic.OnButtonStartClick();
                break;
        }
    }
}

