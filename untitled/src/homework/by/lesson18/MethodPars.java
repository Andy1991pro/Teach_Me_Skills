package homework.by.lesson18;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;

public class MethodPars {
    public static void builder (String path) {
        try {
        File inputFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
        Document doc =  dbBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        System.out.println(doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("line");
        NodeList nodeFirst = doc.getElementsByTagName("firstName");
        Node node1 = nodeFirst.item(0);
        NodeList nodeLast = doc.getElementsByTagName("lastName");
        Node node2 = nodeLast.item(0);
        NodeList nodeLastTitle = doc.getElementsByTagName("title");
        Node node3 = nodeLastTitle.item(0);
        File file = new File(node1.getTextContent()+"_"+node2.getTextContent()+"_"+node3.getTextContent()+".txt");
        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i<nList.getLength();i++){
            Node current = nList.item(i);
            System.out.println(current.getTextContent());
            fileWriter.write(current.getTextContent()+"\n");
        }fileWriter.close();
        }  catch (Exception e){
            System.err.println("Файл на найден");
        }

    }
}
