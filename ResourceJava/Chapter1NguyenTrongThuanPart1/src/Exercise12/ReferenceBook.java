/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise12;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1.0 -------------------------- create class reference book
 */
public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(double tax, String id, String name, String date, double price, int amount, String publisher) {
        super(id, name, date, price, amount, publisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * function calculate money of reference book 
     * output: return money of reference book
     */
    @Override
    public double calculateMoney() {
        double temp = super.calculateMoney();
        double result = temp + temp * (tax / 100);
        return result;
    }
    
    /**
     * function show information of reference book
     */
    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println("Tax: " + this.tax);
    }
    

}
