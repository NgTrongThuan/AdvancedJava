package Ex21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 7/9/2016
 * @version : 1.0
 * ---------------------------
 * create main method to run application
 *
 */
public class runManageCD {
	/**
	 * function check do you want continue
	 * @return string is y or n
	 * @throws IOException
	 */
	public static String checkContinue() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you want continue add CD ? (y/n)");
		String check = input.readLine().toLowerCase();
		if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("The choice is not valid!");
		return check;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			String check = "y";
			ArrayList<CD> arrCD = new ArrayList<>();
			while(check.equals("y")){
				System.out.println("Add CD to list !");
				System.out.print("Input ID: ");
				String id = input.readLine();
				System.out.print("Input name: ");
				String name = input.readLine();
				System.out.print("Singer: ");
				String singer = input.readLine();
				System.out.print("Input amount song: ");
				int amountSong = Integer.parseInt(input.readLine());
				System.out.print("Input price: ");
				double price = Double.parseDouble(input.readLine());
				CD cd = new CD(id, name, singer, amountSong, price);
				arrCD.add(cd);
				check = checkContinue();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD: ");
			double sum = 0;
			for(CD cd : arrCD){
				cd.showInfor();
				sum += cd.getPrice();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("Total price of list CD: " + sum);
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD sorted by name: ");
			Collections.sort(arrCD);
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("List CD: ");
			for(CD cd : arrCD){
				cd.showInfor();
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");	
		}catch(NumberFormatException | ArithmeticException ex){
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
