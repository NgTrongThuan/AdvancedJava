package Part2_Ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 19/9/2016
 * @version: 1.0
 * create class Main to run
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		List<CD> lstCDFromDB = new ArrayList<>(); //declare list CD read from Database
		List<CD> lstCDFromFile = new ArrayList<>(); //declare list CD read from file cd.txt
		CDController controller = new CDController();
		
		lstCDFromDB = controller.getAllCDFromDB();  // get list CD from DB
		controller.writeCDToFile(lstCDFromDB); // write list CD to file cd.txt
		lstCDFromFile = controller.readCDFromFile(); // read list CD from file cd.txt
		// show list CD 
		System.out.println("List CD from file cd.txt");
		for(CD cd : lstCDFromFile){
			System.out.println(cd.toString());
		}
	}

}
