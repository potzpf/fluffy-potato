package de.fhdw.mfws413a.fluffy_potato.CreateUser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.fhdw.mfws413a.fluffy_potato.CreateUser.Event_listener;
import de.fhdw.mfws413a.fluffy_potato.UserPotato;

public class Init extends AppCompatActivity {

    //Vars

    private Data mData;
    private Gui mGui;
    private AppLogic mLogic;

    //Methods

    @Override protected void onCreate(Bundle psavedInstanceState) {

        super.onCreate(psavedInstanceState);
        initGui();
        initData();
        initLogic();
        initEvents();
    }

    private void initGui(){
        mGui = new Gui(this);
    }

    private void initData(){
        mData = new Data(this);
    }

    private void initLogic(){
        mLogic = new AppLogic(mData,mGui);
    }

    private void initEvents(){
        new Event_listener(mLogic,mGui);
    }
}
