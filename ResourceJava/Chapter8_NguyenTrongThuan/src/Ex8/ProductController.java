package Ex8;

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
 * @version: 1.0
 * create class product controller
 *
 */
public class ProductController {

	// declare database connection 
	static DatabaseConnection db = new DatabaseConnection();

	// add new product to db
	public void addProduct() throws IOException, ClassNotFoundException, SQLException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+++++++ Add new product +++++++");
		System.out.println("Choice category: ");
		int categoryID = Integer.parseInt(input.readLine());
		System.out.print("Name: ");
		String name = input.readLine();
		System.out.print("Price: ");
		Double price = Double.parseDouble(input.readLine());
		System.out.print("Amount: ");
		int amount = Integer.parseInt(input.readLine());
		try {
			Product p = new Product(name, price, amount, categoryID);
			ProductController productController = new ProductController();
			productController.addProduct(p);
			System.out.println("Add product successed!");
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	// execute add new product
	public void addProduct(Product p) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "INSERT INTO product VALUES(NULL, '" + p.getName() + "', '" + p.getPrice() + "', '"
					+ p.getAmount() + "', '" + p.getCategory() + "')";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	// search product with parameter name of product -> return list product
	public static List<Product> searchProduct(String name) throws ClassNotFoundException, SQLException {
		List<Product> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM product WHERE name like '%" + name + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Product p = new Product();
				p.setId(resultSet.getInt("id"));
				p.setName(resultSet.getString("name"));
				p.setPrice(resultSet.getDouble("price"));
				p.setAmount(resultSet.getInt("amount"));
				p.setCategory(resultSet.getInt("categoryid"));
				rs.add(p);
			}
		}
		return rs;
	}

	// excecute search product
	public void runSearch() throws IOException, SQLException, ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+++++++ Search product +++++++");
		System.out.print("Input name product to search: ");
		String name = input.readLine();
		List<Product> lst;
		try {
			lst = this.searchProduct(name);
			if (lst.size() <= 0) {
				System.out.println("Product is not find!");
			} else {
				for (Product p : lst) {
					p.show();
				}
			}
		} catch (HeadlessException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	// update product with parameter product p
	public void updateProduct(Product p) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "UPDATE product set price = " + p.getPrice() + ", amount = " + p.getAmount() + " where id = "
					+ p.getId() + "";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	// delete product with parameter id of product
	public void deleteProduct(int id) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "DELETE FROM product WHERE id = " + id + "";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
		System.out.println("Delete product completed!");
	}
	
	// get all product in db -> return list of product
	public static List<Product> getAllProduct() throws ClassNotFoundException, SQLException {
		List<Product> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM product";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Product p = new Product();
				p.setId(resultSet.getInt("id"));
				p.setName(resultSet.getString("name"));
				p.setPrice(resultSet.getDouble("price"));
				p.setAmount(resultSet.getInt("amount"));
				p.setCategory(resultSet.getInt("categoryid"));
				rs.add(p);
			}
		}
		return rs;
	}

}
