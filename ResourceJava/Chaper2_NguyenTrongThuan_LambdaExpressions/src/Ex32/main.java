package Ex32;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 09/09/2016
 * @version : 1.0
 * --------------------------
 * main method to run
 *
 */
public class main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{2, 3, 5, 7, });
		int price = 5200;
		list.forEach(element -> System.out.println("Money is: " + price * element + "vnd"));

	}

}
