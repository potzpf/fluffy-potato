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
        mGui.SetUsers(mData.getUsers(),mData.getActivity());

    }

    public void onButtonCreateNewUserClick(){
        System.out.println("Button Create User clicked");
        Navigation.startActivityCreateUser(mData.getActivity());
    }

    public void onButtonGoToFileSelectionClick() {
        mData.setActUser(mGui.getSpSelectUser().getSelectedItem().toString());
        System.out.println("Button Go To File Selection clicked"+mData.getActUser());
        Navigation.startActivityFileSelection(mData.getActivity());
    }
}
