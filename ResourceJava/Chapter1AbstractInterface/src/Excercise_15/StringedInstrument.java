/**
 * Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * -------------------
 * create class stringed instrument
 */
package Excercise_15;

public class StringedInstrument extends Instrument {
	public int numOfLine;

	public StringedInstrument() {
		super();
	}

	public StringedInstrument(String name, String brand, int numOfLine) {
		super(name, brand);
		this.numOfLine = numOfLine;
	}

	public int getNumOfLine() {
		return numOfLine;
	}

	public void setNumOfLine(int numOfLine) {
		this.numOfLine = numOfLine;
	}

	@Override
	public void play() {
		System.out.println("Name: " + name);
		System.out.println("Number of line: " + this.numOfLine);
	}

}
