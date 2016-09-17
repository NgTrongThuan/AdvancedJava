package Ex8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.api.jdbc.Statement;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0
 * create class category controller
 *
 */
public class CategoryController {
	
	static DatabaseConnection db = new DatabaseConnection();
	
	// get all category in database
	public List<Category> getAllCategory(){
		List<Category> lst = new ArrayList<>();
		try (Connection conn = db.connect()) {
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM category";
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				Category category = new Category();
				category.setId(resultSet.getInt("id"));
				category.setName(resultSet.getString("name"));
				category.setDescription(resultSet.getString("description"));
				lst.add(category);
			}
			conn.close();
		}catch(SQLException | ClassNotFoundException ex){
			System.out.println("Error: " + ex.getMessage());
		}
		return lst;
	}
}
