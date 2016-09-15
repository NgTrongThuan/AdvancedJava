package Ex92;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 13/9/2016
 * @version : 1.0
 * -------------------------
 * create class CD to manage CD
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
	public void showInforEn(){
		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message;
		message = ResourceBundle.getBundle("Ex92/resource_en_US", currentLocal);
		List<String> list = new ArrayList<>();
		Enumeration<String > keys = message.getKeys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		System.out.println("---------------------------");
		System.out.println(message.getString("id") + ": " + id);
		System.out.println(message.getString("name") + ": " + name);
		System.out.println(message.getString("singer") + ": " + singer);
		System.out.println(message.getString("number") + ": " + amountSong);
		System.out.println(message.getString("price") + ": " + price);
		System.out.println("---------------------------");
	}
	
	public void showInforVi(){
		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message;
		message = ResourceBundle.getBundle("Ex92/resource_vi_VN", currentLocal);
		List<String> list = new ArrayList<>();
		Enumeration<String > keys = message.getKeys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		System.out.println("---------------------------");
		System.out.println(message.getString("id") + ": " + id);
		System.out.println(message.getString("name") + ": " + name);
		System.out.println(message.getString("singer") + ": " + singer);
		System.out.println(message.getString("number") + ": " + amountSong);
		System.out.println(message.getString("price") + ": " + price);
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
