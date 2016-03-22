package de.fhdw.mfws413a.fluffy_potato.Activities.FileScore;

import android.widget.ArrayAdapter;
import de.fhdw.mfws413a.fluffy_potato.R;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        // local vars

        ArrayAdapter<String> lAdapter;

        //logic

        mData = pData;
        mGui = pGui;

        // loading file data

        mData.makeFileData();

        // setting file data with Arrayadapter to gridview

        lAdapter = new ArrayAdapter<String>(mData.getActivity(),
                                            R.layout.gridview, mData.getFileData());
        mGui.getmGvFile().setAdapter(lAdapter);

    }

}
