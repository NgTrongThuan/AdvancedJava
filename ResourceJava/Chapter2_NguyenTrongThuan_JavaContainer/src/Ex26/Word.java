package Ex26;
/**
 * 
 * @author Nguyen Trong Thuan
 * date: 8/9/2016
 * @version: 1.0
 *
 */
public class Word {
	private String word;
	private int count;
	
	public Word() {
		super();
	}

	public Word(String word, int count) {
		super();
		this.word = word;
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public void show(){
		System.out.println(word + " : " + count);
	}
	
}
