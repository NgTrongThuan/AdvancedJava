/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

import Exercise3.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Input coordinate x of point A: ");
            double xA = Integer.parseInt(input.readLine());
            System.out.print("Input coordinate y of point A: ");
            double yA = Integer.parseInt(input.readLine());
            System.out.print("Input coordinate x of point C: ");
            double xC = Integer.parseInt(input.readLine());
            System.out.print("Input coordinate x of point C: ");
            double yC = Integer.parseInt(input.readLine());
            
            Point pointA = new Point(xA, yA);
            Point pointC = new Point(xC, yC);
            
            if((pointA.getX() == pointC.getX()) || (pointA.getY() == pointC.getY())){
                System.out.println("Not is rectangle!");
            }else{
                Rectangle rec = new Rectangle(pointA, pointC);
                System.out.println("Perimeter of rectangle is: " + rec.findPerimeter());
                System.out.println("Area of rectangle is: " + rec.findArea());
            }            
        }catch(NumberFormatException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
}
