package de.fhdw.mfws413a.fluffy_potato.Activities.Score;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button mBtnToFiles;
    private TextView mTvGoal;
    private TextView mTvDone;
    private TextView mTvRight;
    private TextView mTvWrong;

    // constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_score);

        // setting Gui elements

        mBtnToFiles = (Button) pActivity.findViewById(R.id.scr_button_ToFile);
        mTvGoal = (TextView) pActivity.findViewById(R.id.scr_textView_titel);
        mTvDone = (TextView) pActivity.findViewById(R.id.scr_textView_answ2);
        mTvRight = (TextView) pActivity.findViewById(R.id.scr_textView_right2);
        mTvWrong = (TextView) pActivity.findViewById(R.id.scr_textView_wrong2);

    }

    // methods (getter)

    public Button getBtnToFiles() {

        return mBtnToFiles;

    }

    // methods (setter)

    public void setGoal(double pPercentage) {

        // making double to string with format

        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", decimalFormatSymbols);
        mTvGoal.setText(mTvGoal.getText() + decimalFormat.format(pPercentage * 100)+"%");

    }

    public void setDone(int pDone) {

        mTvDone.setText(Integer.toString(pDone));

    }

    public void setRight(int pRight) {

        mTvRight.setText(Integer.toString(pRight));

    }

    public void setWrong(int pWrong) {

        mTvWrong.setText(Integer.toString(pWrong));

    }

}
