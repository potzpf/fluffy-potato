package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;


public class Gui {

    //Vars

    private Button mBtnAnswerInput;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_challenge_Input);
        mBtnAnswerInput = (Button)pActivity.findViewById(R.id.challa_btn_next);
    }

    public Button getBtnAnswerInput() {
        return mBtnAnswerInput;
    }
}
