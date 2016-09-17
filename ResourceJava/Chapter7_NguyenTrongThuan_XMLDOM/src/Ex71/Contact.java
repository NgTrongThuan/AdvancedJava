package Ex71;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 8/9/2016
 * @version : 1.0
 * --------------------------
 * create class contact
 *
 */
public class Contact {
	private String name;
	private String phone;
	public Contact() {
		super();
	}
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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
	
	// function to show information of contact
	public void show(){
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}
	
}