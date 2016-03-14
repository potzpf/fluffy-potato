package de.fhdw.mfws413a.fluffy_potato.ResponseRight;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.MyApp;
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

    public void onButtonNextChallengeClick(){
        System.out.println("Button Next Challenge Right clicked");

        ((MyApp) mData.getActivity().getApplication()).incCurrentChallengeIndex();
        switch (((MyApp) mData.getActivity().getApplication()).getCurrentChallenge().getChallengeTyp()){
            case Const.P_CHALLENGE_1OF3:
                Navigation.startActivityChallenge1Of3(mData.getActivity());
                break;
            case Const.P_CHALLENGE_IN:
                Navigation.startActivityChallengeInput(mData.getActivity());
                break;
            case Const.P_CHALLENGE_THINK:
                Navigation.startActivityChallengeThink(mData.getActivity());
                break;
        }
    }
}
