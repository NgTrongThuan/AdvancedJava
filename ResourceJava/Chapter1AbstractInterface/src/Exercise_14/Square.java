package Exercise_14;
/**
 * 
 * @author Nguyen Trong Thuan
 * @date: 23/08/2016
 * @version: 1.0
 * --------------------------
 * create class square extends Shape
 *
 */
public class Square  extends Shape{
	public double edge;

	public Square() {
		super();
	}
	
	public Square(double edge) {
		super();
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	@Override
	public double perimeter() {
		return this.edge * 4;
	}

	@Override
	public double area() {
		return Math.pow(this.edge, 2);
	}
	
	
	
}
