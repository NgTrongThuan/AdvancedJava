package Ex51;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 13/09/2016
 * @version : 1.0
 * --------------------------
 * create class thread test to test
 */
public class ThreadTest {

	public static void main(String[] args) {
		ThreadDemo T1 = new ThreadDemo("Google");
		T1.start();
		
		ThreadDemo T2 = new ThreadDemo("Yahoo");
		T2.start();

		ThreadDemo T3 = new ThreadDemo("Facebook");
		T3.start();
	}

}
