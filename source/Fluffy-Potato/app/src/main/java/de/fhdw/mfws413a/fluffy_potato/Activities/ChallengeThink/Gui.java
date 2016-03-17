package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnAnswerThink;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_challenge_think);
        mBtnAnswerThink = (Button) pActivity.findViewById(R.id.challc_btn_show);

    }

    public Button getBtnAnswerThink() {
        return mBtnAnswerThink;
    }
}
