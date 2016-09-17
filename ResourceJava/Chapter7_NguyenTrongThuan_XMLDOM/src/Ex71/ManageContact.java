package Ex71;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 17/09/2016
 * @version : 1.0 create class manage contact
 *
 */
public class ManageContact {
	/**
	 * function check do you want continue
	 * 
	 * @return string is y or n
	 * @throws IOException
	 */
	public static String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you want continue ? y/n");
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	// main method to run manage contact
	public static void main(String[] args)
			throws TransformerException, IOException, SAXException, ParserConfigurationException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String check = "y";
			List<Contact> lst = new ArrayList<>();
			lst = getAllContact();
			while (check.equals("y")) {
				System.out.println("Choice:");
				System.out.println("Press 1: View contact");
				System.out.println("Press 2: Search contact");
				System.out.println("Press 3: Add new contact");
				System.out.println("Press 4: Remove contact");
				System.out.println("Press 5: Update contact");
				System.out.println("Press 6: Add list contact to xml file");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1: {
					System.out.println("+++++++++++ All contact ++++++++++");
					for (Object o : lst) {
						Contact c = (Contact) o;
						c.show();
					}
					check = checkContinue();
				}
					break;
				case 2: {
					System.out.println("++++++++++ Search contact +++++++++++");
					System.out.println("Press 1: Search name: ");
					System.out.println("Press 2: Search phone");
					int option = Integer.parseInt(input.readLine());
					switch (option) {
					case 1: {
						System.out.print("Input name to search contact: ");
						String nameSeacrh = input.readLine();
						Contact c = getContactFromName(lst, nameSeacrh);
						if (c == null) {
							System.out.println("Contact is not exists");
						} else {
							c.show();
						}
					}
						break;
					case 2: {
						System.out.print("Input phone to search contact: ");
						String phoneSeacrh = input.readLine();
						Contact c = getContactFromPhone(lst, phoneSeacrh);
						if (c == null) {
							System.out.println("Contact is not exists");
						} else {
							c.show();
						}
					}
						break;

					default:
						throw new ArithmeticException("Choice is not valid!");
					}
					check = checkContinue();
				}
					break;
				case 3: {
					System.out.println("+++++++++++ Add new contact ++++++++++");
					Contact c = createContact();
					lst.add(c);
					addContactToXML(c);
					check = checkContinue();
				}
					break;
				case 4: {
					System.out.println("++++++++++ Remove contact +++++++++++");
					System.out.println("Press 1: Remove by name: ");
					System.out.println("Press 2: Remove by phone");
					int option = Integer.parseInt(input.readLine());
					switch (option) {
					case 1: {
						System.out.print("Input name to remove contact: ");
						String nameRemove = input.readLine();
						removeContactFromName(lst, nameRemove);
					}
						break;
					case 2: {
						System.out.print("Input phone to remove contact: ");
						String phoneRemove = input.readLine();
						removeContactFromPhone(lst, phoneRemove);
					}
						break;

					default:
						throw new ArithmeticException("Choice is not valid!");
					}
					check = checkContinue();
				}
					break;
				case 5: {
					System.out.println("+++++++++++ All contact ++++++++++");
					for (Object o : lst) {
						Contact c = (Contact) o;
						c.show();
					}
					int checkUpdate = 0;
					System.out.println("+++++++++ Update contact +++++++++");
					System.out.print("Input name to update: ");
					String name = input.readLine();
					System.out.print("Input phone to update: ");
					String phone = input.readLine();
					for (Contact c : lst) {
						if (c.getName().equals(name)) {
							lst.remove(c);
							checkUpdate = 1;
							lst.add(new Contact(name, phone));
						}
					}
					
					if (checkUpdate == 1) {
						System.out.println("Update completed!");
					} else {
						System.out.println("Can not update!");
					}
					check = checkContinue();
				}
					break;
				case 6: {
					writeXMLFile(lst);
					check = checkContinue();
				}
					break;
				default:
					throw new ArithmeticException("Choice is not valid!");
				}
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	// add contact to xml file with parameter Contact c
	public static void addContactToXML(Contact c)
			throws TransformerException, FileNotFoundException, SAXException, IOException {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement;
			String filePath = "src/Ex71/contact.xml";
			File xmlFile = new File(filePath);

			if (xmlFile.isFile()) {
				doc = docBuilder.parse(new FileInputStream(xmlFile));
				doc.getDocumentElement().normalize();
				rootElement = doc.getDocumentElement();
			} else {
				rootElement = doc.createElement("contacts");
				doc.appendChild(rootElement);
			}
			// contact
			Element contact = doc.createElement("contact");
			rootElement.appendChild(contact);

			// name element
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode(c.getName()));
			contact.appendChild(name);

			// phone element
			Element phone = doc.createElement("phone");
			phone.appendChild(doc.createTextNode(c.getPhone()));
			contact.appendChild(phone);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(xmlFile);
			transformer.transform(source, result);

			System.out.println("Add contact completed !");

		} catch (ParserConfigurationException pce) {
			System.out.println("Cannot insert new contact. Error: " + pce.getMessage());
		}
	}

	// function create object contact
	public static Contact createContact() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input name: ");
		String name = input.readLine();
		System.out.print("Input phone: ");
		String phone = input.readLine();
		Contact c = new Contact(name, phone);
		return c;
	}

	// get information of node
	private static Contact getContact(Node node) {
		Contact c = new Contact();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			c.setName(element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
			c.setPhone(element.getElementsByTagName("phone").item(0).getChildNodes().item(0).getNodeValue());
		}
		return c;
	}

	// show information of contact in xml file
	public static List<Contact> getAllContact() throws SAXException, IOException, ParserConfigurationException {
		String filePath = "src/Ex71/contact.xml";
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		List<Contact> lst = new ArrayList<>();
		NodeList nodeList = doc.getElementsByTagName("contact");
		for (int i = 0; i < nodeList.getLength(); i++) {
			lst.add(getContact(nodeList.item(i)));
		}
		return lst;
	}

	/**
	 * get contact from name
	 * 
	 * @param name
	 *            output: contact
	 */
	public static Contact getContactFromName(List<Contact> lst, String name) {
		for (Object o : lst) {
			Contact c = (Contact) o;
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}

	// remove contact from name
	public static void removeContactFromName(List<Contact> lst, String name) {
		Contact c = getContactFromName(lst, name);
		if (c != null) {
			lst.remove(c);
			System.out.println("Remove contact completed!");
		} else {
			System.out.println("Remove contact failse!");
		}
	}

	/**
	 * get contact from phone
	 * 
	 * @param name
	 * output: contact
	 */
	public static Contact getContactFromPhone(List<Contact> lst, String phone) {
		for (Object o : lst) {
			Contact c = (Contact) o;
			if (c.getPhone().equals(phone)) {
				return c;
			}
		}
		return null;
	}

	// remove contact from phone
	public static void removeContactFromPhone(List<Contact> lst, String phone) {
		Contact c = getContactFromName(lst, phone);
		if (c != null) {
			lst.remove(c);
			System.out.println("Remove contact completed!");
		} else {
			System.out.println("Remove contact failse!");
		}
	}

	private static void removeAllChildNodes(Node node) {
	    NodeList childNodes = node.getChildNodes();
	    int length = childNodes.getLength();
	    for (int i = 0; i < length; i++) {
	        Node childNode = childNodes.item(i);
	        if(childNode instanceof Element) {
	            if(childNode.hasChildNodes()) {
	                removeAllChildNodes(childNode);                
	            }        
	            node.removeChild(childNode);  
	        }
	    }
	}
	// write list contact to xml file
	public static void writeXMLFile(List<Contact> lst)
			throws TransformerException, FileNotFoundException, SAXException, IOException {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("contact");
			doc.appendChild(rootElement);
			String filePath = "src/Ex71/contact.xml";
			File xmlFile = new File(filePath);

			
			for (Contact c : lst) {
				// contact
				Element contact = doc.createElement("contact");
				rootElement.appendChild(contact);

				// name element
				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(c.getName()));
				contact.appendChild(name);

				// phone element
				Element phone = doc.createElement("phone");
				phone.appendChild(doc.createTextNode(c.getPhone()));
				contact.appendChild(phone);

				// write the content into xml file
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
			    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "5");
			    DOMSource source = new DOMSource(doc);
			    StreamResult result = new StreamResult(new File(filePath));
			    transformer.transform(source, result); 
			}

			System.out.println("Add list contact completed !");

		} catch (ParserConfigurationException pce) {
			System.out.println("Cannot insert new contact. Error: " + pce.getMessage());
		}
	}

}
