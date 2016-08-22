/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 21/08/2016
 * @version 1
 * ---------------------------
 * create class human
 */
public class Human {
    public String name;
    public String birth;
    public String address;
    public String phone;

    public Human() {
    }

    public Human(String name, String birth, String address, String phone) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * function show information of human
     */
    public void showInformation(){
        System.out.println("-----------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Birthday: " + this.birth);
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phone);
    }
}
