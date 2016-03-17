package de.fhdw.mfws413a.fluffy_potato;
//import java.time.*;

import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.Data.Challenge;
import de.fhdw.mfws413a.fluffy_potato.Data.Const;
import de.fhdw.mfws413a.fluffy_potato.Data.Solution;

public class ApplicationInterface {
	int timespans[] = {1, 4, 7, 10, 13, 16};
		
	public ArrayList<String> getUserNames() {
		
		ArrayList<String> ret = new ArrayList<String>();
		ret.add("Adolf Hitler");
		ret.add("Joseph Stalin");
		ret.add("Benito Mussolini");
		return ret;
	}
	
	public ArrayList<String> getFileNames() {
		ArrayList<String> ret = new ArrayList<String>();

		
		ret.add("Europas Dichter und Denker.");
		ret.add("Mathematische Ungleichungen");
		
		return ret;
	}
	
	public ArrayList<Challenge> getDueChallenges(String user, String file) {
		ArrayList<Challenge> ret = new ArrayList<Challenge>();
		ArrayList<Solution> o3 = new ArrayList<>();
		ArrayList<Solution> o1 = new ArrayList<Solution>();
		
		o1.add(new Solution("Adolf Hitler", false));
		o1.add(new Solution("Koterbrechen", true));
		o3.add(new Solution("A+B / A = A / B", true));
		o3.add(new Solution("(1+sqrt(5))/2", true));
		o3.add(new Solution("phi = sqrt(1 + phi)", true));
		ret.add(new Challenge(0, Const.P_CHALLENGE_XOF3, "Wie ist Phi definiert?", o3));
		ret.add(new Challenge(1, "guess", "Wer ist der tollste Mensch der Welt?", o1));
		
		return ret;
	}
	
	public void pushChallenge(String user, int cid) {
		//
	}
	
	public void dropChallenge(String user, int cid) {
		//
	}
	
	//public Duration getDuration(String user, int class_no) {
		//return Duration.ofMinutes(timespans[class_no]);

	//}
	
	public void setDuration(String user, int class_no, int  n) {
		timespans[class_no] = n;
	}
}
