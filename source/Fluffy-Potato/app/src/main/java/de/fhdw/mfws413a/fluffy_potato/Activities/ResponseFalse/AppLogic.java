package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseFalse;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.getTvRightAnswers().setText(mData.getRightAnswerText());

    }

    public void onButtonNextChallengeClick(){
        System.out.println("Button Challenge Next Wrong clicked");
        if ( mData.incCurrentChallengeIndex() ) {

            switch (mData.getCurrentChallenge().getTyp()) {
                case Const.P_CHALLENGE_XOF3:
                    Navigation.startActivityChallenge1Of3(mData.getActivity());
                    break;
                case Const.P_CHALLENGE_IN:
                    Navigation.startActivityChallengeInput(mData.getActivity());
                    break;
                case Const.P_CHALLENGE_THINK:
                    Navigation.startActivityChallengeThink(mData.getActivity());
                    break;
            }
        }else{
            Navigation.startActivityScore(mData.getActivity());
        }
    }
}
