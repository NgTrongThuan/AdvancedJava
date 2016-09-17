package Ex8;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0
 * create class product
 *
 */
public class Product {
	int id;
	String name;
	double price;
	int amount;
	int category;
	
	public Product() {
		super();
	}

	public Product(String name, double price, int amount, int category) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	// show information of product
	public void show(){
		System.out.println("------------------------------");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Amount: " + amount);
		System.out.println("------------------------------");
	}
}
