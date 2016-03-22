package de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.getmTvFile().setText(mData.getFileName());

        // seting Gui Elements From Data Klass

        mData.setQuestionCount(mGui);
        mData.setDueCount(mGui);

    }

    // methods

    public void onButtonBackClick(){

        Navigation.startActivityFileSelection(mData.getActivity());

    }

}
