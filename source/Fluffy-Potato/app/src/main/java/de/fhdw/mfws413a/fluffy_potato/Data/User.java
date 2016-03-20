package de.fhdw.mfws413a.fluffy_potato.Data;


import java.util.*;

public class User {
	public Hashtable<Integer, Calendar> durations;
	public Hashtable<Integer, Calendar> expiration;
	public Hashtable<Integer, Integer> progress;
	
	public User()  {
		durations = new Hashtable<>();
		expiration = new Hashtable<>(); 
		progress = new Hashtable<>(); 
		
	}
	
}
