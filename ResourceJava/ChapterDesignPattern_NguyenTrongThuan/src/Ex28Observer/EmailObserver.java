package Ex28Observer;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * --------------------------
 * create class EmailObserver extend from Observer
 *
 */
public class EmailObserver extends Observer{
	public EmailObserver(Account account){
		this.account = account;
		this.account.attach(this);
	}

	@Override
	public String update() {
		return "Email: Ngan hang ABC kinh chao quy khach. Tai khoan cua quy khach da thay doi.\n"
				+ "So du hien tai la: " + account.getState() + "vnd";
	}
	
	
}
