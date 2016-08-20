/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version 1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * function war of soldier 
     * Input: Infantryman, Trooper, firstHit is who is first hit 
     * Output: return 1 if infantryman win, return 2 if trooper win
     */
    public static int warOfSoldier(Infantryman in, Trooper tr, int firstHit) {
        if (firstHit != 1 && firstHit != 2) {
            throw new ArithmeticException("Who first hit is not valid!");
        }
        int result = 0;
        while (in.getPower() >= 0 || tr.getPower() >= 0) {
            if (firstHit == 1) {
                tr.fight();
                in.fight();
            } else {
                in.fight();
                tr.fight();
            }
        }
        if (tr.getPower() > in.getPower()) {
            result = 2;
        } else {
            return 1;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input information of infantryman: ");
            System.out.print("Input name: ");
            String nameOfIn = input.readLine();
            System.out.print("Input power: ");
            int powerOfIn = Integer.parseInt(input.readLine());
            if (powerOfIn <= 0) {
                throw new ArithmeticException("Power is not valid!");
            }
            System.out.print("Input weapon:");
            String weaponOfIn = input.readLine();

            Infantryman in = new Infantryman(nameOfIn, powerOfIn, weaponOfIn);
            System.out.println("--->Infantryman created!");

            System.out.println("Input information of trooper: ");
            System.out.print("Input name: ");
            String nameOfTr = input.readLine();
            System.out.print("Input power: ");
            int powerOfTr = Integer.parseInt(input.readLine());
            if (powerOfTr <= 0) {
                throw new ArithmeticException("Power is not valid!");
            }
            System.out.print("Input weapon: ");
            String weaponOfTr = input.readLine();

            Trooper tr = new Trooper(nameOfTr, powerOfTr, weaponOfTr);
            System.out.println("--->Trooper created!");
            System.out.println("-------------------------------------");
            System.out.println("Ready, who is first hit ");
            System.out.println("Press 1 is infantryman.");
            System.out.println("Press 2 is trooper.");
            int choice = Integer.parseInt(input.readLine());
            int result = warOfSoldier(in, tr, choice);
            if (result == 1) {
                System.out.println("Infantryman win!");
            } else {
                System.out.println("Tropper win!");
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
