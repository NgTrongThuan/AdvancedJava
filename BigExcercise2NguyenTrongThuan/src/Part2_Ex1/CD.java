package Part2_Ex1;
/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 19/9/2016
 * @version: 1.0
 * create class CD to manage CD
 *
 */
public class CD {
	int id;
	String name;
	String singer;
	int numOfSong;
	double price;
	
	public CD() {
		super();
	}

	public CD(String name, String singer, int numOfSong, double price) {
		super();
		this.name = name;
		this.singer = singer;
		this.numOfSong = numOfSong;
		this.price = price;
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

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumOfSong() {
		return numOfSong;
	}

	public void setNumOfSong(int numOfSong) {
		this.numOfSong = numOfSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// override function toString to show information of CD
	@Override
	public String toString() {
		return "CD [id=" + id + ", name=" + name + ", singer=" + singer
				+ ", numOfSong=" + numOfSong + ", price=" + price + "]";
	}
	
	
}
