package Ex34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
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
			System.out.println("Input operand 1: ");
			double operand1 = Double.parseDouble(input.readLine()); 
			System.out.println("Input operand 2: ");
			double operand2 = Double.parseDouble(input.readLine()); 
			Operator op1 = (x, y) -> x + y;
			Operator op2 = (x, y) -> x - y;
			Operator op3 = (x, y) -> x * y;
			Operator op4 = (x, y) -> x / y;
			System.out.println("x + y = " + op1.operate(operand1, operand2));
			System.out.println("x - y = " + op2.operate(operand1, operand2));
			System.out.println("x * y = " + op3.operate(operand1, operand2));
			if(operand2 != 0){
				System.out.println("x : y = " + op4.operate(operand1, operand2));
			}else{
				throw new ArithmeticException("Error / 0");
			}
		}catch(NumberFormatException | ArithmeticException ex){
			System.out.println("Error: " + ex.getMessage());
		}
			
	}

}
