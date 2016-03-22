package de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser;

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

    // Methods

    public void onButtonCreateUserClick(){

        mData.setUser(mGui.getEdUsername().getText().toString());
        Navigation.startActivityUserSelection(mData.getActivity(),mData.getUser());

    }

}
