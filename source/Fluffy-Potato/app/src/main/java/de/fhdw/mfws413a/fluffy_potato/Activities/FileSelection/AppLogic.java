package de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection;

import android.widget.Toast;
import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    // vars

    private Data mData;
    private Gui mGui;

    // Constructor

    public AppLogic(Data pData, Gui pGui) {

        mData = pData;
        mGui = pGui;

        // filling Gui Elements with Data

        mGui.setFilesList(mData.getFiles(), mData.getActivity());

    }

    // Methods

    public void onButtonStartChallengeClick(){

        // test if a file is selected

        if (mData.getSelectedFile().equals("")){

            Toast.makeText(mData.getActivity().getApplicationContext(),
                           "keine Kartei Ausgew�hlt",
                           Toast.LENGTH_LONG).show();

        } else {

            // load due challengelist

            mData.buildChallengeList(mData.getSelectedFile());

            // test if ther are due files

            if (mData.getCurrentChallengeCount() > 0) {

                // decision for challengetyp

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

                Toast.makeText(mData.getActivity().getApplicationContext(),
                               "keine fälligen Aufgaben für "+mData.getSelectedFile(),
                               Toast.LENGTH_LONG).show();

            }

        }

    }

    public void setSelectedFile(String pSelectedFiel) {

        mData.setSelectedFile(pSelectedFiel);

    }

    public void onButtonDetailClick() {

        // test if a file is selected

        if (mData.getSelectedFile().equals("")) {

            Toast.makeText(mData.getActivity().getApplicationContext(),"keine Kartei Ausgew�hlt", Toast.LENGTH_LONG).show();

        }else{

            Navigation.startActivityDetailScore(mData.getActivity(), mData.getSelectedFile());

        }

    }

    public void onButtonFileClick(){

        Navigation.startActivityFileScore(mData.getActivity());

    }

}
