package de.fhdw.mfws413a.fluffy_potato.DataLayer;

import android.app.Activity;
import android.content.Context;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
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
		dh = new DocumentHandler();
		foo = "foo";
		try {
			user = dh.getDocument(ios.iUsers);
			folder = dh.getDocument(ios.iFolder);
			index = dh.getDocument(ios.iIndex);
			
		} catch (Exception e) {
			e.printStackTrace();
			foo = e.toString();
		}
	}
	
	public ArrayList<String> getUserNames() {
		ArrayList<String> ret = new ArrayList<String>();
		//ArrayList<Element> eList = DocumentHandler.getElementsByName(user, "user");
		//for(int i = 0; i < eList.size(); i++) {
		//	ret.add(eList.get(i).getAttribute("name") );
		//}
		ret.add(foo);
		return ret;
	}
	
	public ArrayList<String> getFileNames() {
		ArrayList<String> ret = new ArrayList<String>();
		ArrayList<Element> eList = dh.getChildrenByName(folder.getDocumentElement(), "file");
		for(int i = 0; i < eList.size(); i++) {
			ret.add(eList.get(i).getAttribute("name"));
		}
		return ret;
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
		for (int i = 0; i < fileElems.size(); i++) {
			Element currentFile = fileElems.get(i);
			String name = currentFile.getAttribute("name");

			ArrayList<Element> memberElems = dh.getChildrenByName(currentFile, "member");
			ArrayList<Integer> member = new ArrayList<Integer>();

			for (int j = 0; j < memberElems.size(); j++) {
				member.add(Integer.parseInt(memberElems.get(j).getAttribute("cid")));
			}
			ret.put(currentFile.getAttribute("name"), member);
		}
		return ret;
	}
}
