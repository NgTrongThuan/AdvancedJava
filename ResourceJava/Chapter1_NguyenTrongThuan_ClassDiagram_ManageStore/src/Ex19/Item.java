package Ex19;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 29-Aug-2016 8:21:38 AM
 * -------------------------------
 * create class item to manager about item
 */
public class Item {

	private String name;
	private double price;

	public Item(){

	}

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void finalize() throws Throwable {

	}

	public Item getInformation(){
		return null;
	}

	/**
	 * function show information of item
	 */
	public void showInforItem(){
		System.out.println("Item: " + name);
		System.out.println(String.format("Price: %.2f", price));
	}
}