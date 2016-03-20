package de.fhdw.mfws413a.fluffy_potato.Activities.FileScore;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnBack;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_detailscore);
        mBtnBack = (Button) pActivity.findViewById(R.id.det_btn_back);
    }

    public Button getBtnBack() {
        return mBtnBack;
    }
}
