/**
 * Nguyen Trong Thuan
 * date: 23/08/2016
 * 
 */
package Excercise_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Input name of instrument: ");
			String name = input.readLine();
			System.out.print("Input brand of instrument: ");
			String brand = input.readLine();
			System.out.println("--------------------------------");
			System.out.println("Choice instrument");
			System.out.println("Press 1: Stringed Instrument");
			System.out.println("Press 2: Non Stringed Instrument");
			int choice = Integer.parseInt(input.readLine());
			if(choice != 1 && choice != 2) throw new ArithmeticException("Choice is not valid!");
			if(choice == 1){
				System.out.print("Input number of line: ");
				int numOfLine = Integer.parseInt(input.readLine());
				StringedInstrument strIn = new StringedInstrument(name, brand, numOfLine); 
				System.out.println("-------------------------------");
				System.out.println("Use stringle instrument: ");
				strIn.play();
			}else{
				System.out.print("Input how to use: ");
				String howToUse = input.readLine();
				NonStringedIntrument nonStrIn = new NonStringedIntrument(name, brand, howToUse);
				System.out.println("-------------------------------");
				System.out.print("Use non stringle instrument: ");
				nonStrIn.play();
			}			
		}catch(NumberFormatException | ArithmeticException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}

	}

}
