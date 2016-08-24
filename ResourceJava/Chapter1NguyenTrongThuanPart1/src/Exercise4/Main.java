package Exercise4;

import Exercise3.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Trong Thuan
 * date: 20/08/2016
 */
public class Main {

    /**
     * main methods call methods in class circle and show it
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Input coodinate x of O: ");
            int xO = Integer.parseInt(input.readLine());
            System.out.print("Input coodinate y of O: ");
            int yO = Integer.parseInt(input.readLine());
            System.out.print("Input coodinate x of R: ");
            int xR = Integer.parseInt(input.readLine());
            System.out.print("Input coodinate y of R: ");
            int yR = Integer.parseInt(input.readLine());
            
            Point O = new Point(xO, yO);
            Point R = new Point(xR, yR);           
            Circle C = new Circle(O, R);
            
            double perimeter = C.calculatePerimeter();
            double area = C.calculateArea();
            
            System.out.println("Primeter of circle = " + perimeter);
            System.out.println("Area of circle = " + area);
        }catch(NumberFormatException | NullPointerException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
