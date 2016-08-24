package Exercise6;

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
            System.out.print("Input name of employee: ");
            String name = input.readLine();
            System.out.print("Input pay rate: ");
            double payRate = Double.parseDouble(input.readLine());
            System.out.print("Input number of people: ");
            int numOfPeople = Integer.parseInt(input.readLine());
            System.out.print("Input fringe benefits: ");
            double frBenefit = Double.parseDouble(input.readLine());
            
            Employee e = new Employee(name, payRate, numOfPeople, frBenefit);
            
            double salary = e.calculateSalary();
            double salaryTax = e.calculateSalaryTax();
            double pITax = e.calculatePersonalIncomeTax();
            double netSalary = e.calculateNetSalary();
            
            System.out.println("Salary of " + name);
            System.out.println(String.format("Salary is : %.3f", salary));
            System.out.println(String.format("Salary tax is : %.3f", salaryTax));
            System.out.println(String.format("Salary personal income tax is: %.3f", pITax));
            System.out.println(String.format("Net salary is : %.3f", netSalary));
        }catch(NumberFormatException | ArithmeticException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
