package Exercise2;

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
     * call method in class Calculator and show in application
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
