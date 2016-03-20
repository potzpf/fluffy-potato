package de.fhdw.mfws413a.fluffy_potato.Persistent;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;


//public class Main {
//	public static void main(String[] args) throws Exception {
//
//		Storage fio = new Storage();
//		ArrayList<String> users = fio.users.getNameList();
//
//		for(int i = 0; i < users.size(); i++) {
//			System.out.println("user: " + users.get(i));
//		}
//
//		fio.users.add("potzpf");
//		fio.users.delete("potzpf");
//		fio.save(fio.users);
//	}
//}

public class Storage {
	public UserPotato users;
	
	public Storage() throws Exception {
		users = new UserPotato();
	}
	
	static ArrayList<Node> getChildren(Node root) {
		ArrayList<Node> ret = new ArrayList<Node>();
		
		for(int i = 0; i < root.getChildNodes().getLength(); i++) {
			if (root.getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
				ret.add(root.getChildNodes().item(i));
			}
		}
		
		return ret;
	}
	
	public void save(Potato pot) throws Exception {
		//pot.doc.getDocumentElement().normalize();
		DOMSource source = new DOMSource(pot.doc);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult result = new StreamResult(pot.name + ".xml");
        transformer.transform(source, result);
	}
}

class Potato {
	Document doc;
	String name;
}

class Challenge {
	int id;
	int type;
	String question;
	ArrayList<Solution> answers;
}

class Solution {
	String text;
	boolean correct;
}
