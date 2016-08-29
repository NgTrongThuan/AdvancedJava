package Ex19;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 29-Aug-2016 8:21:38 AM
 * -------------------------------
 * create class detailOrder to manager about detail order
 */
public class DetailOrder {

	private int amount;
	public Item m_Item;

	public DetailOrder(){

	}

	public DetailOrder(int amount, Item m_Item) {
		super();
		this.amount = amount;
		this.m_Item = m_Item;
	}


	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Item getM_Item() {
		return m_Item;
	}

	public void setM_Item(Item m_Item) {
		this.m_Item = m_Item;
	}

	public void finalize() throws Throwable {

	}

	public double calMoney(){
		return amount * m_Item.getPrice();
	}
	
	/**
	 * function show information of detail order
	 */
	public void showInforDetailOder(){
		m_Item.showInforItem();
		System.out.println("Amount: " + amount);
		System.out.println(String.format("Calculate Money: %.2f",calMoney()));
	}
}