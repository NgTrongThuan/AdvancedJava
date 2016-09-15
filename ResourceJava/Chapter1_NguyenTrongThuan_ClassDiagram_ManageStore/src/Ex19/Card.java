package Ex19;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 29-Aug-2016 8:21:36 AM
 * -------------------------------
 * create class Card to manager Card
 */
public class Card {

	public String id;

	public Card(){

	}

	
	public Card(String id) {
		super();
		this.id = id;
	}

	public void finalize() throws Throwable {

	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

}