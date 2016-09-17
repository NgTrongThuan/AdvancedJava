package Ex8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.jws.soap.SOAPBinding.Use;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.api.x.Result;
import com.mysql.cj.jdbc.PreparedStatement;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0
 * create class user controller
 *
 */
public class UserController {
	
	//decare database connection 
	static DatabaseConnection db = new DatabaseConnection();

	// get user login from db -> return user if have exists in db, else return null
	public User loginUser(String username, String password)
			throws ClassNotFoundException, SQLException {
		User user = null;

		try (Connection conn = db.connect()) {
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM user WHERE user like '" + username
					+ "' and password like '" + password + "'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				user = new User();
				user.setUser(resultSet.getString("user"));
				user.setPassword(resultSet.getString("password"));
				break;
			}
			conn.close();
		}catch(SQLException | ClassNotFoundException ex){
			System.out.println("Error: " + ex.getMessage());
		}
		return user;
	}

	
	// check login of user 
	public void checkLogin() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Username: ");
		String user = input.readLine();
		System.out.print("Password: ");
		String password = input.readLine();

		UserController userController = new UserController();
		User u = null;
		try {
			u = userController.loginUser(user, password);
			if (u == null) {
				System.out.println("Invalid username or password!");
			} else {
				System.out.println("Login successed!");
			}
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	public void addUser(User user) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "INSERT INTO user VALUES(NULL, '" + user.getUser()
					+ "', '" + user.getPassword() + "')";
			PreparedStatement statement = (PreparedStatement) conn
					.prepareStatement(sql);
			statement.execute();
		}
	}

	public void addNewUser() throws IOException, ClassNotFoundException,
			SQLException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("+++++++ Add new user +++++++");
		System.out.print("Username: ");
		String user = input.readLine();
		System.out.print("Password: ");
		String password = input.readLine();
		System.out.print("Confirm: ");
		String confirm = input.readLine();

		if (!password.equals(confirm)) {
			System.out.println("Password confirm is not same!");
		} else {
			try{
			User u = new User(user, password);
			UserController userController = new UserController();
			userController.addUser(u);
			System.out.println("New account is created. Now you can login!");
			}catch(SQLException | ClassNotFoundException ex){
				System.out.println("Error: " + ex.getMessage());
			}
		}

	}
}
