package Ex64;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nguyen Trong Thuan
 * @date: 14/09/2016
 * @version : 1.0 
 * --------------------------- 
 * create class ManageEmployee to manage employee
 *
 */
public class ManageEmployee {

	/**
	 * function check do you want continue
	 * 
	 * @return string is y or n
	 * @throws IOException
	 */
	static List<Employee> lst = new ArrayList<>();

	public static String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want continue ? y/n");
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			// setEmployee(); // add default employee to file
			readInformation();
			String check = "y";
			while (check.equals("y")) {
				System.out.println("Choice: ");
				System.out.println("Press 1: View list employee");
				System.out.println("Press 2: Add new employee");
				System.out.println("Press 3: Search employee");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1: {
					for (Object o : lst) {
						Employee emp = (Employee) o;
						emp.showInfor();
					}

					check = checkContinue();
				}
					break;
				case 2: {
					Employee emp = new Employee();
					emp = createEmployee();
					lst.add(emp);
					addEmployee();
					check = checkContinue();
				}
					break;
				case 3: {
					System.out.println("--------- Search employee ------------");
					System.out.print("Input name employee to search: ");
					String name = input.readLine();
					Employee result = searchEmployee(name);
					if(result == null){
						System.out.println("Employee is not exists!");
					}else{
						result.showInfor();
					}
					check = checkContinue();
				}
					break;
				default:
					throw new ArithmeticException("Choice is not valid!");
				}
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: ");
		}

	}

	// function create object employee
	public static Employee createEmployee() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Input name of employee: ");
		String name = input.readLine();
		System.out.print("Input pay rate: ");
		double payRate = Double.parseDouble(input.readLine());
		System.out.print("Input number of people: ");
		int numOfPeople = Integer.parseInt(input.readLine());
		System.out.print("Input fringe benefits: ");
		double frBenefit = Double.parseDouble(input.readLine());

		Employee emp = new Employee(name, payRate, numOfPeople, frBenefit);

		return emp;
	}

	// function add new employee
	public static void addEmployee() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(
					"src/Ex64/employee.txt"));
			out.reset();
			for(Object o: lst){
				Employee e = (Employee)o;
				out.writeObject(e);
			}
			
			System.out.println("Add employee completed !");
			out.flush();
			
			out.close();
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	// function read information of employee
	public static void readInformation() throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		FileInputStream file = new FileInputStream("src\\Ex64\\employee.txt");
		if (file.available() != 0) {
			try {
				in = new ObjectInputStream(file);
				while (true) {
					lst.add((Employee) in.readObject());
				}
			} catch (EOFException e) {
				in.close();
			}
		}else{
			System.out.println("File employee.txt empty!");
		}
	}

	/**
	 * function search employee
	 * 
	 * @param name
	 * @return object employee or null
	 */
	 public static Employee searchEmployee(String name){
		 for(Object o : lst){
			 Employee e = (Employee)o;
			 if(e.getName().equals(name)){
				 return e;
			 }
			 
		 }
		return null;
	 }
}