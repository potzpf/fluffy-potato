package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnAnswerRight;
    private Button mBtnAnswerWrong;
    private TextView mTvRightAnsweres;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_response_control);
        mBtnAnswerRight = (Button) pActivity.findViewById(R.id.resc_btn_true);
        mBtnAnswerWrong = (Button)pActivity.findViewById(R.id.resc_btn_false);
        mTvRightAnsweres = (TextView) pActivity.findViewById(R.id.resc_textView_answer);

    }

    public Button getBtnAnswerRight() {
        return mBtnAnswerRight;
    }
    public Button getBtnAnswerWrong() {
        return mBtnAnswerWrong;
    }

    public TextView getTvRightAnsweres() {
        return mTvRightAnsweres;
    }
}
