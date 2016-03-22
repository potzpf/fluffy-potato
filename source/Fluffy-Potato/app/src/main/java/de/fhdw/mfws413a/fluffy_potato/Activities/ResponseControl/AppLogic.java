package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.getTvRightAnsweres().setText(mData.getRightAnswereText());

    }

    // methods

    public void onButtonAnswerRightClick(){

        mData.incRightAnsweredCount();
        mData.pushChallenge();
        nextChallenge();

    }

    public void onButtonAnswerWrongClick(){

        mData.dropChallenge();
        nextChallenge();

    }

    private void nextChallenge() {

        // tests if index is incable and incs it

        if ( mData.incCurrentChallengeIndex() ) {

            // decision for challengetype

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
