package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button   mBtn_Edit;
    private Button   mBtn_Default;
    private Spinner  mSP_PC1;
    private Spinner  mSP_PC2;
    private Spinner  mSP_PC3;
    private Spinner  mSP_PC4;
    private Spinner  mSP_PC5;
    private Spinner  mSP_PC6;
    private EditText mEt_PC1;
    private EditText mEt_PC2;
    private EditText mEt_PC3;
    private EditText mEt_PC4;
    private EditText mEt_PC5;
    private EditText mEt_PC6;

    // Constructor

    public Gui(Activity pActivity) {

        // local vars
        ArrayList<String> lTimeUnits;

        // logic

         // making unit spinner elements

        lTimeUnits = new ArrayList<>();
        lTimeUnits.add("min");
        lTimeUnits.add("hour");
        lTimeUnits.add("day");

        pActivity.setContentView(R.layout.activity_useredit);

        // setting Gui Elements

        mBtn_Edit = (Button) pActivity.findViewById(R.id.usredt_btn_edit);
        mBtn_Default = (Button) pActivity.findViewById(R.id.usredt_btn_default);
        mEt_PC1 = (EditText) pActivity.findViewById(R.id.usredt_editText_ph1);
        mEt_PC2 = (EditText) pActivity.findViewById(R.id.usredt_editText_ph2);
        mEt_PC3 = (EditText) pActivity.findViewById(R.id.usredt_editText_ph3);
        mEt_PC4 = (EditText) pActivity.findViewById(R.id.usredt_editText_ph4);
        mEt_PC5 = (EditText) pActivity.findViewById(R.id.usredt_editText_ph5);
        mEt_PC6 = (EditText) pActivity.findViewById(R.id.usredt_editText_ph6);
        mSP_PC1 = (Spinner) pActivity.findViewById(R.id.usredt_spinner_ph1);
        mSP_PC2 = (Spinner) pActivity.findViewById(R.id.usredt_spinner_ph2);
        mSP_PC3 = (Spinner) pActivity.findViewById(R.id.usredt_spinner_ph3);
        mSP_PC4 = (Spinner) pActivity.findViewById(R.id.usredt_spinner_ph4);
        mSP_PC5 = (Spinner) pActivity.findViewById(R.id.usredt_spinner_ph5);
        mSP_PC6 = (Spinner) pActivity.findViewById(R.id.usredt_spinner_ph6);

        // seting Unit elements in spinners

        ArrayAdapter<String> lArrayAdapter = new ArrayAdapter<String>(pActivity,
                                                                 R.layout.spinner_layout,
                                                                 lTimeUnits);
        mSP_PC1.setAdapter(lArrayAdapter );
        mSP_PC2.setAdapter(lArrayAdapter );
        mSP_PC3.setAdapter(lArrayAdapter );
        mSP_PC4.setAdapter(lArrayAdapter );
        mSP_PC5.setAdapter(lArrayAdapter );
        mSP_PC6.setAdapter(lArrayAdapter );

    }

    // Methods (getter)

    public Button getBtn_Edit() {

        return mBtn_Edit;

    }

    public Spinner getSP_PC1() {

        return mSP_PC1;

    }

    public Spinner getSP_PC2() {

        return mSP_PC2;

    }

    public Spinner getSP_PC3() {

        return mSP_PC3;

    }

    public Spinner getSP_PC4() {

        return mSP_PC4;

    }

    public Spinner getSP_PC5() {

        return mSP_PC5;

    }

    public Spinner getSP_PC6() {

        return mSP_PC6;

    }

    public EditText getEt_PC1() {

        return mEt_PC1;

    }

    public EditText getEt_PC2() {

        return mEt_PC2;

    }

    public EditText getEt_PC3() {

        return mEt_PC3;

    }

    public EditText getEt_PC4() {

        return mEt_PC4;

    }

    public EditText getEt_PC5() {

        return mEt_PC5;

    }

    public EditText getEt_PC6() {

        return mEt_PC6;

    }

    public Button getBtn_Default() {

        return mBtn_Default;

    }

}
