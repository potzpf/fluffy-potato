package de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    // Vars

    private Button mBtnNext;
    private Button mBtnDeatil;
    private Button mBtnStats;
    private ListView mListViewFiles;

    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_fileselection);

        // setting Gui elements

        mBtnNext = (Button) pActivity.findViewById(R.id.btn_start_challenge);
        mBtnDeatil = (Button) pActivity.findViewById(R.id.btn_detail_challenge);
        mBtnStats = (Button) pActivity.findViewById(R.id.btn_stats_challenge);
        mListViewFiles = (ListView)pActivity.findViewById(R.id.listView_fileSelection);

    }

    // methods (getter)

    public Button getBtnNext() {

        return mBtnNext;

    }

    public ListView getListViewFiles() {

        return mListViewFiles;

    }

    public Button getBtnDeatil(){

        return mBtnDeatil;

    }

    public Button getBtnStats() {

        return mBtnStats;

    }

    // seting listview elements with ArrayAdapter

    public void setFilesList(ArrayList<String> pFiles, Activity pActivity){

        // local vars

        ArrayAdapter<String> lArrayAdapter;

        // logic

        lArrayAdapter = new ArrayAdapter<String>(pActivity,
                                                 R.layout.listview_item, pFiles);
        mListViewFiles.setAdapter(lArrayAdapter );

    }

}
