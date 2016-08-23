/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * ----------------------------
 * create class tiger
 */
package Exercise_17;

public class Tiger extends Animal implements IRun, ICave{
	
	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiger(String name, String food) {
		super(name, food);
		// TODO Auto-generated constructor stub
	}

	public void run(){
		System.out.println("I can run !");
	}
	
	public void cave(){
		System.out.println("I live in cave !");
	}
}
