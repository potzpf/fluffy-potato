package de.fhdw.mfws413a.fluffy_potato.CreateUser;

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
        System.out.println("Button Create New User clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }

}
