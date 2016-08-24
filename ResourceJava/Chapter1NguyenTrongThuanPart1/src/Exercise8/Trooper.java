package Exercise8;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1 
 * ------------------------ 
 * create class trooper
 */
public class Trooper extends Soldier {

    public Trooper(String name, int power, String weapon) {
        super(name, power, weapon);
    }
    
    /**
     * function fight power of trooper
     */ 
    @Override
    public void fight() {
        this.setPower(this.power - 3);
    }
}
