package de.fhdw.mfws413a.fluffy_potato.Activities.Welcome;

import android.app.Activity;
import android.widget.Button;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button mBtnStart;

    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_main);

        // set Gui element

        mBtnStart = (Button) pActivity.findViewById(R.id.main_btn_start);

    }

    // methods (getter)

    public Button getBtnStart() {

        return mBtnStart;

    }

}
