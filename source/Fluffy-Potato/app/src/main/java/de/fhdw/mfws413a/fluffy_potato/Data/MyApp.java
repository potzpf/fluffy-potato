package de.fhdw.mfws413a.fluffy_potato.Data;

import android.app.Application;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.*;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;

public class MyApp extends Application {

    private ArrayList<de.fhdw.mfws413a.fluffy_potato.Data.Challenge> gCurrentChallengeList;
    private Integer gCurrentChallengeIndex;
    private String gActUser;

    public boolean incCurrentChallengeIndex(){
        if (gCurrentChallengeIndex +1 == gCurrentChallengeList.size()-1){
            return false;
        }
        else{
            gCurrentChallengeIndex++;
            return true;
        }
    }

    public Challenge getCurrentChallenge(){
        return gCurrentChallengeList.get(gCurrentChallengeIndex);
    }
}
