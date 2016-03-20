package de.fhdw.mfws413a.fluffy_potato.Activities.Challenge1Of3;

import android.app.Activity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private CheckBox mCbAnswerA;
    private CheckBox mCbAnswerB;
    private CheckBox mCbAnswerC;
    private Button mBtnNext;
    private TextView mTvQuestion;
    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_challange_3of1);
        mCbAnswerA = (CheckBox) pActivity.findViewById(R.id.challa_checkBox_answer_a);
        mCbAnswerB = (CheckBox)pActivity.findViewById(R.id.challa_checkBox_answer_b);
        mCbAnswerC = (CheckBox)pActivity.findViewById(R.id.challa_checkBox_answer_c);
        mBtnNext = (Button)pActivity.findViewById(R.id.challa_btn_next);
        mTvQuestion = (TextView) pActivity.findViewById(R.id.challa_textView_question);

    }

    public CheckBox getCbAnswerA() {
        return mCbAnswerA;
    }
    public CheckBox getCbAnswerB() {
        return mCbAnswerB;
    }
    public CheckBox getCbAnswerC() {
        return mCbAnswerC;
    }
    public Button getBtnNext() {
        return mBtnNext;
    }

    public void setChallenge(Challenge pChallenge) {
        mTvQuestion.setText(pChallenge.getQuestion());
        mCbAnswerA.setText(pChallenge.getAnswere(0));
        mCbAnswerB.setText(pChallenge.getAnswere(1));
        mCbAnswerC.setText(pChallenge.getAnswere(2));
    }

}
