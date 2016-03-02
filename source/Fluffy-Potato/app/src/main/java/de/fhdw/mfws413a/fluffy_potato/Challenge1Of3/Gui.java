package de.fhdw.mfws413a.fluffy_potato.Challenge1Of3;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnAnswerA;
    private Button mBtnAnswerB;
    private Button mBtnAnswerC;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_challange_3of1);
        mBtnAnswerA = (Button) pActivity.findViewById(R.id.challa_btn_answer_a);
        mBtnAnswerB = (Button)pActivity.findViewById(R.id.challa_btn_answer_b);
        mBtnAnswerC = (Button)pActivity.findViewById(R.id.challa_btn_answer_c);

    }

    public Button getBtnAnswerA() {
        return mBtnAnswerA;
    }
    public Button getBtnAnswerB() {
        return mBtnAnswerB;
    }
    public Button getBtnAnswerC() {
        return mBtnAnswerC;
    }
}
