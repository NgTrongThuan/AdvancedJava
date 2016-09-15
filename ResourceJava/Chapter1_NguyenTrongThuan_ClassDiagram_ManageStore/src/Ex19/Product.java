package Ex19;

public enum Product {
	IPHONE("Iphone 6S",20000000),
	SAMSUNG("Samsung S7", 19000000),
	SONY("Xperia Z5", 18500000),
	LUMIA("Lumia 950", 10000000);
	
	public String name;
	public double price;
	
	private Product() {
	}

	private Product(String name, double price) {
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
	
}
