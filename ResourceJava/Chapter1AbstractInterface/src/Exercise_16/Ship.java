/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * --------------------------
 * create class ship
 */
package Exercise_16;

public class Ship extends Transport {
	public double weight;
	public double capacity;
	public double velocitySame;
	public double velocityReverse;
	public double fuelStart;
	public String typeFuel;

	public Ship() {
		super();
	}

	public Ship(double distance, double time, double literFuel, String id, String owner, String color, String brand,
			double weight, double capacity, double velocitySame, double velocityReverse, double fuelStart,
			String typeFuel) {
		super(distance, time, literFuel, id, owner, color, brand);
		this.weight = weight;
		this.capacity = capacity;
		this.velocitySame = velocitySame;
		this.velocityReverse = velocityReverse;
		this.fuelStart = fuelStart;
		this.typeFuel = typeFuel;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getVelocitySame() {
		return velocitySame;
	}

	public void setVelocitySame(double velocitySame) {
		this.velocitySame = velocitySame;
	}

	public double getVelocityReverse() {
		return velocityReverse;
	}

	public void setVelocityReverse(double velocityReverse) {
		this.velocityReverse = velocityReverse;
	}

	public double getFuelStart() {
		return fuelStart;
	}

	public void setFuelStart(double fuelStart) {
		this.fuelStart = fuelStart;
	}

	public String getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}

	@Override
	public double calculateVelocity() {
		double result = distance / time + velocitySame - velocityReverse;
		return result;
	}

	@Override
	public double calcSpendFuel() {
		double result = distance / (literFuel - fuelStart);
		return result;
	}

	@Override
	public String toString() {
		return "Ship [weight=" + weight + ", capacity=" + capacity + ", velocitySame=" + velocitySame
				+ ", velocityReverse=" + velocityReverse + ", fuelStart=" + fuelStart + ", typeFuel=" + typeFuel
				+ ", id=" + id + ", owner=" + owner + ", color=" + color + ", brand=" + brand + ", distance=" + distance
				+ ", time=" + time + ", literFuel=" + literFuel + ", calculateVelocity()=" + calculateVelocity()
				+ ", calcSpendFuel()=" + calcSpendFuel() + "]";
	}

}
