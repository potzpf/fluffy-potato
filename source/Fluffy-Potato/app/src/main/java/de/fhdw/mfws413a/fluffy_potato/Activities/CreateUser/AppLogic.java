package de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser;

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

    public void onButtonCreateUserClick(){
        mData.setUser(mGui.getEdUsername().getText().toString());
        System.out.println("Button Create New User clicked");
        Navigation.startActivityUserSelection(mData.getActivity(),mData.getUser());
    }

}
