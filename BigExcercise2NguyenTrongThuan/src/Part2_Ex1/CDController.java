package Part2_Ex1;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

	// get all CD in database (SELECT ALL) -> return list CD
	public List<CD> getAllCD() {
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

	// add new CD with parameter CD
	public void addCD(CD obj) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "INSERT INTO cd VALUES(NULL, '" + obj.getName() + "', '" + obj.getSinger() + "', "
					+ obj.getNumOfSong() + ", " + obj.getPrice() + ")";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	// add new product to MAIN METHOD
	public void runAddCD() throws IOException, ClassNotFoundException, SQLException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+++++++ Add new CD +++++++");
		System.out.print("Name: ");
		String name = input.readLine();
		System.out.print("Number songs: ");
		int numbersong = Integer.parseInt(input.readLine());
		System.out.print("Singer: ");
		String singer = input.readLine();
		System.out.print("Price:");
		double price = Double.parseDouble(input.readLine());

		if (numbersong <= 0)
			throw new ArithmeticException("Number song is not valid!");
		if (price <= 0)
			throw new ArithmeticException("Price is not valid!");

		try {
			CD p = new CD(name, singer, numbersong, price);
			CDController controller = new CDController();
			controller.addCD(p);
			System.out.println("Add successed!");
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	// search CD with parameter name of CD -> return list CD
	public static List<CD> searchCD(String name) throws ClassNotFoundException, SQLException {
		List<CD> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd WHERE name like '%" + name + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				CD obj = new CD();
				obj.setId(resultSet.getInt("id"));
				obj.setName(resultSet.getString("name"));
				obj.setNumOfSong(resultSet.getInt("numbersongs"));
				obj.setSinger(resultSet.getString("singer"));
				obj.setPrice(resultSet.getDouble("price"));
				rs.add(obj);
			}
		}
		return rs;
	}

	// excecute search product
	public void runSearchCD() throws IOException, SQLException, ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+++++++ Search +++++++");
		System.out.print("Input name CD to search: ");
		String name = input.readLine();
		List<CD> lst;
		try {
			lst = this.searchCD(name);
			if (lst.size() <= 0) {
				System.out.println("CD find not found!");
			} else {
				for (CD p : lst) {
					System.out.println(p.toString());
				}
			}
		} catch (HeadlessException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	// update CD with parameter is CD (UPDATE)
	public void updateCD(CD cd) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "UPDATE cd set numbersongs = " + cd.getNumOfSong() + ", price = " + cd.getPrice()
					+ " where id = " + cd.getId() + "";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	// get CD from ID of CD -> return CD / null
	public CD getCD(List<CD> lst, int id) {
		for (CD cd : lst) {
			if (cd.getId() == id) {
				return cd;
			}
		}
		return null;
	}

	// run update CD MAIN METHOD
	public void runUpdateCD() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+++++++++ List CD ++++++++");
		List<CD> lst = this.getAllCD();
		for (CD cd : lst) {
			System.out.println(cd.toString());
		}
		System.out.println("+++++++++++++++++++++++++++");
		System.out.print("Choice id of CD to update: ");
		int id = Integer.parseInt(input.readLine());
		
		CD cd = getCD(lst, id);
		if (cd == null) {
			System.out.println("ID is not valid!");
		} else {
			System.out.println("+++++++ Input information update +++++++");
			System.out.print("Input number songs: ");
			int numbersong = Integer.parseInt(input.readLine());
			System.out.print("Input price: ");
			double price = Double.parseDouble(input.readLine());

			if (numbersong <= 0)
				throw new ArithmeticException("Number song is not valid!");
			if (price <= 0)
				throw new ArithmeticException("Price is not valid!");
			cd.setNumOfSong(numbersong);
			cd.setPrice(price);
			this.updateCD(cd);
			System.out.println("Update completed!");
		}
	}

	// delete CD with parameter is CD (DELETE)
	public void deleteCD(CD cd) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "DELETE FROM cd WHERE id = " + cd.getId() + "";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	// run delete CD MAIN METHOD
	public void runDeleteCD() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+++++++++ List CD ++++++++");
		List<CD> lst = this.getAllCD();
		for (CD cd : lst) {
			System.out.println(cd.toString());
		}
		System.out.println("+++++++++++++++++++++++++++");
		System.out.print("Choice id of CD to delete: ");
		int id = Integer.parseInt(input.readLine());
		if (id <= 0)
			throw new ArithmeticException("ID is not valid!");
		CD cd = this.getCD(lst, id);
		System.out.println("Information of CD: ");
		System.out.println(cd.toString());
		System.out.println("Do you want delete this CD: (1-yes/ 2-no) ?");
		int choice = Integer.parseInt(input.readLine());
		if (choice == 1) {
			this.deleteCD(cd);
			System.out.println("Delete CD completed!");
		} else if (choice == 2) {
			System.out.println("You have cancel delete CD!");
		} else {
			throw new ArithmeticException("Choice is not valid!");
		}

	}
}
