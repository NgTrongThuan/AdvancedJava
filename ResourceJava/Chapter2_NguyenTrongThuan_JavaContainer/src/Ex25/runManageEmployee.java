package Ex25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class runManageEmployee {
	/**
	 * function check do you want continue
	 * 
	 * @return string is y or n
	 * @throws IOException
	 */
	public static String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	/**
	 * function show menu to user choice
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void showMenu() {
		System.out.println("++++++++++++++++ Menu +++++++++++++++++++");
		System.out.println("Press 1: View all Employee");
		System.out.println("Press 2: Add new Employee");
		System.out.println("Press 3: Search Employee");
		System.out.println("Press 4: Remove remove Employee");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String check = "y";
			Map emp = new TreeMap<>();
			emp.put("1", new Employee("An", 20));
			while (check.equals("y")) {
				showMenu();
				int choiceMenu = Integer.parseInt(input.readLine());

				switch (choiceMenu) {
				case 1: {
					System.out.println("+++++++++ Employee detail +++++++++");
					if (!emp.isEmpty()) {
						for (Object e : emp.keySet()) {
							Object o = emp.get(e);
							Employee st = (Employee) o;
							st.show();
						}
					} else {
						System.out.println("List Employee is empty!");
					}
					System.out
							.println("++++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 2: {
					System.out
							.println("+++++++++++ Add new Employee ++++++++++++");
					System.out.print("Input id: ");
					String id = input.readLine();
					System.out.print("Input name: ");
					String name = input.readLine();
					System.out.println("Input salary: ");
					double salary = Double.parseDouble(input.readLine());
					emp.put(id, new Employee(name, salary));
					System.out.println("Add Employee completed!");
					System.out.println("+++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 3: {
					System.out
							.println("+++++++++ Search Employee ++++++++++++++++");
					System.out.print("Input id Employee to search: ");
					String idSearch = input.readLine().toLowerCase();
					boolean result = emp.containsKey(idSearch);
					if (result) {
						System.out.println("Employee exists!");
					} else {
						System.out.println("Employee not exists!");
					}

					System.out.println("+++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 4: {
					System.out
							.println("+++++++++++++ Remove Employee +++++++++++");
					System.out.print("Input id Employee want remove: ");
					String empRemove = input.readLine();
					emp.remove(empRemove);
					System.out.println("Remove Employee completed!");

				}
					break;
				default:
					throw new ArithmeticException("Choice value is not valid!");
				}
				System.out.println("Do you want continue back to menu ? (y/n)");
				check = checkContinue();
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}
}
