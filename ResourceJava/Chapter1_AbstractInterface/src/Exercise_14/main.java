/**
 * @author Nguyen Trong Thuan
 * @date: 23/08/2016
 * @version : 1.0
 */
package Exercise_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("---------------------------------------------------");
			System.out.println("Choice shape");
			System.out.println("Press 1: Circle");
			System.out.println("Press 2: Rectangle");
			System.out.println("Press 3: Square");
			System.out.println("---------------------------------------------------");
			int choice = Integer.parseInt(input.readLine());
			switch (choice) {
			case 1: {
				System.out.print("Input R of circle: ");
				double r = Double.parseDouble(input.readLine());
				if(r <= 0) throw new ArithmeticException("R value is not valid!");
				Circle c = new Circle(r);
				System.out.println("Perimeter: " + c.perimeter());
				System.out.println("Area: " + c.area());
			}
				break;
			case 2: {
				System.out.print("Input height of rectangle: ");
				double height = Double.parseDouble(input.readLine());
				if(height <= 0) throw new ArithmeticException("Height is not valid!");
				System.out.print("Input width of rectangle: ");
				double width = Double.parseDouble(input.readLine());
				if(width <= 0) throw new ArithmeticException("Width is not valid!");
				Rectangle rec = new Rectangle(height, width);
				System.out.println("Perimeter: " + rec.perimeter());
				System.out.println("Area: " + rec.area());
			}
				break;
			case 3:{
				System.out.print("Input edge of square: ");
				double edge = Double.parseDouble(input.readLine());
				if(edge <= 0) throw new ArithmeticException("Edge is not valid!");
				Square square = new Square(edge);
				System.out.println("Perimeter: " + square.perimeter());
				System.out.println("Area: " + square.area());
			}
				break;
			default:
				System.out.println("Choice value is not valid!");
			}

		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("ERRROR: " + ex.getMessage());
		}

	}
}
