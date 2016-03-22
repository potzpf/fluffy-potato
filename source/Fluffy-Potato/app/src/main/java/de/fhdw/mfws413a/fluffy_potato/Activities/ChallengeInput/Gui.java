package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.R;


public class Gui {

    // Vars

    private Button mBtnAnswerInput;
    private EditText mEdAnswer;
    private TextView mTvQuestion;

    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_challenge_input);

        // setting GUI elements

        mBtnAnswerInput = (Button)pActivity.findViewById(R.id.challb_btn_next);
        mEdAnswer = (EditText)pActivity.findViewById(R.id.challb_edittext_answer);
        mTvQuestion = (TextView)pActivity.findViewById(R.id.challb_textView_question);

    }

    // Methods (getter)

    public Button getBtnAnswerInput() {

        return mBtnAnswerInput;

    }

    public EditText getEdAnswere() {

        return mEdAnswer;

    }

    public void setChallenge(Challenge pChallenge) {

        //setting GUI komponent that depends on Challenge

        mTvQuestion.setText(pChallenge.getQuestion());

    }
}
