package Exercise_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan
 * @date: 24/08/2016
 * version : 1.0
 *----------------------------------
 * main to run some methods in class gift box
 */
public class MainGiftBox {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Input shape: ");
			String shape = input.readLine();
			System.out.println("Input color: ");
			String color = input.readLine();
			System.out.println("Input name: ");
			String name = input.readLine();
			System.out.println("Input weight: ");
			double weight = Double.parseDouble(input.readLine());
			if(weight <= 0) throw new ArithmeticException("Weight value is not valid!");
			GiftBox.Gift gift = new GiftBox(shape, color).new Gift(name, weight);
			System.out.println("Fee: " + gift.calFee()); 
		}catch(NumberFormatException | ArithmeticException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}

	}

}
