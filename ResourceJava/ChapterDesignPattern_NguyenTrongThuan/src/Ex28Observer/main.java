package Ex28Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * ----------------------------
 * main method
 */
public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		try{
			Account account = new Account();
			account.setState(10000000);
			System.out.print("Input money withdraw: ");
			double money = Double.parseDouble(input.readLine());
			if(money > account.getState()) throw new ArithmeticException("The money input is not valid!");
			account.setState(account.getState() - money);
		}catch(NumberFormatException ex){
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
