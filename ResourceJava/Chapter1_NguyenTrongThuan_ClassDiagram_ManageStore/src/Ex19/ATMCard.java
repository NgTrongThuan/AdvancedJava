package Ex19;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 29-Aug-2016 8:21:35 AM
 * -------------------------------
 * create class ATMCard to manager ATMCard
 */


public class ATMCard extends Card implements IAuthentication {

	private double balance;

	public ATMCard(){

	}

	
	public ATMCard(String id, double balance) {
		super(id);
		this.balance = balance;
	}


	public ATMCard(double balance) {
		super();
		this.balance = balance;
	}


	public void finalize() throws Throwable {
		super.finalize();
	}

	public void getAuthentication(){
		System.out.println("Have authentication!");
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * function calculate balance money
	 * set balance = balance - money
	 */
	public void calcBalance(double money){
		balance = balance - money;
	}
}