/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise9;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1
 * -------------------------
 * class computer
 */
public class Computer {
    private String seri;
    private double price;
    private String brand;
    private int quantity;

    public Computer() {
    }

    public Computer(String seri, double price, String brand, int quantity) {
        this.seri = seri;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /**
     * function show information of computer
     */
    public void showInformation(){
        System.out.println("-----------------------------------------");
        System.out.println("The details information");
        System.out.println("Seri: " + this.getSeri());
        System.out.println(String.format("Price: %.3f", this.getPrice()));
        System.out.println("Brand: " + this.getBrand());
    }
}
