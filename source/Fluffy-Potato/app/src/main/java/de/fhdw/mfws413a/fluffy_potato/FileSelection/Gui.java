package de.fhdw.mfws413a.fluffy_potato.FileSelection;

import android.app.Activity;
import android.widget.Button;
import android.widget.ListView;

import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //Vars

    private Button mBtnNext;
    private ListView mListViewFiles;

    //methods

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_fileselection);
        mBtnNext = (Button) pActivity.findViewById(R.id.btn_start_challenge);
        mListViewFiles = (ListView)pActivity.findViewById(R.id.listView_fileSelection);

    }

    public Button getBtnNext() {
        return mBtnNext;
    }

    public ListView getListViewFiles() {
        return mListViewFiles;
    }
}
