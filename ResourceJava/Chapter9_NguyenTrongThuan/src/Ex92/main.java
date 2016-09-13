package Ex92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 13/09/2016
 * @version: 1.0 
 * -------------------------- 
 * create main method
 *
 */
public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Choice language:");
			System.out.println("Press 1: English");
			System.out.println("Press 2: Viet Nam");
			int choice = Integer.parseInt(input.readLine());
			switch (choice) {
			case 1: {
				choiceEn();
			}
				break;
			case 2:{
				choiceVi();
			}
			default:
				throw new ArithmeticException("Choice is not valid!");
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

	public static void choiceEn() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String language = "en";
			String country = "US";
			Locale currentLocal = new Locale(language, country);
			ResourceBundle message;
			message = ResourceBundle.getBundle("Ex92/resource_en_US", currentLocal);
			List<String> list = new ArrayList<>();
			Enumeration<String> keys = message.getKeys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = message.getString(key);
				list.add(value);
			}
			String check = "y";
			ArrayList<CD> arrCD = new ArrayList<>();
			while (check.equals("y")) {
				System.out.println("Add CD:");
				System.out.print(message.getString("id") + ": ");
				String id = input.readLine();
				System.out.print(message.getString("name") + ": ");
				String name = input.readLine();
				System.out.print(message.getString("singer") + ": ");
				String singer = input.readLine();
				System.out.print(message.getString("number") + ": ");
				int amountSong = Integer.parseInt(input.readLine());
				System.out.print(message.getString("price") + ": ");
				double price = Double.parseDouble(input.readLine());
				CD cd = new CD(id, name, singer, amountSong, price);
				arrCD.add(cd);
				check = checkContinueEn();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD: ");
			double sum = 0;
			for (CD cd : arrCD) {
				cd.showInforEn();
				sum += cd.getPrice();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println(message.getString("sumprice")  + ": " + sum);
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD sorted by name: ");
			Collections.sort(arrCD);
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD: ");
			for (CD cd : arrCD) {
				cd.showInforEn();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	public static void choiceVi() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String language = "vi";
			String country = "VN";
			Locale currentLocal = new Locale(language, country);
			ResourceBundle message;
			message = ResourceBundle.getBundle("Ex92/resource_vi_VN", currentLocal);
			List<String> list = new ArrayList<>();
			Enumeration<String> keys = message.getKeys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = message.getString(key);
				list.add(value);
			}
			String check = "y";
			ArrayList<CD> arrCD = new ArrayList<>();
			while (check.equals("y")) {
				System.out.println("Add CD:");
				System.out.print(message.getString("id") + ": ");
				String id = input.readLine();
				System.out.print(message.getString("name") + ": ");
				String name = input.readLine();
				System.out.print(message.getString("singer") + ": ");
				String singer = input.readLine();
				System.out.print(message.getString("number") + ": ");
				int amountSong = Integer.parseInt(input.readLine());
				System.out.print(message.getString("price") + ": ");
				double price = Double.parseDouble(input.readLine());
				CD cd = new CD(id, name, singer, amountSong, price);
				arrCD.add(cd);
				check = checkContinueVi();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD: ");
			double sum = 0;
			for (CD cd : arrCD) {
				cd.showInforEn();
				sum += cd.getPrice();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println(message.getString("sumprice")  + ": " + sum);
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD sorted by name: ");
			Collections.sort(arrCD);
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD: ");
			for (CD cd : arrCD) {
				cd.showInforEn();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}


	public static String checkContinueEn() throws IOException {
		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message;
		message = ResourceBundle.getBundle("Ex92/resource_en_US", currentLocal);
		List<String> list = new ArrayList<>();
		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println(message.getString("continue") + "?" + message.getString("yes") + "/" + message.getString("no"));
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	public static String checkContinueVi() throws IOException {
		String language = "vi";
		String country = "VN";
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message;
		message = ResourceBundle.getBundle("Ex92/resource_vi_VN", currentLocal);
		List<String> list = new ArrayList<>();
		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println(message.getString("continue") + "?" + message.getString("yes") + "/" + message.getString("no"));
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("Chọn không đúng");
		return check;
	}
}
