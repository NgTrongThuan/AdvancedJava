package Exercise1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Nguyen Trong Thuan
 * @date 19/08/2016
 * @version 1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a: ");
            double a = Double.parseDouble(input.readLine());
            System.out.print("Input b: ");
            double b = Double.parseDouble(input.readLine());

            LinearEquation le = new LinearEquation(a, b);
            double result = le.calculateRoot();

            if (result == Double.MAX_VALUE) {
                System.out.println("Have more root!");
            } else if (result == Double.MIN_VALUE) {
                System.err.println("Have not root!");
            } else {
                System.out.println("Have a root: x = " + result);
            }
        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
