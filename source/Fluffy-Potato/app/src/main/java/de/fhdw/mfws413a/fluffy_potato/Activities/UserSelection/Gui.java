package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.sql.Array;
import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.R;
import de.fhdw.mfws413a.fluffy_potato.UserPotato;

public class Gui {

    //Vars

    private Button mBtnCreateUser;
    private Spinner mSpSelectUser;
    private Button mBtnGoToFileSelection;
    private Button mBtnEditUser;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_userselection);
        mBtnCreateUser = (Button) pActivity.findViewById(R.id.usrsel_btn_create);
        mSpSelectUser = (Spinner)pActivity.findViewById(R.id.usrsel_spinner_user);
        mBtnGoToFileSelection = (Button)pActivity.findViewById(R.id.usrsel_btn_next);
        mBtnEditUser = (Button)pActivity.findViewById(R.id.usrsel_btn_time);

    }

    public Button getBtnCreateNewUser() {

        return mBtnCreateUser;

    }
    public Button getBtnGoToFileSelection() {
        return mBtnGoToFileSelection;
    }

    public Spinner getSpSelectUser() {
        return mSpSelectUser;
    }

    public Button getBtnEditUser() {
        return mBtnEditUser;
    }

    public void SetUsers(ArrayList<String> pUsers, Activity pActivity){

        ArrayAdapter<String> lArrayAdapter = new ArrayAdapter<String>(pActivity,
                R.layout.spinner_layout, pUsers
                );
        mSpSelectUser.setAdapter(lArrayAdapter );
    }
}
