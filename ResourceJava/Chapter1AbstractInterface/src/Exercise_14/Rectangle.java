package Exercise_14;
/**
 * 
 * @author Nguyen Trong Thuan
 * @date: 23/08/2016
 * @version : 1.0
 * --------------------------
 * create class rectangle extends abstract class Shape
 *
 */
public class Rectangle extends Shape{
	public double height;
	public double width;
	
	public Rectangle() {
		super();
	}


	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double perimeter() {
		return (this.height + this.width) * 2;
	}

	@Override
	public double area() {
		return (this.height * this.width);
	}		
}
