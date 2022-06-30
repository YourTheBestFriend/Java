import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class My_Class {
    public static void main(String[] args) {
        root my_root = new root();
        File file = new File("text.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }
        Node rootNode = doc.getFirstChild();
        String mainName = null;
        Node peopleNode = null;
        NodeList rootChilds = rootNode.getChildNodes();
        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (rootChilds.item(i).getNodeName())
            {
                case "name": {
                    mainName = rootChilds.item(i).getTextContent();
                    break;
                }
                case "people":{
                    peopleNode = rootChilds.item(i);
                    break;
                }
            }
        }
        my_root.SetName(mainName);
        if (peopleNode == null){
            return;
        }
        List<people> peopleL = new ArrayList<>();
        NodeList peopleChileds = peopleNode.getChildNodes();
        for (int i = 0; i < peopleChileds.getLength(); i++) {
            if (peopleChileds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            if (!peopleChileds.item(i).getNodeName().equals("element")) {
                continue;
            }
            String name = "";
            int age = 0;
            NodeList elementChiled = peopleChileds.item(i).getChildNodes();
            for (int j = 0; j < elementChiled.getLength(); j++) {
                if (elementChiled.item(j).getNodeType() != Node.ELEMENT_NODE){
                    continue;
                }
                switch (elementChiled.item(j).getNodeName()){
                    case "name": {
                        name = elementChiled.item(j).getTextContent();
                        break;
                    }
                    case "age": {
                        age = Integer.valueOf(elementChiled.item(j).getTextContent());
                        break;
                    }
                }
            }
            people p1 = new people(age, name);
            peopleL.add(p1);
        }
        my_root.setPeople(peopleL);
        System.out.println(my_root.toString());
    }
}

