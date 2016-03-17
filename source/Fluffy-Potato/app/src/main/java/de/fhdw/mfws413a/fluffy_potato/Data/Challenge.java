package de.fhdw.mfws413a.fluffy_potato.Data;

import java.util.ArrayList;

public class Challenge {

    private Integer mChallengeID;
    private String mQuestion;
    private String mChallengeTyp;
    private ArrayList<Solution> mAnswers;

    public Challenge(Integer pChallengeID ,String pChallengeTyp,String pQuestion,ArrayList<Solution> pAnswereList) {
        mChallengeID = pChallengeID;
        mChallengeTyp = pChallengeTyp;
        mQuestion     = pQuestion;
        mAnswers = pAnswereList;
    }

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
        String lAnswereText = "";

        for (int i = 0; i <answerSize()-1; i++) {
            lAnswereText = lAnswereText + getAnswere(i);
            if (i+1 < answerSize()){
                lAnswereText = lAnswereText + "\n";
            }
        }
        return lAnswereText;
    }

    public int answerSize() {
        return mAnswers.size();
    }

    public boolean isRightAnswere(String pAnswere){
        Integer lRightCount;

        lRightCount = 0;
        for (int i = 0; i < answerSize()-1; i++) {
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
