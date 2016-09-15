package Ex33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 09/09/2016
 * @version : 1.0
 * --------------------------
 * main method to run
 *
 */
public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Input radius: ");
			double r = Double.parseDouble(input.readLine());
			Area circle = (x1, x2) -> x1 * Math.pow(x2, 2);
			System.out.println("S =  PI * r * r = " + circle.calArea(Math.PI, r));
			System.out.println("Input high: ");
			double h = Double.parseDouble(input.readLine());
			System.out.println("Input weight: ");
			double w = Double.parseDouble(input.readLine());
			Area rectangle = (x1, x2) -> x1 * x2;
			System.out.println("S = h * w = " + rectangle.calArea(h, w));
		}catch(NumberFormatException | ArithmeticException ex){
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
