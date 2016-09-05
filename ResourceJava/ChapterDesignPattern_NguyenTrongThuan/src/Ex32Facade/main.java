package Ex32Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * --------------------------
 * main method
 *
 */
public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Input booking type: ");
			System.out.println("Press 1: hotel");
			System.out.println("Press 2: fight");
			System.out.println("Press 3: train");
			int typeBooking = Integer.parseInt(input.readLine());
			System.out.print("Input date: ");
			String date = input.readLine();
			System.out.print("Input hour: ");
			String hour = input.readLine();
			System.out.print("Input place: ");
			String place = input.readLine();
			BookingFacade booking = new BookingFacade();
			if(typeBooking == 1){
				System.out.println(booking.bookHotel(date, hour, place));
			}else if(typeBooking == 2){
				System.out.println(booking.bookFlight(date, hour, place));
			}else if(typeBooking == 3){
				System.out.println(booking.bookTrain(date, hour, place));
			}else{
				throw new ArithmeticException("booking type is not valid!");
			}
		}catch(NumberFormatException ex){
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
