package de.fhdw.mfws413a.fluffy_potato.Activities.Score;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnStart;
    private Button mBtnDetail;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_score);
        mBtnStart = (Button) pActivity.findViewById(R.id.scr_button_start);
        mBtnDetail = (Button)pActivity.findViewById(R.id.scr_button_detail);
    }

    public Button getBtnStart() {
        return mBtnStart;
    }

    public Button getBtnDetail() {
        return mBtnDetail;
    }
}
