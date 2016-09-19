package Part2_Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 19/9/2016
 * @version: 1.0
 * create class Main
 *
 */
public class Main {

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
		CDController controller = new CDController();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out.println("Choice: ");
				System.out.println("Press 1: Add new CD");
				System.out.println("Press 2: Search CD");
				System.out.println("Press 3: Update CD");
				System.out.println("Press 4: Delete CD");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1:{
					controller.runAddCD();
					check = checkContinue();
				}
					break;
				case 2:{
					controller.runSearchCD();
					check = checkContinue();
				}
					break;
				case 3: {
					controller.runUpdateCD();
					check = checkContinue();
				}
					break;
				case 4:{
					controller.runDeleteCD();
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
