package Ex26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 
 * @author Nguyen Trong Thuan 
 * date: 8/9/2016
 * @version : 1.0 
 * ------------------------- 
 * main class method
 *
 */
public class runManageDocument {

	/**
	 * function check object is exists in array list
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static boolean checkExists(ArrayList<Word> arrWord, String word) {
		for (Object o : arrWord) {
			Word w = (Word) o;
			if (w.getWord().equals(word)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * function get count of word
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static int count(ArrayList<Word> arrWord, String word) {
		int count = 0;
		for (Object o : arrWord) {
			Word w = (Word) o;
			if (w.getWord().equals(word)) {
				count = w.getCount();
			}
		}
		return count;
	}

	/**
	 * function get word
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static Word getWord(ArrayList<Word> arrWord, String word) {
		for (Object o : arrWord) {
			Word w = (Word) o;
			if (w.getWord().equals(word)) {
				return w;
			}
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Input a document: ");
			String content = input.readLine();
			ArrayList<Word> arrWord = new ArrayList<>();
			Word word = new Word("this", 1);
			arrWord.add(word);
			StringTokenizer string = new StringTokenizer(content);
			int tempCount = 0;
			int count = 0;
			while (string.hasMoreTokens()) {
				String temp = string.nextToken();
				if (checkExists(arrWord, temp)) {
					arrWord.add(new Word(temp, count(arrWord, temp) + 1));
					arrWord.remove(getWord(arrWord, temp));
				} else {
					arrWord.add(new Word(temp, 1));
				}
			}
			for (Object o : arrWord) {
				Word w = (Word) o;
				w.show();
			}
			System.out.println("---------------- Find word--------------------");
			System.out.print("Input word to find: ");
			String find = input.readLine();
			if(count(arrWord, find) == 0){
				System.out.println("Word is not exists in document!");
			}else{
				System.out.println("Word is exists in document!");
			}
			
		} catch (NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}