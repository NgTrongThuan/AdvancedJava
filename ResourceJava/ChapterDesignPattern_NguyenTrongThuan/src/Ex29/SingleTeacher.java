package Ex29;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 * @version: 1.0
 * --------------------------
 * create class single teacher is demo singleton 
 *
 */
public class SingleTeacher {
	private static SingleTeacher instance = new SingleTeacher();
	
	private SingleTeacher(){
	}
	
	public static SingleTeacher getInstance(){
		return instance;
	}
	
	/**
	 * create function share document
	 */
	public String shareDocument(){
		return "This is Shared document";
	}
}
