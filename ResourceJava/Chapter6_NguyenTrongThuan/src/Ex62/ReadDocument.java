package Ex62;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 13/09/2016
 * @version: 1.0
 *
 */
public class ReadDocument {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			ArrayList<Word> arrWord = new ArrayList<>();
			String content = readFile();
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
			System.out.println("Result: ");
			for (Object o : arrWord) {
				Word w = (Word) o;
				w.show();
			}
		} catch (NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

	// function read file document
	public static String readFile() throws FileNotFoundException, IOException {
		String result = "";
		String content;
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/Ex62/document.txt")))) {
			while (in.available() > 0) {
				content = in.readUTF();
				result += content + " ";
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return result;
	}
	
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
 

}
