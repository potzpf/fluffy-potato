package de.fhdw.mfws413a.fluffy_potato.Activities.Score;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.setGoal(mData.getPercentage());
        mGui.setDone(mData.getDone());
        mGui.setRight(mData.getRight());
        mGui.setWrong(mData.getWrong());

    }

    public void OnButtonStartClick(){
        //System.out.println("Button Start clicked");
        Navigation.startActivityFileSelection(mData.getActivity());
    }

    public void onButtonDetailClick() {
        Navigation.startActivityDetailScore(mData.getActivity());
    }
}
