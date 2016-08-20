/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Win7-64 SP1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a: ");
            int a = Integer.parseInt(input.readLine());
            System.out.print("Input b: ");
            int b = Integer.parseInt(input.readLine());
            Calculator cal = new Calculator(a, b);
            System.out.println("Add 2 numbers: " + cal.calculateAddition());
            System.out.println("Sub 2 numbers: " + cal.calculateSubtraction());
            System.out.println("Multi 2 numbers: " + cal.calculateMultiplication());
            System.out.println("Devise 2 numbers: " + cal.calculateDevision());
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
}
