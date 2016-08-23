/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * ----------------------------
 * create class bird
 */
package Exercise_17;

public class Bird extends Animal implements IFly, IRun, INest{
	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, String food) {
		super(name, food);
		// TODO Auto-generated constructor stub
	}

	public void fly(){
		System.out.println("I can fly!");
	}
	
	public void run(){
		System.out.println("I can run!");
	}
	
	public void nest(){
		System.out.println("I live in nest!");
	}
}
