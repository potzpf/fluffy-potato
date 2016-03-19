package de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

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
        //get the Type of the first Challenge to decide on the Activity to start
        /*
        switch(gettype()) {
            case 1of3:
                Navigation.startActivityChallenge1Of3(mData.getActivity());
                break;
            case input:
                Navigation.startActivityChallengeInput(mData.getActivity());
                break;
            case think:
                Navigation.startActivityChallengeThink(mData.getActivity());
                break;
        }
        */
    }
}
