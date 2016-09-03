package Ex31;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 *@version : 1.0
 *---------------------------
 *create class tailorfactory to generate object aodai
 */
public class TailorFactory {
	public AoDai getAoDai(String typeAoDai){
		if(typeAoDai == null){
			return null;
		}
		
		if(typeAoDai.equalsIgnoreCase("TRADITIONAL")){
			return new Traditional();
		}else if(typeAoDai.equalsIgnoreCase("CHEONGSAM")){
			return new Cheongsam();
		}else if(typeAoDai.equalsIgnoreCase("STYLE")){
			return new Style();
		}
		return null;
	}
}
