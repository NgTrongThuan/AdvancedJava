package Ex27Decorator;
/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * -------------------------
 * create class RedShapeDecorator extends from ShapeDecorator
 *
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	
	public String draw(){
		return shape.draw() + " " + setRedBorder(shape);
	}
	
	private String setRedBorder(Shape Shape){
		return "Border color: red";
	}
}
