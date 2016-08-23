/**
 * Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * -------------------
 * create class non stringed instrument
 */
package Excercise_15;

public class NonStringedIntrument extends Instrument {
	public String howToUse;

	public NonStringedIntrument() {
		super();
	}

	public NonStringedIntrument(String name, String brand, String howToUse) {
		super(name, brand);
		this.howToUse = howToUse;
	}

	public String getHowToUse() {
		return howToUse;
	}

	public void setHowToUse(String howToUse) {
		this.howToUse = howToUse;
	}

	@Override
	public void play() {
		System.out.println("This is use of non stringed instrument!");
	}

}
