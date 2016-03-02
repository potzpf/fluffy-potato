package de.fhdw.mfws413a.fluffy_potato.UserSelection;

import android.app.Activity;
import android.widget.Button;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnCreateUser;
    private Button mBtnSelectUser;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_userselection);
        mBtnCreateUser = (Button) pActivity.findViewById(R.id.usrsel_btn_create);
        mBtnSelectUser = (Button)pActivity.findViewById(R.id.usrsel_btn_select);

    }

    public Button getBtnCreateNewUser() {

        return mBtnCreateUser;

    }
    public Button getBtnSelectUser() {
        return mBtnSelectUser;
    }
}
