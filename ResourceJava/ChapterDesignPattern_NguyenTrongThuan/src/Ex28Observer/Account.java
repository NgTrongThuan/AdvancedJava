package Ex28Observer;

import java.awt.List;
import java.util.ArrayList;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * --------------------------
 * create class Account
 */
public class Account {
	private ArrayList<Observer> observers =  new ArrayList<>();
	private double state;
	
	public double getState() {
		return state;
	}
	public void setState(double state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for(Observer observer : observers){
			System.out.println(observer.update());
		}
	}
}
