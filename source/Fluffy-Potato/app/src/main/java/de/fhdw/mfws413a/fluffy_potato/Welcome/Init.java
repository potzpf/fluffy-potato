package de.fhdw.mfws413a.fluffy_potato.Welcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Init extends AppCompatActivity {

    //Vars

    private Data mData;
    private Gui mGui;
    private AppLogic mLogic;

    //Methods

    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
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
