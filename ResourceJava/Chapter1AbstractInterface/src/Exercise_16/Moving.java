/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * Version 1.0
 * -------------------------
 * create abstract moving
 */
package Exercise_16;

public abstract class Moving implements ICalcVelocity, ICalcSpendFuel {
	public double distance;
	public double time;
	public double literFuel;

	public Moving() {
		super();
	}

	public Moving(double distance, double time, double literFuel) {
		super();
		this.distance = distance;
		this.time = time;
		this.literFuel = literFuel;
	}

}
