/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise13;

import Exercise6.Employee;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version: 1.0
 * --------------------------
 * create class production employee
 */
public class ProductionEmployee extends Employee{
    final double RATEBONUS = 0.05;
    final int AMOUNT = 1000;
    private int amount;

    public ProductionEmployee() {
    }

    public ProductionEmployee(int amount, String name, double payRate, int numOfPeople, double fringeBenefits) {
        super(name, payRate, numOfPeople, fringeBenefits);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    /**
     * function calculate salary of production employee
     * output: return salary as double
     */
    @Override
    public double calculateSalary() {
        double bonus = (this.amount - this.AMOUNT) * this.RATEBONUS;
        return super.calculateSalary() + bonus;
    }
}
