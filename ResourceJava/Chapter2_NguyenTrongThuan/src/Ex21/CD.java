package Ex21;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 7/9/2016
 * @version : 1.0
 * -------------------------
 * create class managecd to manage CD
 *
 */
public class CD implements Comparable<CD>{
	public String id;
	public String name;
	public String singer;
	public int amountSong;
	public double price;
	
	public CD() {
		super();
	}

	public CD(String id, String name, String singer, int amountSong,
			double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.amountSong = amountSong;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getAmountSong() {
		return amountSong;
	}

	public void setAmountSong(int amountSong) {
		this.amountSong = amountSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * function show information of CD
	 */
	public void showInfor(){
		System.out.println("---------------------------");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Singer: " + singer);
		System.out.println("Amount of song: " + amountSong);
		System.out.println("Price: " + price);
		System.out.println("---------------------------");
	}

	/**
	 * override method compareTo
	 */
	@Override
	public int compareTo(CD o) {
		return this.name.compareTo(o.name);
	}
	
}
