package Ex33Proxy;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * --------------------------
 * create class Image
 */
public class RealImage implements Image{
	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName){
		System.out.println("Loading " + fileName);
	}
	
}
