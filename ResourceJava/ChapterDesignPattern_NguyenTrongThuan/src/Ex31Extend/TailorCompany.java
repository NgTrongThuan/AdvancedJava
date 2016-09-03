package Ex31Extend;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 1/9/2016
 * @version: 1.0
 * --------------------------
 * create class tailor company to generate tailor type aodai
 *
 */
public class TailorCompany {
	public AoDai getAoDai(String typeAoDai){
		if(typeAoDai == null){
			return null;
		}
		
		if(typeAoDai.equalsIgnoreCase("TRADITIONAL")){
			return new TraditionPart();
		}else if(typeAoDai.equalsIgnoreCase("CHEONGSAM")){
			return new CheongsamPart();
		}else if(typeAoDai.equalsIgnoreCase("STYLE")){
			return new StylePart();
		}
		return null;
	}
}
