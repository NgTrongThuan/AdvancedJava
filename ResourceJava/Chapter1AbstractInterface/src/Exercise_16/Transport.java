/**
 * @author: Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * -----------------------------
 * create abstract class vehicle
 */
package Exercise_16;

public abstract class Transport {
	public String id;
	public String owner;
	public String color;
	public String brand;
	
	public Transport() {
		super();
	}

	public Transport(String id, String owner, String color, String brand) {
		super();
		this.id = id;
		this.owner = owner;
		this.color = color;
		this.brand = brand;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
