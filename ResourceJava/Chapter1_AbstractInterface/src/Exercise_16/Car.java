/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * -----------------------------
 * create class car
 */
package Exercise_16;

public class Car extends Transport {
	public String gear;
	public String model;

	public Car() {
		super();
	}

	public Car(double distance, double time, double literFuel, String id, String owner, String color, String brand,
			String gear, String model) {
		super(distance, time, literFuel, id, owner, color, brand);
		this.gear = gear;
		this.model = model;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * function calculate velocity
	 * output: velocity
	 */ 
	@Override
	public double calculateVelocity() {
		return distance / time;
	}
	
	/**
	 * function calculate calculate fuel spend
	 * output: return fuel spend
	 */ 
	@Override
	public double calcSpendFuel() {
		return distance / literFuel;
	}
	
	/**
	 * function show information of car
	 */ 
	@Override
	public String toString() {
		return "Car [gear=" + gear + ", model=" + model + ", id=" + id + ", owner=" + owner + ", color=" + color
				+ ", brand=" + brand + ", distance=" + distance + ", time=" + time + ", literFuel=" + literFuel
				+ ", calculateVelocity()=" + calculateVelocity() + ", calcSpendFuel()=" + calcSpendFuel() + "]";
	}
}
