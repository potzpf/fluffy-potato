package de.fhdw.mfws413a.fluffy_potato.ApplicationLayer;
//import java.time.*;

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

	/*
	* provides ressources to DataInterface & loads the Database
	* */
	public void init( ) {
		try {
			IOStreams ios = new IOStreams();
			ios.iUsers = here.getResources().openRawResource(R.raw.users_data);
			ios.iFolder = here.getResources().openRawResource(R.raw.folder);
			ios.iIndex = here.getResources().openRawResource(R.raw.index);
			ios.root = here.getFilesDir();

			di = new DataInterface(ios);
			users = di.parseUsers();
			challenges = di.parseChallenges();
			folder = di.parseFolders();
		}
		catch (Exception i) {

		}
	}
	/*
	 * returns a ArrayList containing the user nam
	 * of all registered users. Technically listing
	 * all keys of the user-Hashtable.
	 */
	public ArrayList<String> getUserNames() {
		ArrayList<String> ret = new ArrayList<String>();
		Enumeration<String> user = users.keys();
		while(user.hasMoreElements()) {
			ret.add(user.nextElement());
		}
		return ret;
	}
	/*
	 * same technique as getUserNames(), but for files.
	 */
	public ArrayList<String> getFileNames() {
		ArrayList<String> ret = new ArrayList<String>();
		Enumeration<String> files = folder.keys();
		while(files.hasMoreElements()) {
			ret.add(files.nextElement());
		}
		return ret;
	}

	public String getFilesQuestionCount( String file) {
		ArrayList<Challenge> ret = new ArrayList<>();
		ArrayList<Integer> lst = folder.get(file);
		for(int i = 0; i < lst.size(); i++) {
			int cid = lst.get(i);
				ret.add(challenges.get(cid));
			}

		return Integer.toString(ret.size());
	}

	/*
	returns an arraylist with the number of challenges each classf for a specific user
	 */
	public ArrayList<String> getClassesQuestionCount( String pfile, String pUser) {
		ArrayList<String> ret = new ArrayList<>();
		ArrayList<Integer> lst = folder.get(pfile);
		int k1=0,k2=0,k3=0,k4=0,k5=0,k6=0;
		for(int i = 0; i < lst.size(); i++) {
			int cid = lst.get(i);
			try {
				switch (users.get(pUser).progress.get(cid)){
					case 1: k1++;
						break;
					case 2: k2++;
						break;
					case 3: k3++;
						break;
					case 4: k4++;
						break;
					case 5: k5++;
						break;
					case 6: k6++;
						break;
				}
			}catch (Exception j) {
				k1 = Integer.parseInt(getFilesQuestionCount(pfile));
			}

		}
		ret.add(Integer.toString(k1));
		ret.add(Integer.toString(k2));
		ret.add(Integer.toString(k3));
		ret.add(Integer.toString(k4));
		ret.add(Integer.toString(k5));
		ret.add(Integer.toString(k6));
		return ret;
	}
	public ArrayList<String> getClassesDuenCount( String pfile, String pUser) {
		ArrayList<String> ret = new ArrayList<>();
		ArrayList<Integer> lst = folder.get(pfile);
		int k1=0,k2=0,k3=0,k4=0,k5=0,k6=0;
		for(int i = 0; i < lst.size(); i++) {
			int cid = lst.get(i);
			Calendar c = users.get(pUser).expiration.get(cid);
			if (c == null) {
				try {
					k1 = Integer.parseInt(getFilesQuestionCount(pfile));
				} catch (Exception j) {
					k1 = Integer.parseInt(getFilesQuestionCount(pfile));
				}
			}else if (c.before(Calendar.getInstance())) {
				switch (users.get(pUser).progress.get(cid)) {
					case 1:k1++;
						break;
					case 2:k2++;
						break;
					case 3:k3++;
						break;
					case 4:k4++;
						break;
					case 5:k5++;
						break;
					case 6:k6++;
						break;
				}
			}

		}
		ret.add(Integer.toString(k1));
		ret.add(Integer.toString(k2));
		ret.add(Integer.toString(k3));
		ret.add(Integer.toString(k4));
		ret.add(Integer.toString(k5));
		ret.add(Integer.toString(k6));
		return ret;
	}

	/*
	 * lists all challenges from a specific file due to a user
	 */
	public ArrayList<Challenge> getDueChallenges(String user, String file) {
		ArrayList<Challenge> ret = new ArrayList<>();
		ArrayList<Integer> lst = folder.get(file);
		for(int i = 0; i < lst.size(); i++) {
			int cid = lst.get(i);
			Calendar c = users.get(user).expiration.get(cid);
			if (c == null) {
				ret.add(challenges.get(cid));
			}
			else if (c.before(Calendar.getInstance())) {
				ret.add(challenges.get(cid));
			}
		}
		return ret;
	}

	/*
	 * re-calculates the expiration date and increases the class counter
	 */
	public void pushChallenge(String user, int cid) {
		Calendar c = Calendar.getInstance();
		//System.out.println(users_data.get(user).progress.get);
		Integer class_id = users.get(user).progress.get(cid);
		if (class_id == null) {
			class_id = 0;
		}
		class_id++;
		Calendar d = getDuration(user,class_id);
		c.add(Calendar.DAY_OF_YEAR, d.get(d.DAY_OF_YEAR)%365);
		c.add(Calendar.HOUR_OF_DAY, d.get(d.HOUR_OF_DAY));
		c.add(Calendar.MINUTE, d.get(d.MINUTE));
		users.get(user).progress.put(cid, class_id);
		users.get(user).expiration.put(cid, c);
		di.syncExpiration(user, cid, class_id, c);
	}

	/*
	 * re-sets the class-counter and push
	 */
	public void dropChallenge(String user, int cid) {
		users.get(user).progress.remove(cid);
		pushChallenge(user, cid);
	}

	public int getDurationMin(String user, int class_no) {
		Calendar c = getDuration(user, class_no);
		return c.get(c.MINUTE) + 60 *(c.get(c.HOUR_OF_DAY) + 24 * (c.get(c.DAY_OF_YEAR) % 365));
	}


	public void setDurationMin(String user, int class_no, int set) {
		int day = set % (60 * 24);
		set -= day * (60 * 24);
		int hour = set % 60;
		set -= hour * 60;
		//getDuration(user,class_no).set(0,0,day,hour,set);
		Calendar c = Calendar.getInstance();
		c.set(0, 0, day, hour, set);
		setDuration(user, class_no, c);
	}

	/*
	 get duration for class/user, if empty return default value
	 */
	public Calendar getDuration(String user, int class_no) {
		Calendar c = users.get(user).durations.get(class_no);
		if (c == null) {
			return getDuration("default", class_no);
		}
		return c;
	}

	public void setDuration(String user, int class_no, Calendar set) {
		if (set != null) {
			users.get(user).durations.put(class_no, set);
			//di.syncDuration(user, class_no, set);
		}
	}

	public void addUser(String name) {
		di.addUser(name);
		users = di.parseUsers();
	}
}
