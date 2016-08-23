/**
 * Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * create abstract class instrument
 */
package Excercise_15;

public abstract class Instrument {
	public String name;
	public String brand;
	
	public Instrument() {
		super();
	} 
	
	public Instrument(String name, String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public abstract void play();
	
}
