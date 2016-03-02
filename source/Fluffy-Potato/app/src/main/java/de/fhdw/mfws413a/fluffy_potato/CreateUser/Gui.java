package de.fhdw.mfws413a.fluffy_potato.CreateUser;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnCreateUser;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_createuser);
        mBtnCreateUser = (Button) pActivity.findViewById(R.id.crtusr_btn_create);

    }

    public Button getBtnCreateUser() {
        return mBtnCreateUser;
    }
}
