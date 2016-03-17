package de.fhdw.mfws413a.fluffy_potato.Activities.Challenge1Of3;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

    }

    public void onButtonNextClick(){
        System.out.println("Button Next in Challenge1of3 clicked");
       /* switch(answer){
            case answer == true:
                Navigation.startActivityResponseRight(mData.getActivity());
                break;
            case answer == false:
                Navigation.startActivityResponseFalse(mData.getActivity());
                break;
        } */
    }
}
