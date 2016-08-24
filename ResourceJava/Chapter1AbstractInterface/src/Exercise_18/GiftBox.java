/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 */
package Exercise_18;

/**
 * 
 * create class gift box
 * class gift box to manager gift
 *
 */
public class GiftBox {
	public String shape;
	public String color;
	final int price = 10000;

	public GiftBox(String shape, String color) {
		this.shape = shape;
		this.color = color;
	}

	class Gift {
		public String name;
		public double weight;
		final int FEE = 200;

		public Gift(String name, double weight) {
			this.name = name;
			this.weight = weight;
		}

		public double calFee() {
			return this.weight * this.FEE + GiftBox.this.price;
		}
	}
}
