/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * function choice 
     * output: if continue return y else return n
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
            String choice = "y";
            ArrayList<Laptop> arrLaptop = new ArrayList<Laptop>();
            ArrayList<Desktop> arrDesktop = new ArrayList<Desktop>();
            while (choice.equals("y")) {
                System.out.println("-----------------------------------------");
                System.out.print("Input seri: ");
                String seri = input.readLine();
                System.out.print("Input brand: ");
                String brand = input.readLine();
                System.out.print("Input price: ");
                double price = Double.parseDouble(input.readLine());
                if (price <= 0) {
                    throw new ArithmeticException("Price is not valid!");
                }
                System.out.print("Quanlity: ");
                int quanlity = Integer.parseInt(input.readLine());
                if (quanlity <= 0) {
                    throw new ArithmeticException("Quanlity is not valid!");
                }
                System.out.println("-----------------------------------------");
                System.out.println("Choice:");
                System.out.println("Press 1: lapop");
                System.out.println("Press 2: desktop");
                int option = Integer.parseInt(input.readLine());
                switch (option) {
                    case 1: {
                        System.out.print("Input weight: ");
                        double weight = Double.parseDouble(input.readLine());
                        System.out.print("Input time of pin: ");
                        double pin = Double.parseDouble(input.readLine());
                        System.out.print("Resolution: ");
                        double resolution = Double.parseDouble(input.readLine());
                        arrLaptop.add(new Laptop(weight, pin, resolution, seri, price, brand, quanlity));
                        choice = choice();
                    }
                    break;
                    case 2: {
                        System.out.print("Input CPU: ");
                        String cpu = input.readLine();
                        System.out.print("Input RAM: ");
                        String ram = input.readLine();
                        arrDesktop.add(new Desktop(cpu, ram, seri, price, brand, quanlity));
                        choice = choice();
                    }
                    break;
                    default:
                        System.out.println("Choice value is not valid!");
                }
            }
            double totalPayOfLaptop = 0;
            double totalPayOfDesktop = 0;
            System.out.println("-----------------------------------------");
            System.out.println("Information of laptop");
            for (Laptop laptop : arrLaptop) {
                laptop.showInformation();
                totalPayOfLaptop += laptop.getPrice() * laptop.getQuantity();
            }
            System.out.println("-----------------------------------------");
            System.out.println("Information of desktop");
            for (Desktop desktop : arrDesktop) {
                desktop.showInformation();
                totalPayOfDesktop += desktop.getPrice() * desktop.getQuantity();
            }

            double totalPay = totalPayOfDesktop + totalPayOfLaptop;
            System.out.println(String.format("Total pay of computer: %.3f", totalPay));
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
