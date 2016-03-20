package de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection;

import android.view.View;
import android.widget.AdapterView;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Event_listener implements View.OnClickListener{

    //Vars

    private AppLogic mLogic;

    //Methods

    public Event_listener(AppLogic pLogic, Gui pGui) {

        pGui.getBtnNext().setOnClickListener(this);
        pGui.getListViewFiles().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                mLogic.setSelectedFile((String) adapter.getItemAtPosition(position));
            }
        });
        mLogic = pLogic;

    }

    @Override public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_start_challenge: mLogic.onButtonStartChallengeClick();;
                break;
        }
    }

}

