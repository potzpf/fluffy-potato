package de.fhdw.mfws413a.fluffy_potato.UserSelection;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnCreateUser;
    private Spinner mSpSelectUser;
    private Button mBtnGoToFileSelection;

    //methods

    public Gui(Activity pActivity) {
        pActivity.setContentView(R.layout.activity_userselection);
        mBtnCreateUser = (Button) pActivity.findViewById(R.id.usrsel_btn_create);
        mSpSelectUser = (Spinner)pActivity.findViewById(R.id.usrsel_spinner_user);
        mBtnGoToFileSelection = (Button)pActivity.findViewById(R.id.usrsel_btn_select);

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

    public void SetUsers(ArrayList<String> pUsers, Activity pActivity){

        ArrayAdapter<String> lArrayAdapter;

        mSpSelectUser.setAdapter(lArrayAdapter = new ArrayAdapter<String>(pActivity,
                        R.layout.activity_userselection,
                        pUsers)
        );


    }
}
