package de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Init extends AppCompatActivity {

    // Vars

    private Data mData;
    private Gui mGui;
    private AppLogic mLogic;

    // Constructor

    @Override protected void onCreate(Bundle psavedInstanceState) {

        super.onCreate(psavedInstanceState);
        initGui();
        initData();
        initLogic();
        initEvents();

    }

    // Methods

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
