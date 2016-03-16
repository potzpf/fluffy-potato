package de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseControl;

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
        //Navigation.startActivityUserSelection(mData.getActivity());
    }

    public void onButtonAnswerWrongClick(){
        System.out.println("Button Answer Wrong clicked");
        //Navigation.startActivityUserSelection(mData.getActivity());
    }
}
