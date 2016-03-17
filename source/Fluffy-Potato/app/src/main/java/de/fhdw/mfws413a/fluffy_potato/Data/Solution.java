package de.fhdw.mfws413a.fluffy_potato.Data;

/**
 * Created by Dome-FH on 17.03.2016.
 */
public class Solution {
    String text;
    boolean correct;

    public Solution(String text, boolean correct) {
        this.text = text;
        this.correct = correct;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return correct;
    }
}