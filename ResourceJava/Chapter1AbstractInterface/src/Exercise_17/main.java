/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * --------------------------
 */
package Exercise_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
			ArrayList<Bird> arrBird = new ArrayList<>();
			ArrayList<Fish> arrFish = new ArrayList<>();
			ArrayList<Snake> arrSnake = new ArrayList<>();
			ArrayList<Tiger> arrTiger = new ArrayList<>();
			while (check.equals("y")) {
				System.out.println("-----------------------------------------");
				System.out.print("Input name: ");
				String name = input.readLine();
				System.out.print("Input food: ");
				String food = input.readLine();
				System.out.println("-----------------------------------------");
				System.out.println("Choice animal: ");
				System.out.println("Press 1: Bird");
				System.out.println("Press 2: Fish");
				System.out.println("Press 3: Tiger");
				System.out.println("Press 4: Snake");
				int choice = Integer.parseInt(input.readLine());
				System.out.println("-----------------------------------------");
				switch (choice) {
				case 1: {
					arrBird.add(new Bird(name, food));
					System.out.println("Add bird successfull!");
					check = choice();
				}
					break;
				case 2: {
					arrFish.add(new Fish(name, food));
					System.out.println("Add fish successfull!");
					check = choice();
				}
					break;
				case 3: {
					arrTiger.add(new Tiger(name, food));
					System.out.println("Add tiger successful!");
					check = choice();
				}
					break;
				case 4:{
					arrSnake.add(new Snake(name, food));
					System.out.println("Add snake successful!");
					check = choice();
				}
					break;
				default:
					throw new ArithmeticException("Choice value is not valid!");
				}
			}
			System.out.println("-----------------------------------------");
			if(!arrBird.isEmpty()){
				for(Bird bird : arrBird){
					bird.showInformation();
					bird.fly();
					bird.run();
					bird.nest();
					System.out.println("-----------------------------------------");
				}
			}
			if(!arrFish.isEmpty()){
				for(Fish fish : arrFish){
					fish.showInformation();
					fish.swim();
					System.out.println("------------------------------------------");
				}
			}
			if(!arrTiger.isEmpty()){
				for(Tiger tiger : arrTiger){
					tiger.showInformation();
					tiger.cave();
					tiger.run();
					System.out.println("-------------------------------------------");
				}
			}
			if(!arrSnake.isEmpty()){
				for(Snake snake : arrSnake){
					snake.showInformation();
					snake.cave();
					snake.run();
					snake.grow();
				}
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

}
