/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise11;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1
 * --------------------------
 * create enum money
 */
public enum Money {
    USD(22000),
    EUR(25000),
    AUD(17000);
    
    private double valueMoney;

    private Money(double valueMoney) {
        this.valueMoney = valueMoney;
    }

    public double getValueMoney() {
        return valueMoney;
    }
    
    /**
     * function calculate money
     * input: quality, type transaction
     * output: return value money
     */
    public double calculateMoney(double quality, int transaction){
        double result = 0;
        double temp = this.getValueMoney() * quality;
        if(transaction == 1){
            result = temp;
        }else{
            result = temp + temp * 0.001;
        }
        return result;
    }
}
