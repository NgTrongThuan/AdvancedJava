
/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * --------------------------
 * create class snake
 */
package Exercise_17;

public class Snake extends Animal implements IRun, IGrow, ICave{
	
	public Snake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snake(String name, String food) {
		super(name, food);
		// TODO Auto-generated constructor stub
	}

	public void run(){
		System.out.println("I can run !");
	}
	
	public void grow(){
		System.out.println("I grow by moult !");
	}
	
	public void cave(){
		System.out.println("I live in cave !");
	}
}
