package de.fhdw.mfws413a.fluffy_potato;

import android.os.Parcelable;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Dome on 29.02.2016.
 */
public class UserPotato extends Potato {
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