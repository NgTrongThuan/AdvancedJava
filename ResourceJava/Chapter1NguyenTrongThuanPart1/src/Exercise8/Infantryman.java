package Exercise8;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1 
 * --------------------- 
 * create class infantryman
 */
public class Infantryman extends Soldier {

    public Infantryman(String name, int power, String weapon) {
        super(name, power, weapon);
    }

    /**
     * function fight power of infantryman
     */ 
    @Override
    public void fight() {
        this.setPower(this.power - 2);
    }
}
