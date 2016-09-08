package Ex24;
/*
 * Author : Nguyen Trong Thuan
 * Date : 08 Sept 2016
 * Version 2.0
 */
public class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name: "+name;
	}
	
}
