package Ex27Decorator;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version: 1.0
 * --------------------------
 * create class shapedecorator 
 *
 */
public abstract class ShapeDecorator implements Shape{
	protected Shape shape;
	
	
	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape(){
		return shape;
	}
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public String draw(){
		return shape.draw();
	}
}
