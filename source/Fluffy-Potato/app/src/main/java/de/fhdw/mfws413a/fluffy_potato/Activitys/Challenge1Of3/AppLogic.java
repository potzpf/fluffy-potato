package de.fhdw.mfws413a.fluffy_potato.Activitys.Challenge1Of3;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

    }

    public void onButtonAnswerAClick(){
        System.out.println("Button Answer A clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }
    public void onButtonAnswerBClick(){
        System.out.println("Button Answer B clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }

    public void onButtonAnswerCClick() {
        System.out.println("Button Answer A clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }
}
