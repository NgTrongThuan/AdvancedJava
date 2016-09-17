package Ex8;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class main {

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

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		UserController userController = new UserController();
		ProductController p = new ProductController();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out.println("Choice");
				System.out.println("Press 1: Check login");
				System.out.println("Press 2: Add new user");
				System.out.println("Press 3: Show category");
				System.out.println("Press 4: Add product");
				System.out.println("Press 5: Search product");
				System.out.println("Press 6: Update product");
				System.out.println("Press 7: Delete product");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1:{
					userController.checkLogin();
					check = checkContinue();
				}
					break;
				case 2:{
					userController.addNewUser();
					check = checkContinue();
				}
					break;
				case 3: {
					CategoryController categoryController = new CategoryController();
					List<Category> category = new ArrayList<>();
					category = categoryController.getAllCategory();
					System.out.println("+++++++ List category ++++++++");
					for (Category c : category) {
						System.out.println("--------------------------------------");
						System.out.println("Id:" + c.getId());
						System.out.println("Name: " + c.getName());
						System.out.println("Description: " + c.getDescription());
						System.out.println("--------------------------------------");
					}
					check = checkContinue();
				}
					break;
				case 4:{
					p.addProduct();
					check = checkContinue();
				}
					break;
				case 5:{
					p.runSearch();
					check = checkContinue();
				}
					break;
				case 6:{
					List<Product> lst = p.getAllProduct();
					System.out.println("+++++++++ List product ++++++++++");
					for(Product product : lst){
						product.show();
					}
					System.out.print("Choice ID product to update: ");
					int id = Integer.parseInt(input.readLine());
					System.out.print("Input amount update: ");
					int amount = Integer.parseInt(input.readLine());
					System.out.print("Input price update: ");
					double price = Double.parseDouble(input.readLine());
					Product item = new Product();
					for(int i = 0; i < lst.size(); i++){
						if(i == id - 1){
							item = lst.get(i);
						}
					}
					item.setAmount(amount);
					item.setPrice(price);
					p.updateProduct(item);
					System.out.println("Update completed!");
					check = checkContinue();
				}
					break;
				case 7:{
					List<Product> lst = p.getAllProduct();
					System.out.println("+++++++++ List product ++++++++++");
					for(Product product : lst){
						product.show();
					}
					System.out.print("Choice ID product to delete: ");
					int id = Integer.parseInt(input.readLine());
					p.deleteProduct(id);
					System.out.println("Delete completed!");
					check = checkContinue();
				}
					break;
				default:
					throw new ArithmeticException("Choice is not valid!");
				}
			}
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
