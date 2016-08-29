package Ex19;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 29-Aug-2016 8:21:19 AM
 * -------------------------------
 * create class Customer to manager customer
 */
public class Customer {

	private String address;
	private String email;
	private String identityCard;
	private String name;
	private String phone;
	public Order m_Order;

	public Customer(){

	}

	public Customer(String address, String email, String identityCard,
			String name, String phone) {
		super();
		this.address = address;
		this.email = email;
		this.identityCard = identityCard;
		this.name = name;
		this.phone = phone;
	}
	
	public void finalize() throws Throwable {

	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
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

	public Order getM_Order() {
		return m_Order;
	}

	public void setM_Order(Order m_Order) {
		this.m_Order = m_Order;
	}

	public Customer getInformation(){
		return null;
	}

	/**
	 * function show information of customer
	 */
	public void showInformationOfCustomer(){
		System.out.println("Name: " + name);
		System.out.println("ID " + identityCard);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);		
	}

}