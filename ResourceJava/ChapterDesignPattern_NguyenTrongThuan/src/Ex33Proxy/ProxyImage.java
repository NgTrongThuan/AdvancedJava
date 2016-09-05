package Ex33Proxy;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 5/9/2016
 * @version : 1.0
 * --------------------------
 * create class ProxyImage
 */
public class ProxyImage implements Image{
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
	
	private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
