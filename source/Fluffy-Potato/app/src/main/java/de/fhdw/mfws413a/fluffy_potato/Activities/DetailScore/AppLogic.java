package de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.getmTvFile().setText(mData.getFileName());
    }

    public void onButtonBackClick(){
        System.out.println("Button Back clicked");
        Navigation.startActivityFileSelection(mData.getActivity());
    }
}
