package Ex87_Transaction;

import java.sql.SQLException;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 16/9/2016
 * @version: 1.0
 * create main class to run application
 *
 */
public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TransactionController trans = new TransactionController();
		trans.runTransaction1();
		trans.runTransaction2();
		trans.runTransaction3();
	}

}
