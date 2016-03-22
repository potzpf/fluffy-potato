package de.fhdw.mfws413a.fluffy_potato.Data;

public class Solution {

    // Vars

    private String mText;
    private boolean mcorrect;

    // Constructor

    public Solution(String text, boolean correct) {

        this.mText = text;
        this.mcorrect = correct;

    }

    // Methods

    public String getText() {

        return mText;

    }

    public boolean isCorrect() {

        return mcorrect;

    }

}