/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise12;

/**
 *
 * @publisher  Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1.0
 * --------------------------
 * create class book
 */
public class Book {
    public String id;
    public String name;
    public String date;
    public double price;
    public int amount;
    public String publisher ;

    public Book() {
    }

    public Book(String id, String name, String date, double price, int amount, String publisher ) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.amount = amount;
        this.publisher  = publisher ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPublisher () {
        return publisher ;
    }

    public void setPublisher (String publisher ) {
        this.publisher  = publisher ;
    }
    
    /**
     * function calculate money of book
     * output: return money of book
     */
    public double calculateMoney(){
        return this.amount * this.price;
    }
    
    /**
     * function show information of book
     */
    public void showInfor(){
        System.out.println("-------------------------------------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Date: " + this.date);
        System.out.println("Price: " + this.price);
        System.out.println("Amount: " + this.amount);
        System.out.println("Pulisher: " + this.publisher);
    }
    
}
