package Ex22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Ex26.Word;

/**
 * 
 * @author Nguyen Trong Thuan date: 7/9/2016
 * @version : 1.0 --------------------------- main method to run application
 *          manage dictionary
 */
public class runDictionary {
	/**
	 * function check do you want continue
	 * 
	 * @return string is y or n
	 * @throws IOException
	 */
	public static String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	/**
	 * function show menu to user choice
	 * 
	 * @param args
	 * @throws IOException
	 */
	
	/**
	 * function check object exist
	 */
	
	public static boolean checkExists(Set dictionary, WordEnglish w){
		for (Object object : dictionary) {
			WordEnglish z = (WordEnglish) object;
			if(z.getWord().equals(w.getWord()) && z.getMeaning().equals(w.getMeaning())){
				return true;
			}
		}
		return false;
	}
	public static void showMenu() {
		System.out.println("++++++++++++++++ Menu +++++++++++++++++++");
		System.out.println("Press 1: View dictionary");
		System.out.println("Press 2: Add new word");
		System.out.println("Press 3: Search word");
		System.out.println("Press 4: Remove word");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String check = "y";
			Set dictionary = new HashSet<>();
			dictionary.add(new WordEnglish("hello", "xin chao"));
			dictionary.add(new WordEnglish("hi", "xin chao"));
			while (check.equals("y")) {
				showMenu();
				int choiceMenu = Integer.parseInt(input.readLine());

				switch (choiceMenu) {
				case 1: {
					System.out.println("+++++++++ Dictionary detail +++++++++");
					if (!dictionary.isEmpty()) {
						for (Object object : dictionary) {
							WordEnglish z = (WordEnglish) object;
							z.showDictionary();
						}
					} else {
						System.out.println("Dictionary is empty!");
					}
					System.out.println("++++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 2: {
						System.out.println("+++++++++++ Add new word ++++++++++++");
						System.out.print("Input word: ");
						String word = input.readLine();
						System.out.print("Input meaning: ");
						String meaning = input.readLine();
						WordEnglish w = new WordEnglish(word, meaning);
						if(!checkExists(dictionary, w)){
							dictionary.add(w);
						}
						System.out.println("Add word completed!");
				}
					break;
				case 3: {
					System.out.println("+++++++++ Search word ++++++++++++++++");
					System.out.print("Input word to search: ");
					String wordSearch = input.readLine().toLowerCase();
					int checkSeach = 0;
					for (Object o : dictionary) {
						WordEnglish w = (WordEnglish) o;
						if (w.getWord().equals(wordSearch)) {
							System.out.println("Meaning: " + w.getMeaning());
							checkSeach = 1;
						}
					}
					if (checkSeach == 0) {
						System.out.println("Word is not in dictionary!");
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 4: {
					System.out.println("+++++++++++++ Remove word +++++++++++");
					System.out.print("Input word want remove: ");
					String wordRemove = input.readLine();
					int checkRemove = 0;
					for (Object o : dictionary) {
						WordEnglish w = (WordEnglish) o;
						if (w.getWord().equals(wordRemove)) {
							checkRemove = 1;
							dictionary.remove(w);
						}
					}
					if (checkRemove == 1) {
						System.out.println("Remove word completed!");
					} else {
						System.out.println("Remove word not complete because the word is not in dictionary!");
					}

				}
					break;
				default:
					throw new ArithmeticException("Choice value is not valid!");
				}
				System.out.println("Do you want continue back to menu ? (y/n)");
				check = checkContinue();
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
