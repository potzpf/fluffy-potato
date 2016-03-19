package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.setChallenge(mData.getCurrentChallenge());
    }

    public void onButtonAnswerInputClick(){
        System.out.println("Button Answer Input clicked");
        if (mData.isAnswerRight(mGui.getEdAnswere().getText().toString())){
            Navigation.startActivityResponseRight(mData.getActivity());
        }else{
            Navigation.startActivityResponseFalse(mData.getActivity());
        }
    }

}
