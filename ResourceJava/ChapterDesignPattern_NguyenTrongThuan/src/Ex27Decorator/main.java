package Ex27Decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan 
 * date: 05/09/2016
 * @version: 1.0 
 * -------------------------- 
 * main method
 *
 */
public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Choice shape:");
			System.out.println("Press 1: Circle");
			System.out.println("Press 2: Rectangle");
			int choice = Integer.parseInt(input.readLine());
			if (choice != 1 && choice != 2)
				throw new ArithmeticException("Choice is not valid!");
			System.out.println("Choice border:");
			System.out.println("Press 1: No border.");
			System.out.println("Press 2: Red border");
			int border = Integer.parseInt(input.readLine());
			if (choice != 1 && choice != 2)
				throw new ArithmeticException("Border is not valid!");
			if (choice == 1) {
				Circle circle = new Circle();
				if(border == 1){
					System.out.println(circle.draw() + "with normal border");
				}else{
					RedShapeDecorator redborder = new RedShapeDecorator(circle);
					System.out.println(redborder.draw() );
				}
			} else {
				Rectangle rectangle = new Rectangle();
				if(border == 1){
					System.out.println(rectangle.draw() + " with normal border");
				}else{
					RedShapeDecorator redborder = new RedShapeDecorator(rectangle);
					System.out.println(redborder.draw() );
				}
			}
		} catch (NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
