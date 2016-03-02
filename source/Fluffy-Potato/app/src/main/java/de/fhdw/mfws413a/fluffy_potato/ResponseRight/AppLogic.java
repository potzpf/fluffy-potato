package de.fhdw.mfws413a.fluffy_potato.ResponseRight;

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
        System.out.println("Button Next Challenge Right clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }
}
