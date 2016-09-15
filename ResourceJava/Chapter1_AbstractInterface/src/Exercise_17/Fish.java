/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * version: 1.0
 * --------------------------
 * create class fish
 */
package Exercise_17;

public class Fish extends Animal implements ISwim{
	
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, String food) {
		super(name, food);
		// TODO Auto-generated constructor stub
	}

	public void swim(){
		System.out.println("I can swim !");
	}
}
