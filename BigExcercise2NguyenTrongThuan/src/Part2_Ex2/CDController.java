package Part2_Ex2;

import java.awt.HeadlessException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
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
	public List<CD> getAllCDFromDB() {
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

	// write List CD to file cd.txt
	public void writeCDToFile(List<CD> lst) throws FileNotFoundException, IOException{
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/Part2_Ex2/cd.txt")))){
			for(CD cd : lst){
				out.writeObject(cd);		
			}
			out.flush();
			out.close();
		}catch(IOException e){
		}
	}
	
	// read list CD from file cd.txt -> return list CD
	public List<CD> readCDFromFile() throws FileNotFoundException, IOException, ClassNotFoundException{
		List<CD> lst = new ArrayList<>();
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/Part2_Ex2/cd.txt")))){
			while(true){
				CD cd = (CD) in.readObject();
				lst.add(cd);
			}
		}catch(ClassCastException | IOException ex){
		}
		return lst;
	}
}
