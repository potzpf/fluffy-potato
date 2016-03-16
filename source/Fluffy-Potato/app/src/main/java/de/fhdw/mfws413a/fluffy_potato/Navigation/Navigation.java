package de.fhdw.mfws413a.fluffy_potato.Navigation;

import android.app.Activity;
import android.content.Intent;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;

/**
 * Created by cmoeller on 01.03.2016.
 */
public class Navigation {

    public static void startActivityUserSelection(Activity callingActivity, String pUser){
        /* Parameter
        Activity callingActivity,
        int currentChallengeId,
        int numberOfCorrectChallenges,
        int numberOfAnsweredChallenges
         */


        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.UserSelection.Init.class);
        intent.putExtra(Const.P_USER_List, pUser);
        //intent.putExtra(Constants.KEY_PARAM_NUMBER_OF_ANSWERED_CHALLENGES, numberOfAnsweredChallenges);
        //intent.putExtra(Constants.KEY_PARAM_NUMBER_OF_CORRECT_CHALLENGES, numberOfCorrectChallenges);

        callingActivity.startActivity(intent);
        callingActivity.finish();

    }
    public static void startActivityCreateUser(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.CreateUser.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }

    public static void startActivityFileSelection(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.FileSelection.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }

    public static void startActivityChallenge1Of3 (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.Challenge1Of3.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }

    public static void startActivityChallengeInput (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.ChallengeInput.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }

    public static void startActivityChallengeThink (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.ChallengeThink.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityResponseFalse (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseFalse.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }

    public static void startActivityResponseRight (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseRight.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }

    public static void startActivityResponseControl (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activitys.ResponseControl.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
}
