package de.fhdw.mfws413a.fluffy_potato.ResponseRight;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnNextChallenge;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_response_right);
        mBtnNextChallenge = (Button) pActivity.findViewById(R.id.resa_btn_next);
    }

    public Button getBtnNextChallenge() {
        return mBtnNextChallenge;
    }
}
