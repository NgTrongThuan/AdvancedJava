package Ex63;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 14/09/2016
 * @version: 1.0
 *
 */
public class ManageStudent {

	/**
	 * function check do you want continue
	 * 
	 * @return string is y or n
	 * @throws IOException
	 */
	public static String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want continue ? y/n");
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out.println("Choice:");
				System.out.println("Press 1: Add new student");
				System.out.println("Press 2: View list of students");
				System.out.println("Press 3: Statistic");
				int choice = Integer.parseInt(input.readLine());
				List<Student> lst = new ArrayList<>();
				lst = readFile();
				switch (choice) {
				case 1: {
					writeFile(addStudent());
					check = checkContinue();
				}
					break;
				case 2: {
					for (Object o : lst) {
						Student st = (Student) o;
						st.showInformation();
					}
					check = checkContinue();
				}
					break;
				case 3: {
					statisticStudent(lst);
					check = checkContinue();
				}
					break;
				default:
					throw new ArithmeticException("Choice is not valid!");
				}
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	// function read file
	public static List<Student> readFile() throws FileNotFoundException,
			IOException {
		List<Student> lst = new ArrayList<>();
		String name;
		int grade;
		double semaster1;
		double semaster2;
		double avg;
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src\\Ex63\\tongketnamhoc.txt")))) {
			while (in.available() > 0) {
				name = in.readUTF();
				grade = in.readInt();
				semaster1 = in.readDouble();
				semaster2 = in.readDouble();
				Student st = new Student(name, grade, semaster1, semaster2);
				lst.add(st);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return lst;
	}

	// function write
	public static void writeFile(Student st) throws FileNotFoundException {
		String name = st.getName();
		int grade = st.getLevel();
		double semaster1 = st.getMarkFisrtSemester();
		double semaster2 = st.getMarkSecondSemester();
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src\\Ex63\\tongketnamhoc.txt", true)))) {
			out.writeUTF(name);
			out.writeInt(grade);
			out.writeDouble(semaster1);
			out.writeDouble(semaster2);
			System.out.println("Student have been added!");
			out.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// function add new student
	public static Student addStudent() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("------- Add new student -------");
		System.out.print("Input name: ");
		String name = input.readLine();
		System.out.print("Input grade: ");
		int grade = Integer.parseInt(input.readLine());
		System.out.print("Input semaster 1: ");
		Double semaster1 = Double.parseDouble(input.readLine());
		System.out.print("Input semaster 2: ");
		Double semaster2 = Double.parseDouble(input.readLine());
		Student st = new Student(name, grade, semaster1, semaster2);
		return st;
	}
	
	// function statistic student
	public static void statisticStudent(List<Student> student){
		List<Student> lst10 =  student.stream().filter(st -> st.getLevel() == 10).collect(Collectors.toList());
		List<Student> lst11 =  student.stream().filter(st -> st.getLevel() == 11).collect(Collectors.toList());
		List<Student> lst12 =  student.stream().filter(st -> st.getLevel() == 12).collect(Collectors.toList());
		
		int count10 = 0;
		int count11 = 0;
		int count12 = 0;
		
		double sumMark10 = 0;
		double sumMark11 = 0;
		double sumMark12 = 0;
		
		System.out.println("+++++++++++++ List student of grade 10 +++++++++++++++++");
		for(Object o : lst10){
			Student st = (Student)o;
			st.showInformation();
			count10 ++;
			sumMark10 += st.calAvg();
		}
		
		System.out.println("+++++++++++++ List student of grade 11 +++++++++++++++++");
		for(Object o : lst11){
			Student st = (Student)o;
			st.showInformation();
			count11 ++;
			sumMark11 += st.calAvg();
		}
		
		System.out.println("+++++++++++++ List student of grade 12 +++++++++++++++++");
		for(Object o : lst12){
			Student st = (Student)o;
			st.showInformation();
			count12 ++;
			sumMark12 += st.calAvg();
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Stream<Student> streamStGood = student.stream();
		System.out.println("Number of student good: " + streamStGood.filter(st -> st.calAvg() >= 8).count());
		
		Stream<Student> streamStHard = student.stream();
		System.out.println("Number of student hard: " + streamStHard.filter(st -> (st.calAvg() >= 7 && st.calAvg() < 8)).count());
		
		Stream<Student> streamStMedium = student.stream();
		System.out.println("Number of student medium: " + streamStMedium.filter(st -> (st.calAvg() >= 5 && st.calAvg() < 7)).count());
		
		Stream<Student> streamStBad = student.stream();
		System.out.println("Number of student bad: " + streamStBad.filter(st -> st.calAvg() < 5).count());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Number of student of grade 10: " + count10);
		System.out.println("Avg of mark grade 10: " + sumMark10 / count10);
		System.out.println("----------------------------------------------------------");
		System.out.println("Number of student of grade 11: " + count11);
		System.out.println("Avg of mark grade 11: " + sumMark11 / count11);
		System.out.println("----------------------------------------------------------");
		System.out.println("Number of student of grade 12: " + count12);
		System.out.println("Avg of mark grade 12: " + sumMark12 / count12);
		System.out.println("----------------------------------------------------------");
		
		
		
	}
}
