package Ex22;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 7/9/2016
 * @version : 1.0
 * --------------------------
 * create class WordEnglish to manage dictionary
 *
 */
public class WordEnglish{
	private String word;
	private String meaning;
	
	public WordEnglish() {
		super();
	}

	public WordEnglish(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	/**
	 * function show dictionary
	 */
	public void showDictionary(){
		System.out.println(word + " : " + meaning);
	}
}
