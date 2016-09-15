package Ex91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
 */
public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Choice language: ");
			System.out.println("Press 1: English");
			System.out.println("Press 2: Viet Nam");
			int choice = Integer.parseInt(input.readLine());
			switch(choice){
			case 1:
				choiceEn();
				break;
			case 2:
				choiceVi();
				break;
				default:
					throw new ArithmeticException("Choice is not valid");
			}
		}catch(NullPointerException | ArithmeticException ex){
			System.out.println("Error: " + ex.getMessage());
		}
	}
	// function show list language english
	public static void choiceEn(){
		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message;
		message = ResourceBundle.getBundle("Ex91/resource_en_US", currentLocal);
		List<String> list = new ArrayList<>();
		Enumeration<String > keys = message.getKeys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		for(String str : list){
			System.out.println(str);
		}
	}

	// function show list language vietnam
	public static void choiceVi(){
		String language = "vi";
		String country = "VN";
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message;
		message = ResourceBundle.getBundle("Ex91/resource_vi_VN", currentLocal);
		List<String> list = new ArrayList<>();
		Enumeration<String > keys = message.getKeys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		for(String str : list){
			System.out.println(str);
		}
	}
}
