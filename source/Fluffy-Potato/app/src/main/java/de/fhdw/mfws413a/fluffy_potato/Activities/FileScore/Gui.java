package de.fhdw.mfws413a.fluffy_potato.Activities.FileScore;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnStart;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_file_score);
        mBtnStart = (Button) pActivity.findViewById(R.id.main_btn_start);
    }

    public Button getBtnStart() {
        return mBtnStart;
    }
}
