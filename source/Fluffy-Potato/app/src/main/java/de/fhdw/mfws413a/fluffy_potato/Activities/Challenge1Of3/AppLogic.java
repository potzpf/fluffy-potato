package de.fhdw.mfws413a.fluffy_potato.Activities.Challenge1Of3;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.setChallenge(mData.getCurrentChallenge());

    }

    public void onButtonNextClick(){
        boolean answer = true;
        int ac= 0,bc= 0,cc= 0,ar= 0,br= 0,cr = 0;

        if (mGui.getCbAnswerA().isChecked()){ac=1;}
        if (mGui.getCbAnswerB().isChecked()){bc=1;}
        if (mGui.getCbAnswerC().isChecked()){cc=1;}
        if (mData.isRight(mGui.getCbAnswerA().getText().toString())){ar=1;}
        if (mData.isRight(mGui.getCbAnswerB().getText().toString())){br=1;}
        if (mData.isRight(mGui.getCbAnswerC().getText().toString())){cr=1;}
        System.out.println("Button Next in Challenge1of3 clicked");


        answer = ((ac == ar) && (bc == br) && (cc == cr));

        if (answer){
            Navigation.startActivityResponseRight(mData.getActivity());
        }else{
            Navigation.startActivityResponseFalse(mData.getActivity());
        }

    }
}
