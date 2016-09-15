package Excercise11;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1
 * -------------------------
 * create enum gold
 */
public enum Gold {
    SJC9999(3500000),
    GOLD24K(3514100);
    
    private double goldValue;

    private Gold(double goldValue) {
        this.goldValue = goldValue;
    }

    public double getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(double goldValue) {
        this.goldValue = goldValue;
    }    
    
    /**
     * function calculate gold value
     * input: number of gold
     * output: return gold value
     */
    public double calculateGold(double quality){
        double result = this.getGoldValue() * quality;
        return result;
    }
}
