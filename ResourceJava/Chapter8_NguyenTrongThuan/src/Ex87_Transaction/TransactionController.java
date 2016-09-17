package Ex87_Transaction;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0 create class transaction controller
 *
 */
public class TransactionController {
	DatabaseConnection db = new DatabaseConnection();

	// run transaction 1
	public void runTransaction1() throws ClassNotFoundException, SQLException {
		Connection conn = db.connect();
		try {
			conn.setAutoCommit(false);
			Statement statement = (Statement) conn.createStatement();
			String sql1 = "INSERT INTO product VALUES(NULL, 'Strawberry Cookies', 45000, 50, 'strawberrycookies.jpg', 4, '2016-9-17', 1)";
			String sql2 = "UPDATE product SET price = 6000, amount = 55 WHERE id = 1";
			String sql3 = "DELETE FROM product where id = 19";
			statement.executeUpdate(sql1);
			statement.executeUpdate(sql2);
			statement.executeUpdate(sql3);
			conn.commit();
		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			conn.rollback();
		}
	}

	// run transaction 2
	public void runTransaction2() throws ClassNotFoundException, SQLException {
		Connection conn = db.connect();
		try {
			conn.setAutoCommit(false);
			String name = "Strawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry Cookies";
			Statement statement = (Statement) conn.createStatement();
			String sql1 = "INSERT INTO product VALUES(NULL, '"+name+"', 45000, 50, 'strawberrycookies.jpg', 4, '2016-9-17', 1)";
			String sql2 = "UPDATE product SET price = 12500, amount = 45 WHERE id = 13";
			String sql3 = "DELETE FROM product where id = 23";
			statement.executeUpdate(sql1);
			statement.executeUpdate(sql2);
			statement.executeUpdate(sql3);
			conn.commit();
		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			conn.rollback();
		}
	}
	
	// run transaction 3
	public void runTransaction3() throws ClassNotFoundException, SQLException {
		Connection conn = db.connect();
		try {
			conn.setAutoCommit(false);
			Statement statement = (Statement) conn.createStatement();
			String sql1 = "INSERT INTO product VALUES(NULL, 'Strawberry Cookies', 45000, 50, 'strawberrycookies.jpg', 4, '2016-9-10', 1)";
			String sql2 = "DELETE FROM product where id = 10";
			String sql3 = "UPDATE product SET price = 50000, amount = 10 WHERE id = 10";
			
			statement.executeUpdate(sql1);
			statement.executeUpdate(sql2);
			statement.executeUpdate(sql3);
			conn.commit();
		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			conn.rollback();
		}
	}
}
