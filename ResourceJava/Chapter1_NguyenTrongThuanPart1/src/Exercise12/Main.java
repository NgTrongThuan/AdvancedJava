/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1.0
 */
public class Main {

    /**
     * function choice 
     * output: return y if continue and else return n
     */
    public static String choice() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Do you want continue ? (y/n)");
        String choice = input.readLine().toLowerCase();
        if (!choice.equals("y") && !choice.equals("n")) {
            throw new ArithmeticException("Choice is not valid!");
        }
        return choice;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String check = "y";
            ArrayList<TextBook> arrText = new ArrayList<TextBook>();
            ArrayList<ReferenceBook> arrRef = new ArrayList<ReferenceBook>();
            while (check.equals("y")) {
                System.out.println("---------------------------------------------");
                System.out.print("Input id of book: ");
                String id = input.readLine();
                System.out.print("Input name: ");
                String name = input.readLine();
                System.out.print("Input date: ");
                String date = input.readLine();
                System.out.print("Input price: ");
                double price = Double.parseDouble(input.readLine());
                System.out.print("Input amount: ");
                int amount = Integer.parseInt(input.readLine());
                System.out.print("Input pulisher: ");
                String publisher = input.readLine();
                System.out.println("---------------------------------------------");
                System.out.println("Option: ");
                System.out.println("Press 1: Text book");
                System.out.println("Press 2: Reference book");
                int option = Integer.parseInt(input.readLine());
                if (option != 1 && option != 2) {
                    throw new ArithmeticException("Option value is not valid!");
                }
                if (option == 1) {
                    System.out.println("---------------------------------------------");
                    System.out.println("Input state of text book: ");
                    System.out.println("Press 1: new book");
                    System.out.println("Press 2: Old book");
                    int state = Integer.parseInt(input.readLine());
                    arrText.add(new TextBook(state, id, name, date, price, amount, publisher));
                    check = choice();
                    System.out.println("Add text book SUCESSFULL!");
                }else{
                    System.out.println("---------------------------------------------");
                    System.out.print("Input tax of reference book: ");
                    double tax =  Double.parseDouble(input.readLine());
                    arrRef.add(new ReferenceBook(tax, id, name, date, price, amount, publisher));
                    check = choice();
                    System.out.println("Add reference book SUCCESSFULL!");
                }
            }
            double moneyOfText = 0;
            double moneyOfRef = 0;
            int count = 0;
            double priceRef = 0;
            System.out.println("---------------------------------------------");
            System.out.println("Textbook list");
            for(TextBook text : arrText){
                text.showInfor();
                moneyOfText += text.calculateMoney();
            }
            System.out.println("---------------------------------------------");
            System.out.println("Reference book list");
            for(ReferenceBook ref : arrRef){
                ref.showInfor();
                moneyOfRef += ref.calculateMoney();
                priceRef += ref.getPrice();
                count ++;
            }
            
            System.out.println("---------------------------------------------");
            System.out.println(String.format("Sum money of text book: %.3f", moneyOfText));
            System.out.println(String.format("Sum money of reference book: %.3f", moneyOfRef));
            if(count != 0){
                System.out.println(String.format("Average price of reference book: %.3f", (priceRef / count)));
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
