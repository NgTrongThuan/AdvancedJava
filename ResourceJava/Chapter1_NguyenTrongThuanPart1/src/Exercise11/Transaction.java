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
    public String id;
    public String date;
    public double quality;

    public Transaction() {
    }

    public Transaction(String id, String date, double quality) {
        this.id = id;
        this.date = date;
        this.quality = quality;
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

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }
    
    /**
     * function show information of transaction
     */ 
    public void showInformation(){
        System.out.println("-------------------------------------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Date: " + this.date);
        System.out.println("Amount: " + this.quality);
    }
    
}
