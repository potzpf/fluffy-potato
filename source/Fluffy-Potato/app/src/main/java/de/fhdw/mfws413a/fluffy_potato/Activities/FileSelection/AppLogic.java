package de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection;

import android.widget.Toast;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;
        mGui.setFilesList(mData.getFiles(), mData.getActivity());

    }

    public void onButtonStartChallengeClick(){
        System.out.println("Button start Challenge clicked");
        if (mData.getSelectedFile().equals("")){
            Toast.makeText(mData.getActivity().getApplicationContext(),"keine Kartei Ausgewählt", Toast.LENGTH_LONG).show();
        } else {
            mData.buildChallengeList(mData.getSelectedFile());
            if (mData.getDuePerFile(mData.getSelectedFile()) > 0) {
                switch (mData.GetCurrentChallengeTyp()) {
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
                Toast.makeText(mData.getActivity().getApplicationContext(),"keine fälligen Aufgaben für "+mData.getSelectedFile(),
                               Toast.LENGTH_LONG).show();
            }

        }
    }

    public void setSelectedFile(String pSelectedFiel) {
        mData.setSelectedFile(pSelectedFiel);
    }
}
