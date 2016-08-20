/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class Main {

    /**
     * Main method to run application
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Input coordinates x of first point: ");
            int xA = Integer.parseInt(input.readLine());
            System.out.print("Input coordinates y of first point: ");
            int yA = Integer.parseInt(input.readLine());
            System.out.print("Input coordinates x of second point: ");
            int xB = Integer.parseInt(input.readLine());
            System.out.print("Input coordinates y of second point: ");
            int yB = Integer.parseInt(input.readLine());
            
            Point A = new Point(xA, yA);
            Point B = new Point(xB, yB);        
            Line l = new Line(A, B);
            double distance = l.calculateDistance();
            System.out.println("Distance of Point A and B is: " + l.calculateDistance());
        }catch(NumberFormatException | NullPointerException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
}
