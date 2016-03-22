package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseRight;

import android.app.Activity;
import android.widget.Button;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button mBtnNextChallenge;

    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_response_right);

        // settting Gui elements

        mBtnNextChallenge = (Button) pActivity.findViewById(R.id.resa_btn_next);

    }

    // methods

    public Button getBtnNextChallenge() {

        return mBtnNextChallenge;

    }

}
