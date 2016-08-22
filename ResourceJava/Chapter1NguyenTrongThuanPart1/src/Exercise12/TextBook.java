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
 * @version 1.0
 * --------------------------
 * create class textbook
 */
public class TextBook extends Book{
    private int state; // state of textbook is 1 if new and is 2 if old

    public TextBook() {
    }

    public TextBook(int state, String id, String name, String date, double price, int amount, String publisher) {
        super(id, name, date, price, amount, publisher);
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    /**
     * function calculate money of textbook
     * output: return money of textbook
     */
    @Override
    public double calculateMoney() {
        double temp = super.calculateMoney();
        double result = 0;
        if(this.state == 1){
            result = temp;
        }else{
            result = temp * 0.5;
        }
        return result;
    }

    /**
     * function show information of text book
     */
    @Override
    public void showInfor() {
        super.showInfor();
        if(this.state == 1){
            System.out.println("Type book: new book");
        }else{
            System.out.println("Type book: old book");
        }
    }
    
    
    
}
