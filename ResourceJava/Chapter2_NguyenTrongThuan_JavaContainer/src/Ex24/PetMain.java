package Ex24;

/*
 * Author : Nguyen Trong Thuan
 * Date : 08 Sept 2016
 * Version 2.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetMain {

	public static void main(String[] args) throws IOException {
		PetManager<Dog> managerDog = new PetManager<Dog>();
		PetManager<Cat> managerCat = new PetManager<Cat>();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter list dog: ");
		String Dogs = input.readLine();
		System.out.println("Enter list cat: ");
		String Cats = input.readLine();
		String DogNames[] = Dogs.split(",");
		String CatNames[] = Cats.split(",");
		// input dog into list dog
		for (String DogName : DogNames) {
			managerDog.getPets().add(new Dog(DogName));
		}
		// input cat into list cat
		for (String CatName : CatNames) {
			managerCat.getPets().add(new Cat(CatName));
		}
		// print list dog
		System.out.println("===============Dog===================");
		if (managerDog != null && !managerDog.getPets().isEmpty()) {
			for (int i = 0; i < managerDog.getPets().size(); i++) {
				System.out.println(managerDog.getPets().get(i).toString());
			}
		}
		// print list cat
		System.out.println("----------------------------------");
		System.out.println("===============Cat==================");
		if (managerCat != null && !managerCat.getPets().isEmpty()) {
			for (int i = 0; i < managerCat.getPets().size(); i++) {
				System.out.println(managerCat.getPets().get(i).toString());
			}
		}
		System.out.println("--------------------------------------");
	}

}
