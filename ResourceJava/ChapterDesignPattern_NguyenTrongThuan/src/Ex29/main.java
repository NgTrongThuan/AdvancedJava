package Ex29;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 * @version : 1.0
 * main to run singleton demo
 */
public class main {

	public static void main(String[] args) {
		SingleTeacher object = SingleTeacher.getInstance();
		System.out.println(object.shareDocument());
	}

}
