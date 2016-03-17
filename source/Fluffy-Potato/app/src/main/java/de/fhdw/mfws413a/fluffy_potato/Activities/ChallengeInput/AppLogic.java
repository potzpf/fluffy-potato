package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

    }

    public void onButtonAnswerInputClick(){
        System.out.println("Button Answer Input clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }

}
