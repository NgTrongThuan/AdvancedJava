package Part2_Ex3;

import java.awt.HeadlessException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.PreparedStatement;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0 create class controller
 *
 */
public class CDController {

	// declare database connnection
	static DatabaseConnection db = new DatabaseConnection();

	// get all CD in database (SELECT ALL) -> return List CD
	public List<CD> getCDFromDB() {
		List<CD> lst = new ArrayList<>();
		try (Connection conn = db.connect()) {
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				CD obj = new CD();
				obj.setId(resultSet.getInt("id"));
				obj.setName(resultSet.getString("name"));
				obj.setNumOfSong(resultSet.getInt("numbersongs"));
				obj.setSinger(resultSet.getString("singer"));
				obj.setPrice(resultSet.getDouble("price"));
				lst.add(obj);
			}
			conn.close();
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return lst;
	}

	// add CD to file CD.xml with parameter CD c
	public static void addToXML(CD c)
			throws TransformerException, FileNotFoundException, SAXException, IOException {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement;
			String filePath = "src/Part2_Ex3/CD.xml";
			File xmlFile = new File(filePath);

			if (xmlFile.isFile()) {
				doc = docBuilder.parse(new FileInputStream(xmlFile));
				doc.getDocumentElement().normalize();
				rootElement = doc.getDocumentElement();
			} else {
				rootElement = doc.createElement("CDs");
				doc.appendChild(rootElement);
			}

			Element cd = doc.createElement("CD");
			rootElement.appendChild(cd);

			// id element
			Element id = doc.createElement("id");
			id.appendChild(doc.createTextNode(Integer.toString(c.getId())));
			cd.appendChild(id);
			
			// name
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode(c.getName()));
			cd.appendChild(name);

			//singer
			Element singer = doc.createElement("singer");
			singer.appendChild((doc.createTextNode(c.getSinger())));
			cd.appendChild(singer);

			// number songs
			Element numbersongs = doc.createElement("numbersongs");
			numbersongs.appendChild(doc.createTextNode(Integer.toString(c.getNumOfSong())));
			cd.appendChild(numbersongs);
			
			// price
			Element price = doc.createElement("price");
			price.appendChild(doc.createTextNode(Double.toString(c.getPrice())));
			cd.appendChild(price);
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(xmlFile);
			transformer.transform(source, result);

			System.out.println("Add completed !");

		} catch (ParserConfigurationException pce) {
			System.out.println("Cannot insert new CD. Error: " + pce.getMessage());
		}
	}

	// -------------------------------------------------------------------------------------------------------

	// get CD from node -> return Object CD
	private static CD getCD(Node node) {
		CD cd = new CD();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			cd.setId(Integer.parseInt(element.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue()));
			cd.setName(element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
			cd.setSinger(element.getElementsByTagName("singer").item(0).getChildNodes().item(0).getNodeValue());
			cd.setNumOfSong(Integer.parseInt(element.getElementsByTagName("numbersongs").item(0).getChildNodes().item(0).getNodeValue()));
			cd.setPrice(Double.parseDouble(element.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue()));
		}
		return cd;
	}

	// get all CD from xml file -> return list CD
	public static List<CD> getCDFromXML() throws SAXException, IOException, ParserConfigurationException {
		String filePath = "src/Part2_Ex3/CD.xml";
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		List<CD> lst = new ArrayList<>();
		NodeList nodeList = doc.getElementsByTagName("CD");
		for (int i = 0; i < nodeList.getLength(); i++) {
			lst.add(getCD(nodeList.item(i)));
		}
		return lst;
	}
	
	// write list to xml file
	public static void writeXMLFile(List<CD> lst)
			throws TransformerException, FileNotFoundException, SAXException, IOException {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("CDs");
			doc.appendChild(rootElement);
			String filePath = "src/Part2_Ex3/CD.xml";
			File xmlFile = new File(filePath);

			
			for (CD c : lst) {

				Element cd = doc.createElement("CD");
				rootElement.appendChild(cd);

				// id element
				Element id = doc.createElement("id");
				id.appendChild(doc.createTextNode(Integer.toString(c.getId())));
				cd.appendChild(id);
				
				// name
				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(c.getName()));
				cd.appendChild(name);

				//singer
				Element singer = doc.createElement("singer");
				singer.appendChild((doc.createTextNode(c.getSinger())));
				cd.appendChild(singer);

				// number songs
				Element numbersongs = doc.createElement("numbersongs");
				numbersongs.appendChild(doc.createTextNode(Integer.toString(c.getNumOfSong())));
				cd.appendChild(numbersongs);
				
				// price
				Element price = doc.createElement("price");
				price.appendChild(doc.createTextNode(Double.toString(c.getPrice())));
				cd.appendChild(price);
				
				// write the content into xml file
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
			    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "5");
			    DOMSource source = new DOMSource(doc);
			    StreamResult result = new StreamResult(new File(filePath));
			    transformer.transform(source, result); 
			}

		} catch (ParserConfigurationException pce) {
			System.out.println("Cannot insert new contact. Error: " + pce.getMessage());
		}
	}
}
