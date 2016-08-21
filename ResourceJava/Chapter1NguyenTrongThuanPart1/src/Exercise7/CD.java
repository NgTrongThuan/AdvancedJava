/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1
 * ---------------------------
 * create class CD
 */
public class CD {
    private String id;
    private String name;
    private String singer;
    private int numOfSong;
    private double price;

    public CD() {
    }

    public CD(String id, String name, String singer, int numOfSong, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numOfSong = numOfSong;
        this.price = price;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumOfSong() {
        return numOfSong;
    }

    public void setNumOfSong(int numOfSong) {
        this.numOfSong = numOfSong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    /**
     * function show information of CD
     * Output: information of CD
     */
    
    public void showCD(){
        System.out.println("-----------------------------------------");
        System.out.println("Information of CD:");
        System.out.println("- ID: " + this.getId());
        System.out.println("- CD name:" + this.getName());
        System.out.println("- Singer: " + this.getSinger());
        System.out.println("- Number of song: " + this.getNumOfSong());
        System.out.println(String.format("- Price: %.3f", this.getPrice()));
    }
}
