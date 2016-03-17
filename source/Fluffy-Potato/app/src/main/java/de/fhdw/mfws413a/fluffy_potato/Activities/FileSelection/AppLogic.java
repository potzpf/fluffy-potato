package de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

    }

    public void onButtonStartChallengeClick(){
        System.out.println("Button start Challenge clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }
}
