package Exercise9;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1
 * -------------------------
 * class computer to manager computer
 */
public class Computer {
    public String seri;
    public double price;
    public String brand;
    public int quantity;

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
        System.out.println("Seri: " + this.seri);
        System.out.println(String.format("Price: %.3f", this.price));
        System.out.println("Brand: " + this.brand);
    }
    
    /**
     * function calculate money computer
     * output: return money of computer
     */
    public double calculateMoney(){
        return this.price * this.quantity;
    }
}
