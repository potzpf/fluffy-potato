package de.fhdw.mfws413a.fluffy_potato.Navigation;

import android.app.Activity;
import android.content.Intent;
import de.fhdw.mfws413a.fluffy_potato.Data.Const;

public class Navigation {

    public static void startActivityUserSelection(Activity pCallingActivity, String pUser){

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.UserSelection.Init.class);
        intent.putExtra(Const.P_USER_LIST, pUser);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityCreateUser(Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.CreateUser.Init.class);
        pCallingActivity.startActivity(intent);

    }

    public static void startActivityFileSelection(Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.FileSelection.Init.class);
        pCallingActivity.startActivity(intent);

    }

    public static void startActivityChallenge1Of3 (Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.Challenge1Of3.Init.class);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityChallengeInput (Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeInput.Init.class);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityChallengeThink (Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ChallengeThink.Init.class);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityResponseFalse (Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ResponseFalse.Init.class);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityResponseRight (Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ResponseRight.Init.class);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityResponseControl (Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.ResponseControl.Init.class);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityDetailScore(Activity pCallingActivity,String pSelectedsFile) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.DetailScore.Init.class);
        intent.putExtra(Const.P_SELECTED_FILE, pSelectedsFile);
        pCallingActivity.startActivity(intent);

    }

    public static void startActivityScore(Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.Score.Init.class);
        pCallingActivity.startActivity(intent);
        pCallingActivity.finish();

    }

    public static void startActivityUserEdit(Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.UserEdit.Init.class);
        pCallingActivity.startActivity(intent);

    }

    public static void startActivityFileScore(Activity pCallingActivity) {

        Intent intent = new Intent(pCallingActivity, de.fhdw.mfws413a.fluffy_potato.Activities.FileScore.Init.class);
        pCallingActivity.startActivity(intent);

    }

}
