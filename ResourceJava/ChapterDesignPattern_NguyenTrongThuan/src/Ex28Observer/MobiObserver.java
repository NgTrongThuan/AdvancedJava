package Ex28Observer;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version: 1.0
 * -------------------------
 * create class MobiObserver extend from Observer
 */
public class MobiObserver extends Observer{
	public MobiObserver(Account account){
		this.account = account;
		this.account.attach(this);
	}

	@Override
	public String update() {
		return "Mobi: Xin chao. Tai khoan cua quy khach da thay doi.\nSo tien hien tai la: " + account.getState() + "vnd";
		
	}
}
