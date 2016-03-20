package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.R;


public class Gui {

    //Vars

    private Button mBtnAnswerInput;
    private EditText mEdAnswer;
    private TextView mTvQuestion;
    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_challenge_Input);
        mBtnAnswerInput = (Button)pActivity.findViewById(R.id.challa_btn_next);
        mEdAnswer = (EditText)pActivity.findViewById(R.id.challb_edittext_answer);
        mTvQuestion = (TextView)pActivity.findViewById(R.id.challb_textView_question);
    }

    public Button getBtnAnswerInput() {
        return mBtnAnswerInput;
    }

    public EditText getEdAnswere() {
        return mEdAnswer;
    }

    public void setChallenge(Challenge pChallenge) {
        mTvQuestion.setText(pChallenge.getQuestion());
    }
}
