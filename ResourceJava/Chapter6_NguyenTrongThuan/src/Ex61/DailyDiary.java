package Ex61;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 14/09/2016
 * @version: 1.0 
 * -------------------------- 
 * create class Daily diary
 */
public class DailyDiary {

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

	// main method: user choice function read or write file
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String check = "y";
			while (check.endsWith("y")) {
				System.out.println("Choice");
				System.out.println("Press 1: Read file daily diary");
				System.out.println("Press 2: Write file daily diary");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1: {
					System.out.println("Content of daily diary: ");
					System.out.println(readDiary());
					check = checkContinue();
				}
					break;
				case 2: {
					System.out.println("Input content to write: ");
					String content = input.readLine();
					writeDiary(content);
					check = checkContinue();
				}
					break;
				default:
					throw new ArithmeticException("Choice is not valid");
				}
				
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error" + ex.getMessage());
		}
	}

	// function get date current return string date
	public static String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String date = dateFormat.format(cal.getTime());
		return date;
	}

	// function read file diary
	public static String readDiary() throws FileNotFoundException, IOException {
		String diary = "";
		String date;
		String content;
		try (DataInputStream in = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(
								"src\\Ex61\\daily.txt")))) {
			while (in.available() > 0) {
				date = in.readUTF();
				content = in.readUTF();
				diary += date + "\n" + content + "\n\n";
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return diary;
	}

	// function write diary
	public static void writeDiary(String content) throws FileNotFoundException {
		String date = getDate();
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(
								"src\\Ex61\\daily.txt", true)))) {
			out.writeUTF(date);
			out.writeUTF(content);
			System.out.println("Diary have been writen!");
			out.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
