
package Ex72;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Trong Thuan
 * @since : 17/09/2016
 * @version: 1.0 create class have main method
 */
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

	public static void main(String[] args) throws ArithmeticException {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Management management = new Management();
			management.loadDepartment();
			management.loadEmployee();
			String check = "y";
			while (check.equals("y")) {
				System.out.println("1. Show all employee in a department");
				System.out.println("2. Add new employee");
				System.out.println("3. Update to xml file");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1: {
					System.out.println("++++++ Show all employee in a department +++++");
					System.out.println("----- List department ----");
					management.showAllDeparment();
					System.out.println("Choice department: ");
					int d = Integer.parseInt(input.readLine());
					System.out.println("------ List employee of deparment you choice -------");
					management.showAllEmployeeInADepartment(d);
					check = checkContinue();
				}
					break;
				case 2: {
					System.out.println("++++ Add new employee into a department +++");
					System.out.println("----- List department ----");
					management.showAllDeparment();
					System.out.println("Choice department: ");
					int d = Integer.parseInt(input.readLine());
					System.out.println("---- Fill information -----");
					System.out.print("id: ");
					String id = input.readLine();
					System.out.print("name: ");
					String name = input.readLine();
					System.out.print("sex (male:1 / female: 0): ");
					String sex = input.readLine();
					System.out.print("day of birth: ");
					String dOb = input.readLine();
					System.out.print("salary: ");
					double salary;
					while (true) {
						salary = Double.parseDouble(input.readLine());
						if (salary > 0) {
							break;
						}
					}
					System.out.print("address: ");
					String address = input.readLine();
					management.addNewEmployee(id, name, sex, dOb, salary, address, d);
					check = checkContinue();
				}
					break;
				case 3: {
					management.updateFileData();
					System.out.println("Completed!");
					check = checkContinue();
				}
				break;
				default:
					throw new ArithmeticException("Choice is not valid!");
				}
			}
		} catch (Exception ex) {
			System.out.println("Err: " + ex.getMessage());
		}
	}

}
