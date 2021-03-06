package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class Init extends AppCompatActivity {

    // Vars

    private Data mData;
    private Gui mGui;
    private AppLogic mLogic;

    // Constructor

    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
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

    // react on backbutton

    @Override public void onBackPressed() {

        Navigation.startActivityScore(this);

    }

}