package de.fhdw.mfws413a.fluffy_potato.Data;

public class Solution {

    // Vars

    private String mText;
    private boolean mCorrect;

    // Constructor

    public Solution(String pText, boolean pCorrect) {

        mText = pText;
        mCorrect = pCorrect;

    }

    // Methods

    public String getText() {

        return mText;

    }

    public boolean isCorrect() {

        return mCorrect;

    }

}