package de.fhdw.mfws413a.fluffy_potato.Data;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.ApplicationLayer.ApplicationInterface;
import de.fhdw.mfws413a.fluffy_potato.Data.*;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;

public class MyApp extends Application {

    private ArrayList<de.fhdw.mfws413a.fluffy_potato.Data.Challenge> gCurrentChallengeList;
    private Integer gCurrentChallengeIndex;
    private ApplicationInterface gAppIF = new ApplicationInterface(this);
    private String gActUser;


    public boolean incCurrentChallengeIndex(){
        if (gCurrentChallengeIndex +1 == gCurrentChallengeList.size()-1){
            return false;
        }
        else {
            gCurrentChallengeIndex++;
            return true;
        }
    }


    public Challenge getCurrentChallenge(){
        return gCurrentChallengeList.get(gCurrentChallengeIndex);
    }

    public ApplicationInterface getAppIF() {
        return gAppIF;
    }

    public String getActUser() {
        return gActUser;
    }

    public void setActUser(String pActUser) {
        gActUser = pActUser;
    }
}
