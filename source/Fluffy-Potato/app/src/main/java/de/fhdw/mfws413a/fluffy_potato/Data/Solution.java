package de.fhdw.mfws413a.fluffy_potato.Data;

/**
 * Created by Dome-FH on 17.03.2016.
 */
public class Solution {

    private String mText;
    private boolean mcorrect;

    public Solution(String text, boolean correct) {
        this.mText = text;
        this.mcorrect = correct;
    }

    public String getText() {
        return mText;
    }

    public boolean isCorrect() {
        return mcorrect;
    }
}