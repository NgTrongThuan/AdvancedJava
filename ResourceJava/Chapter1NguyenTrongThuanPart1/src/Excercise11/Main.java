/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1.0
 */
public class Main {

    /**
     * function choice
     * output: return y is continue and else return n
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
            ArrayList<GoldTransaction> arrGold = new ArrayList<GoldTransaction>();
            ArrayList<MoneyTransaction> arrMoney = new ArrayList<MoneyTransaction>();
            double sumGold = 0;
            double sumMoney = 0;
            String check = "y";
            while (check.equals("y")) {
                System.out.println("-----------------------------------------------");
                System.out.print("Input ID transaction: ");
                String id = input.readLine();
                System.out.print("Input date: ");
                String date = input.readLine();
                System.out.print("Input amount: ");
                double amount = Double.parseDouble(input.readLine());
                System.out.println("-----------------------------------------------");
                System.out.println("Option:");
                System.out.println("Press 1: Gold transaction: ");
                System.out.println("Press 2: Money transaction: ");
                int option = Integer.parseInt(input.readLine());
                if (option != 1 && option != 2) {
                    throw new ArithmeticException("Option value is not valid!");
                }
                int choice = 0;
                int choiceTrans = 0;
                if (option == 1) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("GOLD TRANSACTION");
                    System.out.println("Input type of gold: ");
                    System.out.println("Press 1: SJC99999");
                    System.out.println("Press 2: 24K");
                    choice = Integer.parseInt(input.readLine());
                    if (choice == 1) {
                        GoldTransaction gold = new GoldTransaction(Gold.SJC9999, id, date, amount);
                        arrGold.add(gold);
                        sumGold += gold.calculateGold(choice);
                    } else {
                        GoldTransaction gold = new GoldTransaction(Gold.GOLD24K, id, date, amount);
                        arrGold.add(gold);
                        sumMoney += gold.calculateGold(choice);
                    }
                    System.out.println("Gold transaction is SUCCESSFULL!");
                    check = choice();
                } else {
                    System.out.println("-----------------------------------------------");
                    System.out.println("MONEY TRANSACTION");
                    System.out.println("Input type of money: ");
                    System.out.println("Press 1: USD");
                    System.out.println("Press 2: EUR");
                    System.out.println("Press 3: AUD");
                    choice = Integer.parseInt(input.readLine());
                    if (choice != 1 && choice != 2 && choice != 3) {
                        throw new ArithmeticException("Choice value is not valid!");
                    }
                    System.out.println("-----------------------------------------------");
                    System.out.println("Press 1: Buy transaction");
                    System.out.println("Press 2: Sell transaction");
                    choiceTrans = Integer.parseInt(input.readLine());
                    if (choice == 1) {
                        MoneyTransaction money = new MoneyTransaction(Money.USD, choiceTrans, id, date, amount);
                        arrMoney.add(money);
                        sumMoney += money.calculateMoney(choice);
                    } else if (choice == 2) {
                        MoneyTransaction money = new MoneyTransaction(Money.EUR, choiceTrans, id, date, amount);
                        arrMoney.add(money);
                        sumMoney += money.calculateMoney(choice);
                    } else {
                        MoneyTransaction money = new MoneyTransaction(Money.AUD, choiceTrans, id, date, amount);
                        arrMoney.add(money);
                        sumMoney += money.calculateMoney(choice);
                    }
                    System.out.println("Money transaction is SUCCESSFULL!");
                    check = choice();
                }
            }
            int countGold = 1;
            int countMoney = 0;
            System.out.println("-----------------------------------------------");
            System.out.println("GOLD TRANSACTION");
            for (GoldTransaction gold : arrGold) {
                gold.showInformation();
                countGold++;
            }
            System.out.println("-----------------------------------------------");
            if(countGold != 0){
                System.out.println(String.format("Average of money: %.3f", (sumGold / countGold)));
            }
            System.out.println("-----------------------------------------------");
            System.out.println("MONEY TRANSACTION");
            for (MoneyTransaction money : arrMoney) {
                money.showInformation();
                countMoney++;
            }
            System.out.println("-----------------------------------------------");
            if(countMoney != 0){
                System.out.println(String.format("Avareage of money: %.3f", (sumMoney / countMoney)));
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
