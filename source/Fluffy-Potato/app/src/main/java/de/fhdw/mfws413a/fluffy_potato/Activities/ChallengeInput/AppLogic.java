package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.setChallenge(mData.getCurrentChallenge());

    }

    // Methods

    public void onButtonAnswerInputClick(){

        if (mData.isAnswerRight(mGui.getEdAnswere().getText().toString())){

            Navigation.startActivityResponseRight(mData.getActivity());

        }else{

            Navigation.startActivityResponseFalse(mData.getActivity());

        }

    }

}
