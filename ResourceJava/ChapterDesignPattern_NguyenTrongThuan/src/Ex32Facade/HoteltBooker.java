package Ex32Facade;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * --------------------------
 * create class hotelbooker
 *
 */
public class HoteltBooker implements Booker{
	@Override
	public String getInformation(String date, String hour, String place) {
		return "date: " + date + ", hour: " + hour + ", place: " + place + " have hotel: A, B and C";
	}

	public HoteltBooker() {
		super();
	}
}
