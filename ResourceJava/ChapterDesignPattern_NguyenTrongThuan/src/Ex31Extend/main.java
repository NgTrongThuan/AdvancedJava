package Ex31Extend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 *@version : 1.0
 *--------------------------
 *main to run demo ex31, it will tailor type aodai
 */
public class main {

	public static void main(String[] args) throws IOException {
		try{
		TailorCompany factory = new TailorCompany();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input shape: ");
		String type = input.readLine().toUpperCase();
		AoDai aoDai =  factory.getAoDai(type);
		aoDai.tailorFactory();
		}catch(NumberFormatException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}
