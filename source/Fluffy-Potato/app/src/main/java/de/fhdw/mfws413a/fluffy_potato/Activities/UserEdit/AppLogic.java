package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {
        mData = pData;
        mGui = pGui;
    }

    public void onButtonSaveClick(){
        //System.out.println("Button Start clicked");
        Navigation.startActivityFileSelection(mData.getActivity());
    }
}
