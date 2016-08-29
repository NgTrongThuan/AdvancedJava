package Ex19;
import java.util.ArrayList;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 29-Aug-2016 8:21:37 AM
 * -------------------------------
 * create class Order to manager about order
 */
public class Order {

	private String date;
	private boolean exportOrder;
	private String state;
	public ArrayList<DetailOrder> m_DetailOrder;

	public Order(){

	}
	
	public Order(String date, boolean exportOrder, String state,
			ArrayList<DetailOrder> m_DetailOrder) {
		super();
		this.date = date;
		this.exportOrder = exportOrder;
		this.state = state;
		this.m_DetailOrder = m_DetailOrder;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isExportOrder() {
		return exportOrder;
	}

	public void setExportOrder(boolean exportOrder) {
		this.exportOrder = exportOrder;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ArrayList<DetailOrder> getM_DetailOrder() {
		return m_DetailOrder;
	}

	public void setM_DetailOrder(ArrayList<DetailOrder> m_DetailOrder) {
		this.m_DetailOrder = m_DetailOrder;
	}

	public void finalize() throws Throwable {

	}

	/**
	 * function calculate sum money of order
	 * output: sum money of order
	 */
	public double sumMoney(){
		double result = 0;
		for(DetailOrder detail : m_DetailOrder){
			result += detail.calMoney();
		}
		if(exportOrder == true){
			result = result * 1.1;
		}
		return result;
	}

}