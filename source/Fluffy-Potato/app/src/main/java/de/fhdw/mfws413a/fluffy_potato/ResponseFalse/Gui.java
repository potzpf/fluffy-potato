package de.fhdw.mfws413a.fluffy_potato.ResponseFalse;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnNextChallenge;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_response_false);
        mBtnNextChallenge = (Button)pActivity.findViewById(R.id.resb_btn_next);
    }

    public Button getBntNextChallenge() {
        return mBtnNextChallenge;
    }
}
