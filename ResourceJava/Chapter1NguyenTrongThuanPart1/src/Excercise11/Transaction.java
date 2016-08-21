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
 * -----------------------------
 * create class transaction
 */
public class Transaction {
    private String id;
    private String date;
    private double price;
    private double quanlity;

    public Transaction() {
    }

    public Transaction(String id, String date, double price, double quanlity) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.quanlity = quanlity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(double quanlity) {
        this.quanlity = quanlity;
    }
    
    public double calculateMoney(){
        double money = this.getQuanlity() * this.getPrice();
        return money;
    }
}
