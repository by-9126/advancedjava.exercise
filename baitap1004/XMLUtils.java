import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLUtils {

    public static void exportToXML(String fileName, List<User> userList) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("Users");
        doc.appendChild(root);

        for (User user : userList) {
            Element userElement = doc.createElement("User");

            Element username = doc.createElement("Username");
            username.appendChild(doc.createTextNode(user.getUsername()));

            userElement.appendChild(username);
            root.appendChild(userElement);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(fileName));
        transformer.transform(source, result);
    }

    public static List<User> importFromXML(String fileName) throws Exception {
        List<User> userList = new ArrayList<>();
        File xmlFile = new File(fileName);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);

        NodeList nodeList = doc.getElementsByTagName("User");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String username = element.getElementsByTagName("Username").item(0).getTextContent();
                userList.add(new User(username, ""));
            }
        }
        return userList;
    }
}