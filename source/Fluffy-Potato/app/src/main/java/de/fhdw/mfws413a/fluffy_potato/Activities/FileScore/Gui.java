package de.fhdw.mfws413a.fluffy_potato.Activities.FileScore;

import android.app.Activity;
import android.widget.GridView;
import de.fhdw.mfws413a.fluffy_potato.R;

public class Gui {

    //  Vars

    private  GridView mGvFile;

    // Constructor

    public Gui(Activity pActivity) {

        pActivity.setContentView(R.layout.activity_file_score);

        // setting gui elements

        mGvFile = (GridView) pActivity.findViewById(R.id.file_score_grid_view);

    }

    // Methods (getter)

    public GridView getmGvFile() {

        return mGvFile;

    }

}
