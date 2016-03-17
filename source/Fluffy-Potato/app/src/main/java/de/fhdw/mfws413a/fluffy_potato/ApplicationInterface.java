import java.time.*;
import java.util.ArrayList;

class Challenge {
	int id;
	String type;
	String question;
	ArrayList<Solution> answers;
	
	public Challenge(int id, String type, String question, ArrayList<Solution> answers) {
		this.id = id;
		this.type = type;
		this.question = question;
		this.answers = answers;
	}
	
	public int getID() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getQuestion() {
		return question;
	}
	
	public int answerSize() {
		return answers.size();
	}
	
	public String getAnswer(int i) {
		return answers.get(i).text;
	}
	
	public boolean isRightAnswer(int i) {
		if (answers.get(i).correct == true) {
			return true;
		}
		return false;
	}
}

class Solution {
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
		ArrayList<Solution> o3 = new ArrayList<Solution>();
		ArrayList<Solution> o1 = new ArrayList<Solution>();
		
		o1.add(new Solution("Adolf Hitler", false));
		o1.add(new Solution("Koterbrechen", true));
		o3.add(new Solution("A+B / A = A / B", true));
		o3.add(new Solution("(1+sqrt(5))/2", true));
		o3.add(new Solution("phi = sqrt(1 + phi)", true));
		ret.add(new Challenge(0, "q/a", "Wie ist Phi definiert?", o3));
		ret.add(new Challenge(1, "guess", "Wer ist der tollste Mensch der Welt?", o1));
		
		return ret;
	}
	
	public void pushChallenge(String user, int cid) {
		//
	}
	
	public void dropChallenge(String user, int cid) {
		//
	}
	
	public Duration getDuration(String user, int class_no) {
		return Duration.ofMinutes(timespans[class_no]);
	}
	
	public void setDuration(String user, int class_no, int  n) {
		timespans[class_no] = n;
	}
}