package de.fhdw.mfws413a.fluffy_potato.Welcome;

import android.app.Activity;
import android.widget.Button;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtn_Start;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_main);
        mBtn_Start = (Button) pActivity.findViewById(R.id.main_btn_start);

    }

    public Button getBtn_Start() {

        return mBtn_Start;

    }
}
