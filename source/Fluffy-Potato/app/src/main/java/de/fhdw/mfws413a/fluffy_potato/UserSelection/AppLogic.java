package de.fhdw.mfws413a.fluffy_potato.UserSelection;

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

    public void onButtonCreateNewUserClick(){
        System.out.println("Button Create User clicked");
        Navigation.startActivityCreateUser(mData.getActivity());
        //Navigation.startActivityUserSelection(mData.getActivity());


    }
    public void onButtonGoToFileSelectionClick(){
        System.out.println("Button Go To File Selection clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());


    }
}
