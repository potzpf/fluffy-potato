package de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink;

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
        //ckeck if answer is right or wrong to navigate to the corresponding Activity
       /* switch(isAnswerRight()){
            case true:
                Navigation.startActivityResponseRight(mData.getActivity());
                break;
            case false:
                Navigation.startActivityResponseFalse(mData.getActivity());
                break;
        } */
    }

}
