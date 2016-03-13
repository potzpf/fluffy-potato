package de.fhdw.mfws413a.fluffy_potato;

import android.app.Application;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.*;
import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;

/**
 * Created by Dome-FH on 13.03.2016.
 */
public class MyApp extends Application {



    private ArrayList<de.fhdw.mfws413a.fluffy_potato.Data.Challenge> gCurrentChallengeList;
    private Integer gCurrentChallengeIndex;

    public void incCurrentChallengeIndex(){
        gCurrentChallengeIndex++;
    }

    public Challenge getCurrentChallenge(){
        return gCurrentChallengeList.get(gCurrentChallengeIndex);
    }
}
