package de.fhdw.mfws413a.fluffy_potato.Activitys.ChallengeInput;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnAnswerInput;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_challenge_input);
        mBtnAnswerInput = (Button) pActivity.findViewById(R.id.challb_btn_next);

    }

    public Button getBtnAnswerInput() {
        return mBtnAnswerInput;
    }
}
