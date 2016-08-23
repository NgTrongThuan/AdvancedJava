/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 */

package Exercise_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static String choice() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("---------------------------------------------");
		System.out.println("Do you want continue (y/n)");
		String check = input.readLine().toLowerCase();
		return check;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out
						.println("--------------------------------------------");
				System.out.print("Input distance: ");
				double distance = Double.parseDouble(input.readLine());
				if (distance <= 0)
					throw new ArithmeticException("Distance is not valid!");
				System.out.print("Input time: ");
				double time = Double.parseDouble(input.readLine());
				if (time <= 0)
					throw new ArithmeticException("Time is not valid!");
				System.out.print("Input amount liter of fuel: ");
				double amountFuel = Double.parseDouble(input.readLine());
				if (amountFuel <= 0)
					throw new ArithmeticException("Amount is not valid!");
				System.out.print("Input ID: ");
				String id = input.readLine();
				System.out.print("Input owner: ");
				String owner = input.readLine();
				System.out.print("Input color: ");
				String color = input.readLine();
				System.out.print("Input brand: ");
				String brand = input.readLine();
				System.out
						.println("---------------------------------------------");
				System.out.println("Choice: ");
				System.out.println("Press 1: Car");
				System.out.println("Press 2: Ship");
				int choice = Integer.parseInt(input.readLine());
				System.out
						.println("---------------------------------------------");
				if (choice != 1 && choice != 2)
					throw new ArithmeticException("Choice value is not valid!");
				if (choice == 1) {
					System.out.print("Input gear: ");
					String gear = input.readLine();
					System.out.print("Input model of car: ");
					String model = input.readLine();
					System.out.println("Car is add completed!");
					check = choice();
				} else {
					System.out.print("Input weight: ");
					double weight = Double.parseDouble(input.readLine());
					System.out.print("Input capacity: ");
					double capacity = Double.parseDouble(input.readLine());
					System.out.print("Input velocity same way with water: ");
					double velocitySame = Double.parseDouble(input.readLine());
					System.out.print("Input velocity reserse way with water: ");
					double velocityReserse = Double.parseDouble(input
							.readLine());
					System.out.print("Input fuel spend when start: ");
					double fuelStart = Double.parseDouble(input.readLine());
					System.out.print("Input type of Fuel: ");
					String typeFuel = input.readLine();
					check = choice();
				}
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}

	}

}
