package Excercise11;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 21/08/2016
 * @version 1
 * --------------------------
 * create class money transaction
 */
public class MoneyTransaction extends Transaction{
    private Money money;
    private int typeTransaction; // 1 is buy and 2 is sell

    public MoneyTransaction() {
    }

    public MoneyTransaction(Money money, int typeTransaction, String id, String date, double quality) {
        super(id, date, quality);
        this.money = money;
        this.typeTransaction = typeTransaction;
    }


    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public int getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(int typeTransaction) {
        this.typeTransaction = typeTransaction;
    }
    
    /**
     * function calculate value money
     * input: type of money 1:USD, 2:EUR, 3:AUD
     * output: return value of money 
     */
    public double calculateMoney(int typeMoney){
        double result = 0;
        switch(typeMoney){
            case 1:
                result = this.getMoney().USD.calculateMoney(this.quality, this.typeTransaction);
                break;
            case 2:
                result = this.getMoney().EUR.calculateMoney(this.quality, this.typeTransaction);
                break;
            case 3:
                result = this.getMoney().AUD.calculateMoney(this.quality, this.typeTransaction);
                break;
        }
        return result;
    }
}
