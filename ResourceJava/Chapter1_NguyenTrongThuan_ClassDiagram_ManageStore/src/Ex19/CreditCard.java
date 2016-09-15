package Ex19;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 29-Aug-2016 8:25:37 AM 
 * ------------------------------- 
 * create class CreditCard to manager credit card
 */
public class CreditCard extends Card implements IAuthentication {

	private String expDate;
	private double maxDebt;
	private String type;

	public CreditCard() {

	}

	public CreditCard(String id, String expDate, double maxDebt, String type) {
		super(id);
		this.expDate = expDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public CreditCard(String expDate, double maxDebt, String type) {
		super();
		this.expDate = expDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}


	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}


	public double getMaxDebt() {
		return maxDebt;
	}


	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void finalize() throws Throwable {
		super.finalize();
	}

	public void getAuthentication() {
		System.out.println("Have authentication!");
	}

}