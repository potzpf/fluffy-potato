package de.fhdw.mfws413a.fluffy_potato.ApplicationLayer;
//import java.time.*;

import android.app.Activity;
import android.os.Environment;
import android.util.Log;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;


import de.fhdw.mfws413a.fluffy_potato.Data.*;
import de.fhdw.mfws413a.fluffy_potato.DataLayer.*;
import de.fhdw.mfws413a.fluffy_potato.R;

import android.content.Context;

public class ApplicationInterface {
	private Hashtable<Integer, Challenge> challenges;
	private Hashtable<String, ArrayList<Integer>> folder;
	private Hashtable<String, User> users;
	private DataInterface di;

	Context here;


	public ApplicationInterface(Context c) {
		here = c;
	}

	public void init( ) {
		try {
			IOStreams ios = new IOStreams();
			ios.iUsers = here.getResources().openRawResource(R.raw.users_data);
			ios.iFolder = here.getResources().openRawResource(R.raw.folder);
			ios.iIndex = here.getResources().openRawResource(R.raw.index);
			di = new DataInterface(ios);
			users = di.parseUsers();
			challenges = di.parseChallenges();
			folder = di.parseFolders();
		}
		catch (Exception i) {

		}
	}
	public ArrayList<String> getUserNames() {
		ArrayList<String> ret = new ArrayList<String>();
		Enumeration<String> user = users.keys();
		while(user.hasMoreElements()) {
			ret.add(user.nextElement());
		}
		return ret;
	}

	public ArrayList<String> getFileNames() {
		ArrayList<String> ret = new ArrayList<String>();
		Enumeration<String> files = folder.keys();
		while(files.hasMoreElements()) {
			ret.add(files.nextElement());
		}
		return ret;
	}

	public ArrayList<Challenge> getDueChallenges(String user, String file) {
		ArrayList<Challenge> ret = new ArrayList<>();
		ArrayList<Integer> lst = folder.get(file);
		for(int i = 0; i < lst.size(); i++) {
			int cid = lst.get(i);
			Calendar c = users.get(user).expiration.get(cid);
			if (c == null) {
				System.out.println("boo");
				pushChallenge(user, cid);
				ret.add(challenges.get(cid));
			}
			else if (c.before(Calendar.getInstance())) {
				ret.add(challenges.get(cid));
			}
		}
		return ret;
	}

	public void pushChallenge(String user, int cid) {
		Calendar c = Calendar.getInstance();
		//System.out.println(users_data.get(user).progress.get);
		Integer class_id = users.get(user).progress.get(cid);
		if (class_id == null) {
			class_id = 0;
		}
		class_id++;
		Calendar d = getDuration(user,class_id);
		c.add(Calendar.DAY_OF_YEAR, d.get(Calendar.DAY_OF_YEAR));
		c.add(Calendar.HOUR_OF_DAY, d.get(Calendar.HOUR_OF_DAY));
		c.add(Calendar.MINUTE, d.get(Calendar.MINUTE));
		users.get(user).progress.put(cid, class_id);
		users.get(user).expiration.put(cid, c);
		di.syncExpiration(user, cid, class_id, c);
	}

	public void dropChallenge(String user, int cid) {
		users.get(user).progress.remove(cid);
		pushChallenge(user, cid);
	}

	public int getDurationMin(String user, int class_no) {
		int ret = 0;
		switch (class_no) {
			case 1: ret = 5;
			  break;
			case 2: ret = 1*60;
			  break;
			case 3: ret = 1*60*24;
			  break;
			case 4: ret = 7*60*24;
			  break;
			case 5: ret = 30*60*24;
			  break;
			case 6: ret = 180*60*24;
			  break;
		}
		return ret;
	}

	public void setDurationMin(String user, int class_no, int set) {
		//kp
	}

	public Calendar getDuration(String user, int class_no) {
		Calendar c = users.get(user).durations.get(class_no);
		if (c == null) {
			c = users.get("default").durations.get(class_no);
		}
		return c;
	}

	public void setDuration(String user, int class_no, Calendar set) {
		if (set != null) {
			users.get(user).durations.put(class_no, set);
			di.syncDuration(user, class_no, set);
		}
	}
}
