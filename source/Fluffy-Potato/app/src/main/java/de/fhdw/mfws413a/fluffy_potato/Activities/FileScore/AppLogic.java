package de.fhdw.mfws413a.fluffy_potato.Activities.FileScore;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;
import de.fhdw.mfws413a.fluffy_potato.R;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mData.makeFileData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(mData.getActivity(),
                R.layout.gridview, mData.getFileData());
        mGui.getmGvFile().setAdapter(adapter);

    }
}
