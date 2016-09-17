package Ex8;
/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0
 * create class category
 *
 */
public class Category {
	int id;
	String name;
	String description;
	
	public Category() {
		super();
	}

	public Category(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
