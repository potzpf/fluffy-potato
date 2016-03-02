package de.fhdw.mfws413a.fluffy_potato.UserSelection;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button  mBtn_GoToFileSelection;
    private Button  mBtn_CreateNewUser;
    private Spinner mSp_SelecUser;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_main);

        mBtn_GoToFileSelection = (Button)  pActivity.findViewById(R.id.main_btn_start);
        mBtn_CreateNewUser =     (Button)  pActivity.findViewById(R.id.usrsel_btn_create);
        mSp_SelecUser =          (Spinner) pActivity.findViewById(R.id.usrsel_spinner_user);

    }

    public Button getBtn_GoToFileSelection() {
        return mBtn_GoToFileSelection;
    }

    public Button getBtn_CreateNewUser() {
        return mBtn_CreateNewUser;
    }

    public Spinner getSp_SelecUser() {
        return mSp_SelecUser;
    }

    public void SetUsers(ArrayList<String> pUsers, Activity pActivity){

        ArrayAdapter<String> lArrayAdapter;

        mSp_SelecUser.setAdapter(lArrayAdapter = new ArrayAdapter<String>(pActivity,
                                                                          R.layout.activity_userselection,
                                                                          pUsers)
                                );

    }
}
