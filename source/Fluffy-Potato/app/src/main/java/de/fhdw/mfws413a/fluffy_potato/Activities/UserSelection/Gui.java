package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button mBtnCreateUser;
    private Spinner mSpSelectUser;
    private Button mBtnGoToFileSelection;
    private Button mBtnEditUser;

    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_userselection);

        // setting Gui Elements

        mBtnCreateUser = (Button) pActivity.findViewById(R.id.usrsel_btn_create);
        mSpSelectUser = (Spinner)pActivity.findViewById(R.id.usrsel_spinner_user);
        mBtnGoToFileSelection = (Button)pActivity.findViewById(R.id.usrsel_btn_next);
        mBtnEditUser = (Button)pActivity.findViewById(R.id.usrsel_btn_time);

    }

    // Methods (getter)

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

    // set Userlist into Spinner

    public void SetUsers(ArrayList<String> pUsers, Activity pActivity){

        // local Vars

        ArrayAdapter<String> lArrayAdapter;

        // logic

        lArrayAdapter = new ArrayAdapter<String>(pActivity, R.layout.spinner_layout, pUsers);
        mSpSelectUser.setAdapter(lArrayAdapter );

    }

}
