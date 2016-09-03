package Ex31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 * @version : 1.0
 * --------------------------
 * main to demo ex31, user input type aodai then application will tailor type aodai match to input string
 *
 */
public class main {

	public static void main(String[] args) throws IOException {
		try{
		TailorFactory tailorFactory = new TailorFactory();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input shape: ");
		String type = input.readLine().toUpperCase();
		AoDai aoDai =  tailorFactory.getAoDai(type);
		aoDai.tailor();
		}catch(NumberFormatException ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}
