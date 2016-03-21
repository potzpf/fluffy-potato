package de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit;

import de.fhdw.mfws413a.fluffy_potato.Navigation.Navigation;

public class AppLogic {

    //vars

    private Data mData;
    private Gui mGui;

    //Methods

    public AppLogic(Data pData, Gui pGui) {
        mData = pData;
        mGui = pGui;
        mGui.getEt_PC1().setText(mData.getTimespan(1,mGui.getSP_PC1()));
        mGui.getEt_PC2().setText(mData.getTimespan(2,mGui.getSP_PC2()));
        mGui.getEt_PC3().setText(mData.getTimespan(3,mGui.getSP_PC3()));
        mGui.getEt_PC4().setText(mData.getTimespan(4,mGui.getSP_PC4()));
        mGui.getEt_PC5().setText(mData.getTimespan(5,mGui.getSP_PC5()));
        mGui.getEt_PC6().setText(mData.getTimespan(6,mGui.getSP_PC6()));

    }

    public void OnButtonEditClick(){
        //System.out.println("Button Start clicked");
        mData.setTimespan(1, Integer.parseInt(mGui.getEt_PC1().getText().toString()),mGui.getSP_PC1().getSelectedItem().toString());
        mData.setTimespan(2, Integer.parseInt(mGui.getEt_PC2().getText().toString()),mGui.getSP_PC2().getSelectedItem().toString());
        mData.setTimespan(3, Integer.parseInt(mGui.getEt_PC3().getText().toString()),mGui.getSP_PC3().getSelectedItem().toString());
        mData.setTimespan(4, Integer.parseInt(mGui.getEt_PC4().getText().toString()),mGui.getSP_PC4().getSelectedItem().toString());
        mData.setTimespan(5, Integer.parseInt(mGui.getEt_PC5().getText().toString()),mGui.getSP_PC5().getSelectedItem().toString());
        mData.setTimespan(6, Integer.parseInt(mGui.getEt_PC6().getText().toString()),mGui.getSP_PC6().getSelectedItem().toString());
        Navigation.startActivityUserSelection(mData.getActivity(), "");
    }

    public void OnButtonDefaultClick() {
        //*default werte setzen
    }
}
