package de.fhdw.mfws413a.fluffy_potato.DataLayer;

import android.app.Activity;
import android.content.Context;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;


import de.fhdw.mfws413a.fluffy_potato.Data.*;

public class DataInterface extends Activity {
	Document user;
	Document folder;
	Document index;
	DocumentHandler dh;
	IOStreams ios;

	String foo;
	
	public DataInterface(IOStreams ios) {
		this.ios = ios;
		dh = new DocumentHandler(ios);
		try {
			user = dh.getDocument("users_data");
			folder = dh.getDocument("folder");
			index = dh.getDocument("index");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
	}

	public void saveUsers() {
		try {
			dh.putDocument("users_data", user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Hashtable<Integer, Challenge> parseChallenges() {
		Hashtable<Integer, Challenge> challenges = new Hashtable<Integer, Challenge>();

		ArrayList<Element> challengeElems = dh.getElementsByName(index, "challenge");
		for (int i = 0; i < challengeElems.size(); i++) {
			ArrayList<Solution> solutions = new ArrayList<Solution>();

			Element currentChallenge = challengeElems.get(i);
			int cid = Integer.parseInt(currentChallenge.getAttribute("cid"));
			String type = currentChallenge.getAttribute("type");
			String question = dh.getChildrenByName(currentChallenge, "question").get(0).getTextContent();

			ArrayList<Element> solutionElems = dh.getChildrenByName(currentChallenge, "solution");
			for(int j = 0; j < solutionElems.size();  j++) {
				Element currentSolution = solutionElems.get(j);
				boolean correct = currentSolution.getAttribute("true").equals("true") ? true : false;
				solutions.add(new Solution(currentSolution.getTextContent(), correct));
			}

			challenges.put(cid, new Challenge(cid, type, question, solutions));
		}
		return challenges;
	}

	public Hashtable<String, ArrayList<Integer>> parseFolders() {
		Hashtable<String, ArrayList<Integer>> ret = new Hashtable<String, ArrayList<Integer>>();

		ArrayList<Element> fileElems = dh.getElementsByName(folder, "file");
		for(int i = 0; i < fileElems.size(); i++) {
			Element currentFile = fileElems.get(i);
			String name = currentFile.getAttribute("name");

			ArrayList<Element> memberElems = dh.getChildrenByName(currentFile, "member");
			ArrayList<Integer> member = new ArrayList<Integer>();

			for(int j = 0; j < memberElems.size(); j++) {
				member.add(Integer.parseInt(memberElems.get(j).getAttribute("cid")));
			}
			ret.put(currentFile.getAttribute("name"), member);
		}
		return ret;
	}

	public Hashtable<String, User> parseUsers() {
		Hashtable<String, User> ret = new Hashtable<String, User>();
		ArrayList<Element> userElems = dh.getElementsByName(user, "user");
		for(int i = 0; i < userElems.size(); i++) {
			Element currentUser = userElems.get(i);
			String name = currentUser.getAttribute("name");

			User current = new User();
			ArrayList<Element> durations = dh.getChildrenByName((dh.getChildrenByName(currentUser, "schedule").get(0)), "duration");
			for(int j = 0; j < durations.size(); j++) {
				Element currentDuration = durations.get(j);
				current.durations.put(Integer.parseInt(currentDuration.getAttribute("class")),String2Calendar(currentDuration.getAttribute("timespan"), "dd.HH.mm"));

			}

			ArrayList<Element> expirations = dh.getChildrenByName( currentUser, "expiration");
			for(int j = 0; j < expirations.size(); j++) {
				Element currentExpiration = expirations.get(j);
				current.expiration.put(Integer.parseInt(currentExpiration.getAttribute("cid")), String2Calendar(currentExpiration.getTextContent(), "yyyy.MM.dd.HH.mm"));
				current.progress.put(Integer.parseInt(currentExpiration.getAttribute("cid")), Integer.parseInt(currentExpiration.getAttribute("class")));
			}
			ret.put(name,  current);
		}
		return ret;
	}
	public Calendar String2Calendar(String str, String format) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(format);
		try {
			c.setTime(df.parse(str));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return c;
	}

	public String duration2String(Calendar c, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(c.getTime());
	}

	public void syncDuration(String username, int class_no, Calendar c) {
		Element e = null;
		boolean bfound = false;
		ArrayList<Element> foo = dh.getElementsByName(user, "user");
		for (int i = 0; i < foo.size(); i++) {
			if (foo.get(i).getAttribute("name").equals(username)) {
				Element userElem = foo.get(i);
				ArrayList<Element> bar = dh.getChildrenByName((dh.getChildrenByName(userElem, "schedule").get(0)), "duration");
				for (int j = 0; j < bar.size(); j++) {
					Integer inte = Integer.parseInt(bar.get(j).getAttribute("class"));
					if ( inte != null && inte == class_no) {
						e = bar.get(j);
						bfound = true;
						break;
					}
				}
				if (!bfound) {
					e = user.createElement("duration");
					dh.getChildrenByName(userElem, "schedule").get(0).appendChild(e);
					e.setAttribute("class ", "" + class_no);
				}
				e.setTextContent(duration2String(c, "dd.HH.mm"));
				break;
			}
		}
		try {
			dh.putDocument("users_data", user);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public void syncExpiration(String username, int cid, int class_no, Calendar c) {
		Element e = null;
		boolean bfound = false;
		ArrayList<Element> foo = dh.getElementsByName(user, "user");
		for (int i = 0; i < foo.size(); i++) {
			if (foo.get(i).getAttribute("name").equals(username)) {
				Element userElem = foo.get(i);
				ArrayList<Element> bar = dh.getChildrenByName(userElem, "expiration");
				for (int j = 0; j < bar.size(); j++) {
					Integer inte = Integer.parseInt(bar.get(j).getAttribute("cid"));
					if ( inte != null && inte == cid) {
						e = bar.get(j);
						bfound = true;
						break;
					}
				}
				if (!bfound) {
					e = user.createElement("expiration");
					userElem.appendChild(e);
					e.setAttribute("cid", "" + cid);
				}
				e.setAttribute("class", "" + class_no);
				e.setTextContent(duration2String(c, "yyyy.MM.dd.HH.mm"));
				break;
			}
		}
		try {
			dh.putDocument("users_data", user);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
