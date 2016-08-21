/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise11;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 21/08/2016
 * @version 1
 * ---------------------------
 * create class gold transaction
 */
public class GoldTransaction extends Transaction{
    private String gold;

    public GoldTransaction() {
    }

    public GoldTransaction(String gold, String id, String date, double price, double quanlity) {
        super(id, date, price, quanlity);
        this.gold = gold;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }
    
    @Override
    public double calculateMoney() {
        return super.calculateMoney();
    }
}
