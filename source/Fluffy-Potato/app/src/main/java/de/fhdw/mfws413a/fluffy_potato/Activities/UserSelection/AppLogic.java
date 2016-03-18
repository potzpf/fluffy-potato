package de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection;

import android.widget.Toast;

import java.util.ArrayList;

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
        Toast.makeText(mData.getActivity().getApplicationContext(),mData.getActUser(),Toast.LENGTH_LONG).show();
        System.out.println("Button Go To File Selection clicked" + mData.getActUser());
        Navigation.startActivityFileSelection(mData.getActivity());
    }

    public void onButtonEditUserClick() {
        System.out.println("Button Edit User clicked");
        Navigation.startActivityUserEdit(mData.getActivity());
    }
}
