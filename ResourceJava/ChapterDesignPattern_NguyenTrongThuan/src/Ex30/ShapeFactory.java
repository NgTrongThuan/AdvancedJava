package Ex30;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 *@version: 1.0
 *---------------------------
 *create class shapefactory to generate object shape
 */
public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
}
