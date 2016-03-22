package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // Vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.setChallenge(mData.getCurrentChallenge());

    }

    //Methods

    public void onButtonAnswerThinkClick(){

        System.out.println("Button Answer Think clicked");
        Navigation.startActivityResponseControl(mData.getActivity());

    }

}
