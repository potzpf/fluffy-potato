package de.fhdw.mfws413a.fluffy_potato.Activities.ResponseRight;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;


    }

    // methods

    public void onButtonNextChallengeClick(){

        mData.incRightAnswerdCount();

        // put challenge in next progress class

        mData.pushChallenge();

        // tests if index is incable and incs it

        if ( mData.incCurrentChallengeIndex() ) {

            // decision for challenge type

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
