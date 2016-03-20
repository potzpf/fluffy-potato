package de.fhdw.mfws413a.fluffy_potato.Navigation;

import android.app.Activity;
import android.content.Intent;

import de.fhdw.mfws413a.fluffy_potato.Data.Const;

/**
 * Created by cmoeller on 01.03.2016.
 */
public class Navigation {

    public static void startActivityUserSelection(Activity callingActivity, String pUser){

        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection.Init.class);
        intent.putExtra(Const.P_USER_List, pUser);

        callingActivity.startActivity(intent);
        callingActivity.finish();

    }
    public static void startActivityCreateUser(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser.Init.class);

        callingActivity.startActivity(intent);
    }
    public static void startActivityFileSelection(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection.Init.class);

        callingActivity.startActivity(intent);

    }
    public static void startActivityChallenge1Of3 (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.Challenge1Of3.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityChallengeInput (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityChallengeThink (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityResponseFalse (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ResponseFalse.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityResponseRight (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ResponseRight.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityResponseControl (Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityDetailScore(Activity callingActivity,String pSelectedsFile) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore.Init.class);
        intent.putExtra(Const.P_SELECTED_FILE, pSelectedsFile);
        callingActivity.startActivity(intent);

    }
    public static void startActivityScore(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.Score.Init.class);

        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
    public static void startActivityUserEdit(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit.Init.class);

        callingActivity.startActivity(intent);

    }

    public static void startActivityFileScore(Activity callingActivity) {
        Intent intent = new Intent(callingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.FileScore.Init.class);
        callingActivity.startActivity(intent);
        callingActivity.finish();

    }
}
