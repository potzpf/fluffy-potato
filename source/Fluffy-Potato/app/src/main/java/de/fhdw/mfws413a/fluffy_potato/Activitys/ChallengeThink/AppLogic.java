package de.fhdw.mfws413a.fluffy_potato.Activitys.ChallengeThink;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

    }

    public void onButtonAnswerThinkClick(){
        System.out.println("Button Answer Think clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }

}
