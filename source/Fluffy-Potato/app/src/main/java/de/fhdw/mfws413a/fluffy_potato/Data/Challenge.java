package de.fhdw.mfws413a.fluffy_potato.Data;

import java.util.ArrayList;

public class Challenge {

    // Vars

    private Integer mChallengeID;
    private String mQuestion;
    private String mChallengeTyp;
    private ArrayList<Solution> mAnswers;

    // Constructor

    public Challenge(Integer pChallengeID ,String pChallengeTyp,String pQuestion,ArrayList<Solution> pAnswereList) {

        mChallengeID = pChallengeID;
        mChallengeTyp = pChallengeTyp;
        mQuestion     = pQuestion;
        mAnswers = pAnswereList;

    }

    // Methods (getter)

    public Integer getChallengeID() {

        return mChallengeID;

    }

    public String getQuestion() {

        return mQuestion;

    }

    public String getTyp() {

        return mChallengeTyp;

    }

    public String getAnswere(Integer pIndex) {

        return mAnswers.get(pIndex).getText();

    }

    public String getRightAnswerText(){

        // local vars

        String lAnswereText = "";

        // logic

        for (int i = 0; i < getAnswerSize(); i++) {

            if (isRightAnswer(i)) {

                lAnswereText = lAnswereText + getAnswere(i);
                if (i + 1 < getAnswerSize()) {

                    lAnswereText = lAnswereText + "\n\n";

                }

            }

        }
        return lAnswereText;

    }

    public int getAnswerSize() {

        return mAnswers.size();

    }

    // testing if answere is rihght

    public boolean isRightAnswere(String pAnswere){

        // local vars

        Integer lRightCount;

        // logic

        lRightCount = 0;
        for (int i = 0; i < getAnswerSize(); i++) {

            if (pAnswere.equals(getAnswere(i)) && mAnswers.get(i).isCorrect()) {

                lRightCount++;

            }

        }
        return lRightCount > 0;

    }

    public boolean isRightAnswer(int i) {

        if (mAnswers.get(i).isCorrect()== true) {

            return true;

        }
        return false;

    }

}
