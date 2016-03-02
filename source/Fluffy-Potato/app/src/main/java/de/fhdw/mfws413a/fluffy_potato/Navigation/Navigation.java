package de.fhdw.mfws413a.fluffy_potato.Navigation;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by cmoeller on 01.03.2016.
 */
public class Navigation {

    public static void startActivityUserSelection(Activity callingActivity){
        /* Parameter
        Activity callingActivity,
        int currentChallengeId,
        int numberOfCorrectChallenges,
        int numberOfAnsweredChallenges
         */


        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.UserSelection.Init.class);
        //intent.putExtra(Constants.KEY_PARAM_CURRENT_CHALLENGE_ID, currentChallengeId);
        //intent.putExtra(Constants.KEY_PARAM_NUMBER_OF_ANSWERED_CHALLENGES, numberOfAnsweredChallenges);
        //intent.putExtra(Constants.KEY_PARAM_NUMBER_OF_CORRECT_CHALLENGES, numberOfCorrectChallenges);

        callingActivity.startActivity(intent);
        //callingActivity.finish();

    }
    public static void startActivityCreateUser(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.CreateUser.Init.class);

        callingActivity.startActivity(intent);
        //callingActivity.finish();
    }

    public static void startActivityChallenge1Of3 () {

    }

    public static void startActivityChallengeInput () {

    }

    public static void startActivityChallengeThink () {

    }
    public static void startActivityResponseFalse () {

    }

    public static void startActivityResponseRight () {

    }

    public static void startActivityResponseControl () {

    }
}
