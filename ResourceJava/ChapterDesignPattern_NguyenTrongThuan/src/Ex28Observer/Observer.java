package Ex28Observer;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * --------------------------
 * create abstract class observer
 *
 */
public abstract class Observer {
	protected Account account;
	public abstract String update();
}
