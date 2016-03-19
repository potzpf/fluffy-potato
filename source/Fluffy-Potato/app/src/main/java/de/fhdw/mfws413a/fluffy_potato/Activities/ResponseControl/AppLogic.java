package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl;

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
        mGui.getTvRightAnsweres().setText(mData.getRightAnswereText());

    }

    public void onButtonAnswerRightClick(){
        System.out.println("Button Answer Right clicked");
        mData.incRightAnsweredCount();
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

    public void onButtonAnswerWrongClick(){
        System.out.println("Button Answer Wrong clicked");
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

    private void nextChallenge() {
        if ( mData.Global.incCurrentChallengeIndex() ) {

            switch (mData.Global.getCurrentChallenge().getTyp()) {
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
