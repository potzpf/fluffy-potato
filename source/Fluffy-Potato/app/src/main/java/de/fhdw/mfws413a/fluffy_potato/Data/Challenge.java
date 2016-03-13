package de.fhdw.mfws413a.fluffy_potato.Data;

import java.util.ArrayList;

/**
 * Created by Dome-FH on 13.03.2016.
 */
public class Challenge {

    private String mQuestion;
    private Integer mChallengeTyp;
    private ArrayList<String> mRightAnswereList;
    private ArrayList<String> mAnswereList;

    public Challenge(Integer pChallengeTyp,String pQuestion) {
        mChallengeTyp = pChallengeTyp;
        mQuestion     = pQuestion;
    }

    public Boolean isRightAnswere(String pAnswere){
        Integer lRightCount;

        lRightCount = 0;
        for (int i = 0; i < mRightAnswereList.size(); i++) {
            if (pAnswere.equals(mRightAnswereList.get(i))){
                lRightCount++;
            }
        }
        return lRightCount > 0;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public ArrayList<String> getRightAnswereList() {
        return mRightAnswereList;
    }

    public ArrayList<String> getAnswereList() {
        return mAnswereList;
    }

    public Integer getChallengeTyp() {
        return mChallengeTyp;
    }

    public void addRightAnswere(String pAnswer){
        mRightAnswereList.add(pAnswer);
    }

    public void addAnswere(String pAnswer){
        mAnswereList.add(pAnswer);
    }

}
