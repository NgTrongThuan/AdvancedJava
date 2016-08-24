package Exercise_14;

/**
 * 
 * @author Nguyen Trong Thuan
 * @date: 23/08/2016
 * @version: 1.0 
 * --------------------------- 
 * create class circle extends shape
 */
public class Circle extends Shape {
	public double r;

	public Circle() {
		super();
	}

	public Circle(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	/**
	 * Function caculate perimeter of circle
	 * output: return perimeter of circle
	 */ 
	@Override
	public double perimeter() {
		return 2 * Math.PI * r;
	}
	
	/**
	 * function calculate area circle
	 * output: return area of cirlce
	 */
	@Override
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

}
