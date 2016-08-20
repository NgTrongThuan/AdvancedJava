/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 08/06/2016
 * @version 1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String option = "y";
            ArrayList<CD> arrayCD = new ArrayList<CD>();
            while (option.equals("y")) {
                System.out.println("-----------------------------------------");
                System.out.println("Input information of CD: ");
                System.out.print("Input ID: ");
                String id = input.readLine();
                System.out.print("Input name of CD: ");
                String name = input.readLine();
                System.out.print("Input singer: ");
                String singer = input.readLine();
                System.out.print("Input number of song: ");
                int numOfSong = Integer.parseInt(input.readLine());
                if (numOfSong <= 0) {
                    throw new ArithmeticException("Number of song is not valid!");
                }
                System.out.print("Input price: ");
                double price = Double.parseDouble(input.readLine());
                if (price <= 0) {
                    throw new ArithmeticException("Price is not valid!");
                }
                arrayCD.add(new CD(id, name, singer, numOfSong, price));
                System.out.println("------------------------------------------");
                System.out.println("Do you want to add new CD ? (y/n)");
                option = input.readLine().toLowerCase();
                if(!option.equals("y") && !option.equals("n")) throw new ArithmeticException("Choice value is not valid!");
            }
            System.out.println("------------------------------------------");
            double totalPrice = 0;
            for (CD cd : arrayCD) {
                cd.showCD();
                totalPrice += cd.getPrice();
            }
            System.out.println("------------------------------------------");
            System.out.println(String.format("Total price: %.3f", totalPrice));
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
