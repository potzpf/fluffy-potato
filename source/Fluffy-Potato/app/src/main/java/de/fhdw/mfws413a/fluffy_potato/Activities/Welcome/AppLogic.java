package de.fhdw.mfws413a.fluffy_potato.Activities.Welcome;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

    }

    // methods

    public void onButtonStartClick(){

        Navigation.startActivityUserSelection(mData.getActivity(),"");

    }

}
