package de.fhdw.mfws413a.fluffy_potato.ResponseFalse;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

    }

    public void onButtonNextChallengeClick(){
        System.out.println("Button Challenge Next Wrong clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }
}
