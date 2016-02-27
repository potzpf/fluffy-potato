package de.fhdw.mfws413a.fluffy_potato;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;

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
	UserPotato users;
	
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

class UserPotato extends Potato {
	Document doc;
	String name = "user";
	
	public UserPotato() throws Exception {
		load();
	}
	
	public void load() throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		doc = dBuilder.parse(new File("users.xml"));
		doc.getDocumentElement().normalize();
	}
	
	public ArrayList<String> getNameList() {
		ArrayList<String> ret = new ArrayList<String>();
		NodeList nList = doc.getElementsByTagName("user");
		
		for (int i = 0; i < nList.getLength(); i++) {
			Node nNode = nList.item(i);
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				ret.add(((Element) nNode).getAttribute("name"));
			}
		}
		return ret;
	}
	
	public boolean add(String name) {
		
		if (getNameList().contains(name)) {
			return false;
		};
		Element root = doc.getDocumentElement();
		Element user = doc.createElement("user");
		user.setAttribute("name", name);
		root.appendChild(user);
		
		return true;
	}
	
	public boolean delete(String name) {
		if (!getNameList().contains(name)) {
			return false;
		}
		Element root = doc.getDocumentElement();
		
		NodeList nList = doc.getElementsByTagName("user");
		for (int i = 0; i< nList.getLength(); i++) {
			Node nNode = nList.item(i);
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				root.removeChild(nNode);
			}
		}
		return true;
	}
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
