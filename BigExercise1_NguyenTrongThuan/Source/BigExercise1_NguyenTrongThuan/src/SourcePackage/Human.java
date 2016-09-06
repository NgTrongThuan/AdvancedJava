package SourcePackage;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 06-Sep-2016 8:34:44 AM
 * -------------------------------
 * create abstract class Human
 */
public abstract class Human {
	public String email;
	public String name;
	public String phone;
	
	public Human(String email, String name, String phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}