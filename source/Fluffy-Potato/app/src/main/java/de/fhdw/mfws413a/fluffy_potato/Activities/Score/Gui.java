package de.fhdw.mfws413a.fluffy_potato.Activities.Score;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtn_ToFiles;
    private TextView mTv_Goal;
    private TextView mTv_Done;
    private TextView mTv_Right;
    private TextView mTv_Wrong;



    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_score);
        mBtn_ToFiles = (Button) pActivity.findViewById(R.id.scr_button_ToFile);
        mTv_Goal = (TextView) pActivity.findViewById(R.id.scr_textView_titel);
        mTv_Done = (TextView) pActivity.findViewById(R.id.scr_textView_answ2);
        mTv_Right = (TextView) pActivity.findViewById(R.id.scr_textView_right2);
        mTv_Wrong = (TextView) pActivity.findViewById(R.id.scr_textView_wrong2);

    }

    public Button getmBtn_ToFiles() {
        return mBtn_ToFiles;
    }

    public TextView getmTv_Goal() {
        return mTv_Goal;
    }

    public TextView getmTv_Done() {
        return mTv_Done;
    }

    public TextView getmTv_Right() {
        return mTv_Right;
    }

    public TextView getmTv_Wrong() {
        return mTv_Wrong;
    }

    public void setGoal(double pPercentage) {

        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", decimalFormatSymbols);
        mTv_Goal.setText(mTv_Goal.getText() + decimalFormat.format(pPercentage * 100)+"%");
    }

    public void setDone(int pDone) {
        mTv_Done.setText(Integer.toString(pDone));
    }

    public void setRight(int pRight) {
        mTv_Right.setText(Integer.toString(pRight));
    }

    public void setWrong(int pWrong) {
        mTv_Wrong.setText(Integer.toString(pWrong));
    }
}
