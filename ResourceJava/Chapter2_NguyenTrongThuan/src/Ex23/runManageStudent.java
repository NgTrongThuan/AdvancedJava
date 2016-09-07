package Ex23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Ex22.WordEnglish;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 7/9/2016
 * @version : 1.0
 * ----------------------------
 * main method to run application
 *
 */
public class runManageStudent {

	/**
	 * function check do you want continue
	 * @return string is y or n
	 * @throws IOException
	 */
	public static String checkContinue() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String check = input.readLine().toLowerCase();
		if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("The choice is not valid!");
		return check;
	}
	
	
	/**
	 * function show menu to user choice
	 * @param args
	 * @throws IOException
	 */
	public static void showMenu(){
		System.out.println("++++++++++++++++ Menu +++++++++++++++++++");
		System.out.println("Press 1: View all students");
		System.out.println("Press 2: Add new student");
		System.out.println("Press 3: Search student");
		System.out.println("Press 4: Remove remove student");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			String check = "y";
			Map student = new HashMap<>();
			student.put("1", new Student("An", 20, "TPHCM"));
			while(check.equals("y")){
				showMenu();
				int choiceMenu = Integer.parseInt(input.readLine());
				
				switch(choiceMenu){
				case 1:{
					System.out.println("+++++++++ Student detail +++++++++");
					if(!student.isEmpty()){
						for (Object e: student.keySet())
						{
							Object o = student.get(e);
							Student st = (Student)o;
							st.show();
						}
					}else{
						System.out.println("List student is empty!");
					}
					System.out.println("++++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 2:{
						System.out.println("+++++++++++ Add new student ++++++++++++");
						System.out.print("Input id: ");
						String id = input.readLine();
						System.out.print("Input name: ");
						String name = input.readLine();
						System.out.print("Input age: ");
						int age = Integer.parseInt(input.readLine());
						System.out.print("Input place of birth: ");
						String placeOfBirth = input.readLine();
						student.put(id, new Student(name, age, placeOfBirth));
						System.out.println("Add student completed!");
						System.out.println("+++++++++++++++++++++++++++++++++++++");
					}
					break;
				case 3:{
					System.out.println("+++++++++ Search student ++++++++++++++++");
					System.out.print("Input id student to search: ");
					String idSearch = input.readLine().toLowerCase();
					boolean result = student.containsKey(idSearch);
					if(result){
						System.out.println("Student exists!");
					}else{
						System.out.println("Student not exists!");
					}
					
					System.out.println("+++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 4:{
					System.out.println("+++++++++++++ Remove student +++++++++++");
					System.out.print("Input id student want remove: ");
					String studentRemove = input.readLine();
					student.remove(studentRemove);
					System.out.println("Remove student completed!");

					
				}
					break;
				default:
					throw new ArithmeticException("Choice value is not valid!");
				}
				System.out.println("Do you want continue back to menu ? (y/n)");
				check = checkContinue();
			}
		}catch(NumberFormatException | ArithmeticException ex){
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
