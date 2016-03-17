package de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnCreateUser;
    private EditText mEdUsername;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_createuser);
        mBtnCreateUser = (Button) pActivity.findViewById(R.id.crtusr_btn_create);
        mEdUsername =  (EditText) pActivity.findViewById(R.id.crtusr_editText_username);

    }

    public Button getBtnCreateUser() {
        return mBtnCreateUser;
    }

    public EditText getEdUsername() {
        return mEdUsername;
    }
}
