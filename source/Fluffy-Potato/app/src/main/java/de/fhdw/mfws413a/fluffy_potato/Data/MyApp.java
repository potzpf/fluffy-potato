package de.fhdw.mfws413a.fluffy_potato.Data;

import android.app.Application;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.ApplicationLayer.ApplicationInterface;
import de.fhdw.mfws413a.fluffy_potato.Data.*;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.ApplicationLayer.ApplicationInterface;

public class MyApp extends Application {

    private ArrayList<Challenge> gCurrentChallengeList;
    private Integer gCurrentChallengeIndex;
    private ApplicationInterface gAppIF = new ApplicationInterface(this);
    private Integer gRightAnsweredCount;
    private String gActUser;

    public boolean incCurrentChallengeIndex(){
        if (gCurrentChallengeIndex +1 == gCurrentChallengeList.size()){
            gCurrentChallengeIndex++;
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

    public void setChallengeList(String pFile) {
        gCurrentChallengeList = gAppIF.getDueChallenges(gActUser,pFile);
        gCurrentChallengeIndex = 0;
        gRightAnsweredCount = 0;
    }

    public String getCurrentChallengeType(){

        return getCurrentChallenge().getTyp();
    }

    public void incRightAnsweredCount(){

        gRightAnsweredCount++;
    }

    public Integer getRightAnsweredCount() {

        return gRightAnsweredCount;
    }

    public Integer getDoneChallengesCount(){

        return gCurrentChallengeIndex;
    }
}
