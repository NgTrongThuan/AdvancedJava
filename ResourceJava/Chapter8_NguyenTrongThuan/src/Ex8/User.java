package Ex8;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0
 * create class user to manage user
 *
 */
public class User {
	String user;
	String password;
	
	public User(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public User() {
		super();
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
