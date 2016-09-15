package Ex31;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 09/09/2016
 * @version : 1.0 
 * -------------------------
 * main method to run
 */
public class main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(n -> System.out.println(n));
	}

}
