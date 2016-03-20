package de.fhdw.mfws413a.fluffy_potato.DataLayer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;


import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.InputStream;
import java.util.ArrayList;

import de.fhdw.mfws413a.fluffy_potato.R;

public class DocumentHandler extends Activity {

	Context here;
	public DocumentHandler() {
	}
   public Document getDocument(InputStream iS) throws Exception {
	   Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(iS);
	   doc.getDocumentElement().normalize();
	   return doc;
   }
   
   public void putDocument(String fname, Document doc) throws Exception {
	   DOMSource source = new DOMSource(doc);
	   Transformer trans = TransformerFactory.newInstance().newTransformer();
	   trans.transform(source, new StreamResult(fname));
   }
   
   public ArrayList<Element> getElementsByName(Document doc, String name) {
	   ArrayList<Element> ret = new ArrayList<Element>();
	   NodeList nList = doc.getElementsByTagName(name);
	   for (int i = 0; i < nList.getLength(); i++) {
		   if (nList.item(i).getNodeType() == Node.ELEMENT_NODE) {
			   ret.add((Element) nList.item(i));
		   }
	   }
	   return ret;
   }
   public ArrayList<Element> getChildrenByName(Node no, String name) {
	   ArrayList<Element> ret = new ArrayList<Element>();
	   NodeList nList = no.getChildNodes();
	   for (int i = 0; i < nList.getLength(); i++) {
		   Node n = nList.item(i);
		   if (n.getNodeType() == Node.ELEMENT_NODE && n.getNodeName().equals(name)) {
			   ret.add((Element) nList.item(i));
		   }
	   }
	   return ret;
   }
}