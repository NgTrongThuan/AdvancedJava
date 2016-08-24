package Exercise13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 */
public class Main {

    /**
     * function choice output: return y if continue and else return n
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
            ArrayList<TradeEmployee> arrTrade = new ArrayList<TradeEmployee>();
            ArrayList<ProductionEmployee> arrPro = new ArrayList<ProductionEmployee>();
            String check = "y";
            while (check.equals("y")) {
                System.out.println("-----------------------------------------");
                System.out.print("Input name of employee: ");
                String name = input.readLine();
                System.out.print("Input pay rate: ");
                double payRate = Double.parseDouble(input.readLine());
                System.out.print("Input number of people: ");
                int numOfPeople = Integer.parseInt(input.readLine());
                System.out.print("Input fringe benefits: ");
                double frBenefit = Double.parseDouble(input.readLine());
                System.out.println("-----------------------------------------");
                System.out.println("Option:");
                System.out.println("Press 1: Trade employee");
                System.out.println("Press 2: Production employee");
                int option = Integer.parseInt(input.readLine());
                if(option != 1 && option != 2){
                    throw new ArithmeticException("Option value");
                }
                System.out.println("-----------------------------------------");
                if(option == 1){
                    System.out.print("Input salary trade: ");
                    double salaryTrade = Double.parseDouble(input.readLine());
                    if(salaryTrade <= 0){
                        throw new ArithmeticException("Salary trade is not valid!");
                    }
                    System.out.print("Input rate salary trade: ");
                    double rateSalaryTrade = Double.parseDouble(input.readLine());
                    if(rateSalaryTrade <= 0){
                        throw new ArithmeticException("Rate salary trade is not valid!");
                    }
                    arrTrade.add(new TradeEmployee(salaryTrade, rateSalaryTrade, name, payRate, numOfPeople, frBenefit));
                    System.out.println("Add trade employee SUCCESSFUL!");
                    check = choice();
                }else{
                    System.out.print("Input amount product:");
                    int amount = Integer.parseInt(input.readLine());
                    if(amount <= 0){
                        throw new ArithmeticException("Amount is not valid!");
                    }
                    arrPro.add(new ProductionEmployee(amount, name, payRate, numOfPeople, frBenefit));
                    System.out.println("Add production employee SUCCESSFUL!");
                    check = choice();
                }
            }
            double salaryTrade = 0;
            double salaryPro = 0;
            int countTrade = 0;
            int countPro = 0;
            System.out.println("-----------------------------------------");
            for(TradeEmployee trade : arrTrade){
                System.out.println(trade.toString());
                salaryTrade += trade.calculateNetSalary();
                countTrade ++;
            }
            for(ProductionEmployee pro: arrPro){
                System.out.println(pro.toString());
                salaryPro += pro.calculateNetSalary();
                countPro ++;
            }
            System.out.println("-----------------------------------------");
            if(countTrade != 0){
                System.out.println(String.format("Average salary of trade employee: %.3f", (salaryTrade / countTrade)));
            }
            if(countPro != 0){
                System.out.println(String.format("Average salary of production employee: %.3f", (salaryPro / countPro)));
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
