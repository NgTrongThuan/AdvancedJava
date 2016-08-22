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
 * -----------------------------
 * create class laptop
 */
public class Laptop extends Computer {
    private double weight;
    private double pin;
    private double resolution;

    public Laptop() {
    }

    public Laptop(double weight, double pin, double resolution, String seri, double price, String brand, int quantity) {
        super(seri, price, brand, quantity);
        this.weight = weight;
        this.pin = pin;
        this.resolution = resolution;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPin() {
        return pin;
    }

    public void setPin(double pin) {
        this.pin = pin;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
    
    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Weight: " + this.weight);
        System.out.println("Time of pin: " + this.pin);
        System.out.println("Resolution: " + this.resolution);
    }
    
    
}
