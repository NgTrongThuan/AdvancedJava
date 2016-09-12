package Ex41;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Nguyen Trong Thuan date: 12/09/2016
 * @version: 1.0 -------------------------- create main class to run exercise
 *           4.1
 *
 */
public class main {

	public static void main(String[] args) {
		try {
			// create list 1
			List<String> list1 = Arrays.asList("apple", "", "h", "three",
					"four", "", "a happy", "hi", "seven", "eight", "happy", "ten",
					"", "", "15");

			System.out.println("-------------- list 1 -----------------------");
			// print list string
			Stream<String> streamStr = list1.stream();
			streamStr.forEach(System.out::println);

			System.out.println("------------------ Count ---------------------");
			// count "" in list
			int countEmpty = (int) list1.stream()
					.filter(string -> string.equals("")).count();
			System.out.println("Number of element have '' is : " + countEmpty);

			// count length of element is >= 5
			int countLength = (int) list1.stream()
					.filter(string -> string.length() >= 5).count();
			System.out.println("Number of element have length >= 5 is: "
					+ countLength);

			// count element have begin is "a"
			int countA = (int) list1.stream()
					.filter(string -> string.startsWith("a")).count();
			System.out.println("Number of element have begin is a : " + countA);
			
			// count element is "happy"
			int countHappy = (int) list1.stream().filter(string -> string.equals("happy")).count();
			System.out.println("Number of element is happy: " + countHappy);
			
			//create list 2 from list 1 not ""
			System.out.println("-------------Create list 2 -------------");
			List<String> list2 = list1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());;
			list2.stream().forEach(System.out::println);
			
			// create list 3 from list 1 have length >= 3 and  <= 6
			System.out.println("-------------Create list 3 -------------");
			List<String> list3 = list1.stream().filter(string -> string.length() >= 3 && string.length() <= 6).collect(Collectors.toList());
			String str = list3.stream().collect(Collectors.joining(", "));
			System.out.println(str);
			
			// create list 4 from list 1 insert "happy"
			System.out.println("-------------Create list 4 -------------");
			Stream<String> list4 = list1.stream();
			list4.map(string -> string + " happy").distinct().forEach(System.out::println);
			
			list3.stream().forEach(System.out::print);
		} catch (NullPointerException ex) {
			System.out.println("Error:");
		}

	}

}
