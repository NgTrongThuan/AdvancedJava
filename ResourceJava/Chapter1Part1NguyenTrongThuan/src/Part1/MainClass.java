/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainClass {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a: ");
            int a = Integer.parseInt(input.readLine());
            System.out.print("Input b: ");
            int b = Integer.parseInt(input.readLine());
            
            LinearEquation le = new LinearEquation();
            le.setA(a);
            le.setB(b);
            double result = le.findRoot();

            if (result == le.getGREATESTVALUE()) {
                System.out.println("Have more root!");
            } else if (result == le.getLEASTVALUE()) {
                System.err.println("Have not root!");
            } else {
                System.out.println("Have a root: x = " + result);
            }
        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }

}
