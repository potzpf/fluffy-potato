package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

        // fill Gui elements with Data

        mGui.SetUsers(mData.getUsers(),mData.getActivity());

    }

    // Methods

    public void onButtonCreateNewUserClick(){

        Navigation.startActivityCreateUser(mData.getActivity());

    }

    public void onButtonGoToFileSelectionClick() {

        mData.setActUser(mGui.getSpSelectUser().getSelectedItem().toString());
        Navigation.startActivityFileSelection(mData.getActivity());

    }

    public void onButtonEditUserClick() {

        mData.setActUser(mGui.getSpSelectUser().getSelectedItem().toString());
        Navigation.startActivityUserEdit(mData.getActivity());

    }

}
