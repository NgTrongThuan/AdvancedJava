package Ex51;
/**
 * 
 * @author Nguyen Trong Thuan
 * @since : 13/09/2016
 * @version: 1.0
 * --------------------------
 * create class thread demo
 *
 */
public class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	
	ThreadDemo(String name){
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		System.out.println("Running " + threadName);
		try{
			for(int i = 3; i > 0; i--){
				System.out.println("Thread " + threadName + ", " + i);
				Thread.sleep(50);
			}
		}catch(Exception e){
			System.out.println("Thread " + threadName + " interupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start(){
		System.out.println("Starting " + threadName);
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
