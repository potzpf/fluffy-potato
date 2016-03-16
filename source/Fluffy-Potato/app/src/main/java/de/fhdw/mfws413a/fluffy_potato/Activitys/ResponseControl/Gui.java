package de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseControl;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnAnswerRight;
    private Button mBtnAnswerWrong;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_response_control);
        mBtnAnswerRight = (Button) pActivity.findViewById(R.id.resc_btn_true);
        mBtnAnswerWrong = (Button)pActivity.findViewById(R.id.resc_btn_false);

    }

    public Button getBtnAnswerRight() {
        return mBtnAnswerRight;
    }
    public Button getBtnAnswerWrong() {
        return mBtnAnswerWrong;
    }
}
