package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnSave;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_useredit);
        mBtnSave = (Button) pActivity.findViewById(R.id.usr_btn_edit);
    }

    public Button getBtnSave() {
        return mBtnSave;
    }
}
