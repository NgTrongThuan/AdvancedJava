package Ex30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 * @version: 1.0
 * --------------------------
 * main to demo ex20, user input string type shape then application will generate object match to string input
 *
 */
public class main {

	public static void main(String[] args) throws IOException {
		try{
		ShapeFactory shapeFactory = new ShapeFactory();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input shape: ");
		String shapeType = input.readLine().toUpperCase();
		Shape shape =  shapeFactory.getShape(shapeType);
		shape.draw();
		}catch(NumberFormatException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}
