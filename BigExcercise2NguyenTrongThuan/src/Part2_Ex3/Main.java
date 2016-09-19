package Part2_Ex3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 19/9/2016
 * @version: 1.0
 * create class Main to run
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, TransformerException, SAXException, ParserConfigurationException {
		List<CD> lstCDFromDB = new ArrayList<>(); //declare list CD read from Database
		List<CD> lstCDFromFile = new ArrayList<>(); //declare list CD read from file CD.xml
		CDController controller = new CDController();
		
		lstCDFromDB = controller.getCDFromDB();  // get list CD from DB
		controller.writeXMLFile(lstCDFromDB); // write list CD to file CD.xml
		lstCDFromFile = controller.getCDFromXML(); // read list CD from file CD.xml
		// show list CD 
		System.out.println("List CD from file CD.xml");
		for(CD cd : lstCDFromFile){
			System.out.println(cd.toString());
		}
	}

}
