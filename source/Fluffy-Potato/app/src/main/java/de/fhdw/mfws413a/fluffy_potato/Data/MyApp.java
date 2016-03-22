package de.fhdw.mfws413a.fluffy_potato.Data;

import android.app.Application;
import java.util.ArrayList;
import de.fhdw.mfws413a.fluffy_potato.ApplicationLayer.ApplicationInterface;

public class MyApp extends Application {

    // Vars

    private ArrayList<Challenge> gCurrentChallengeList;
    private Integer gCurrentChallengeIndex;
    private ApplicationInterface gAppIF = new ApplicationInterface(this);
    private Integer gRightAnsweredCount;
    private String gActUser;

    // Methods (getter)

    public Challenge getCurrentChallenge(){

        return gCurrentChallengeList.get(gCurrentChallengeIndex);

    }

    public ApplicationInterface getAppIF() {

        return gAppIF;

    }

    public String getActUser() {

        return gActUser;

    }

    public String getCurrentChallengeType(){

        return getCurrentChallenge().getTyp();

    }

    public Integer getRightAnsweredCount() {

        return gRightAnsweredCount;

    }

    public Integer getDoneChallengesCount(){

        return gCurrentChallengeIndex;

    }

    public ArrayList<String> getUserNames() {

        // local vars

        ArrayList<String> lUserList;

        // logic

        gAppIF.init();
        lUserList = gAppIF.getUserNames();
        for (int i = 0; i < lUserList.size() ; i++) {

            if (lUserList.get(i).equals("default")) {

                lUserList.remove(i);

            }

        }
        return lUserList;

    }

    public int getCurrentChallengeCount() {

        return gCurrentChallengeList.size();

    }

    // Methods (setter)

    public void setActUser(String pActUser) {

        gActUser = pActUser;

    }

    public void setChallengeList(String pFile) {

        gCurrentChallengeList = gAppIF.getDueChallenges(gActUser,pFile);
        gCurrentChallengeIndex = 0;
        gRightAnsweredCount = 0;

    }

    // Methods (incer)

    public void incRightAnsweredCount(){

        gRightAnsweredCount++;

    }

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

    // put challenge in next progress class

    public void pushChallenge() {

        gAppIF.pushChallenge(gActUser, getCurrentChallenge().getChallengeID());

    }

    // put challenge in lower progress class

    public void dropChallenge() {

        gAppIF.dropChallenge(gActUser, getCurrentChallenge().getChallengeID());

    }

}
