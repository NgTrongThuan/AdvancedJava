package Ex42;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Nguyen Trong Thuan date: 12/09/2016
 * @version : 1.0 
 * -------------------------- 
 * create class main to run ex 42
 *
 */
public class main {

	/**
	 * funtion check is prime 
	 * return true if is prime and false if is not prime
	 * 
	 * @param args
	 */
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * function check square number 
	 * return true / false
	 * 
	 * @param args
	 */
	public static boolean isSquareNumber(int n) {
		int temp = (int) Math.sqrt(n);
		return (temp * temp == n);
	}

	public static void main(String[] args) {
		try {
			// create list 1
			List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
					11, 12, 13, 14, 15);
			Stream<Integer> streamList1 = list1.stream();
			System.out.println("------------ List 1-------------");
			// print list 1
			streamList1.forEach(System.out::println);

			// create list 2 from list 1
			System.out.println("------------ List 2-------------");
			List<Integer> list2 = list1.stream().map(i -> i * i)
					.collect(Collectors.toList());
			list2.forEach(System.out::println);
			IntSummaryStatistics stats = list2.stream().mapToInt((x) -> x)
					.summaryStatistics();
			System.out.println("- Max: " + stats.getMax());
			System.out.println("- Min: " + stats.getMin());
			System.out.println("- Sum: " + stats.getSum());
			System.out.println("- Averange: " + stats.getAverage());

			// create list 3 from list 2
			System.out.println("------------ List 3-------------");
			List<Integer> list3 = list2.stream().filter(i -> isPrime(i))
					.collect(Collectors.toList());
			list3.forEach(System.out::println);

			// create list 4 from list 2
			System.out.println("------------ List 4-------------");
			List<Integer> list4 = list2.stream().filter(i -> isSquareNumber(i))
					.collect(Collectors.toList());
			list4.forEach(System.out::println);
		} catch (NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
