/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * ----------------------------
 * create abstract animal
 * 
 */
package Exercise_17;

public abstract class Animal {
	public String name;
	public String food;
	
	
	public Animal() {
		super();
	}


	public Animal(String name, String food) {
		super();
		this.name = name;
		this.food = food;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}
	
	public void showInformation(){
		System.out.println("Name: " + name);
		System.out.println("Food: " + food);
	}
}
