package de.fhdw.mfws413a.fluffy_potato.Activities.Score;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

        // fill gui elements with data

        mGui.setGoal(mData.getPercentage());
        mGui.setDone(mData.getDone());
        mGui.setRight(mData.getRight());
        mGui.setWrong(mData.getWrong());

    }

    // methods

    public void onButtonStartClick(){

        Navigation.startActivityFileSelection(mData.getActivity());

        // end this activity

        mData.getActivity().finish();

    }

}
