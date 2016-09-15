package Excercise11;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 21/08/2016
 * @version: 1.0 
 * ----------------------------- 
 * create class gold transaction
 */
public class GoldTransaction extends Transaction {

    private Gold gold;

    public GoldTransaction() {
    }

    public GoldTransaction(Gold gold, String id, String date, double quality) {
        super(id, date, quality);
        this.gold = gold;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }
    
    /**
     * function calculate value of gold 
     * input: type of gold, 1 is SJC9999, 2 is 24K 
     * output: return value of money
     */
    public double calculateGold(int typeGold) {
        double result = 0;
        switch (typeGold) {
            case 1:
                result = this.gold.SJC9999.calculateGold(this.quality);
                break;
            case 2:
                result = this.gold.GOLD24K.calculateGold(this.quality);
                break;
        }
        return result;
    }
}
