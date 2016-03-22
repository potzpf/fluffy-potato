package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseFalse;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button mBtnNextChallenge;
    private TextView mTvRightAnswers;

    // constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_response_false);

        // setting Gui elements

        mBtnNextChallenge = (Button)pActivity.findViewById(R.id.resb_btn_next);
        mTvRightAnswers = (TextView) pActivity.findViewById(R.id.resb_textView_answer);

    }

    // methods

    public Button getBntNextChallenge() {

        return mBtnNextChallenge;

    }

    public TextView getTvRightAnswers() {

        return mTvRightAnswers;

    }

}
