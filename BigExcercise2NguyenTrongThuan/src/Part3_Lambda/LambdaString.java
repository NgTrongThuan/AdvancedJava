package Part3_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 19/9/2016
 * @version: 1.0
 * create class Lambda String
 *
 */
public class LambdaString {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("CCCCCCCCCCCCC");
		lst.add("AAAAAA");
		lst.add("E");
		lst.add("FFFFFFFFFF");
		lst.add("BBBB");
		lst.add("DDD");
		
		// sort min length to max length
		Collections.sort(lst, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println("\n+++++++ Sort MIN length to MAX length ++++++");
		for(String str : lst){
			System.out.println(str);
		}
		
		// sort max length to min length
		Collections.sort(lst, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
		System.out.println("\n+++++++ Sort MAX length to MIN length +++++++");
		for(String str : lst){
			System.out.println(str);
		}
		
		// sort alphabet
		Collections.sort(lst, (s1, s2) -> s1.compareTo(s2));
		System.out.println("\n+++++++++++ Sort Alphabet +++++++++++++++");
		for(String str : lst){
			System.out.println(str);
		}
		
	}

}
