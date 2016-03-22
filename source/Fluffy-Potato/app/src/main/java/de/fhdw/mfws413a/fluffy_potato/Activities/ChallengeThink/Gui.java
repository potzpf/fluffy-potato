package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button mBtnAnswerThink;
    private TextView mTvQuestion;

    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_challenge_think);

        // setting Gui Elements

        mBtnAnswerThink = (Button) pActivity.findViewById(R.id.challc_btn_show);
        mTvQuestion = (TextView) pActivity.findViewById(R.id.challc_textView_question);

    }

    // Methods

    public Button getBtnAnswerThink() {

        return mBtnAnswerThink;

    }

    public void setChallenge(Challenge pChallenge){

        // set Gui Komponet that depends on Challenge

        mTvQuestion.setText(pChallenge.getQuestion());

    }

}
