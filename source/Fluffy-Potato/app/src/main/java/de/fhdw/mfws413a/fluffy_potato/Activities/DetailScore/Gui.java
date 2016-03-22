package de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private TextView mTvFile;
    private TextView mTvQuestion1;
    private TextView mTvQuestion2;
    private TextView mTvQuestion3;
    private TextView mTvQuestion4;
    private TextView mTvQuestion5;
    private TextView mTvQuestion6;
    private TextView mTvDue1;
    private TextView mTvDue2;
    private TextView mTvDue3;
    private TextView mTvDue4;
    private TextView mTvDue5;
    private TextView mTvDue6;


    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_detailscore);

        // setting GUI elements

        mTvFile      = (TextView) pActivity.findViewById(R.id.det_textView_name);
        mTvQuestion1 = (TextView) pActivity.findViewById(R.id.det_textView_frage1);
        mTvQuestion2 = (TextView) pActivity.findViewById(R.id.det_textView_frage2);
        mTvQuestion3 = (TextView) pActivity.findViewById(R.id.det_textView_frage3);
        mTvQuestion4 = (TextView) pActivity.findViewById(R.id.det_textView_frage4);
        mTvQuestion5 = (TextView) pActivity.findViewById(R.id.det_textView_frage5);
        mTvQuestion6 = (TextView) pActivity.findViewById(R.id.det_textView_frage6);
        mTvDue1      = (TextView) pActivity.findViewById(R.id.det_textView_faellig1);
        mTvDue2      = (TextView) pActivity.findViewById(R.id.det_textView_faellig2);
        mTvDue3      = (TextView) pActivity.findViewById(R.id.det_textView_faellig3);
        mTvDue4      = (TextView) pActivity.findViewById(R.id.det_textView_faellig4);
        mTvDue5      = (TextView) pActivity.findViewById(R.id.det_textView_faellig5);
        mTvDue6      = (TextView) pActivity.findViewById(R.id.det_textView_faellig6);

    }

    // Methods (getter)

    public TextView getmTvFile() {

        return mTvFile;

    }

    public TextView getmTvQuestion1() {

        return mTvQuestion1;

    }

    public TextView getmTvQuestion2() {

        return mTvQuestion2;

    }

    public TextView getmTvQuestion3() {

        return mTvQuestion3;

    }

    public TextView getmTvQuestion4() {

        return mTvQuestion4;

    }

    public TextView getmTvQuestion5() {

        return mTvQuestion5;
    }

    public TextView getmTvQuestion6() {

        return mTvQuestion6;

    }

    public TextView getmTvDue1() {

        return mTvDue1;

    }

    public TextView getmTvDue2() {

        return mTvDue2;

    }

    public TextView getmTvDue3() {

        return mTvDue3;

    }

    public TextView getmTvDue4() {

        return mTvDue4;

    }

    public TextView getmTvDue5() {

        return mTvDue5;

    }

    public TextView getmTvDue6() {

        return mTvDue6;

    }

}
