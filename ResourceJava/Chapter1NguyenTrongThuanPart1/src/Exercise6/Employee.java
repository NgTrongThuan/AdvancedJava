/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise6;
import Exercise6.EnumPersonalIncomeTax;
/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1 class employee
 */
public class Employee {

    private String name;
    private double payRate;
    private int numOfPeople;
    private double fringeBenefits;
    final double BASIC_SALARY = 1260000;
    final double DEFAULT_SALARY_1 = 9000000;
    final double DEFAULT_SALARY_2 = 3600000;

    public Employee(String name, double payRate, int numOfPeople, double fringeBenefits) {
        this.name = name;
        this.payRate = payRate;
        this.numOfPeople = numOfPeople;
        this.fringeBenefits = fringeBenefits;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public double getFringeBenefits() {
        return fringeBenefits;
    }

    public void setFringeBenefits(double fringeBenefits) {
        this.fringeBenefits = fringeBenefits;
    }

    /**
     * Function get salary of employee 
     * Output: salary of employee as double type
     */
    public double calculateSalary() {
        if(this.getPayRate() < 0) throw new ArithmeticException("Pay rate is not valid!");
        if(this.getFringeBenefits() < 0) throw new ArithmeticException("Fringe Benefits is not valid!");
        double salary = this.getPayRate() * BASIC_SALARY + this.getFringeBenefits();
        return salary;
    }

    /**
     * Function get salary of tax Output: salary of tax as double type
     */
    public double calculateSalaryTax() {
        if(this.getNumOfPeople() < 0) throw new ArithmeticException("Number of people depend is not valid!");
        double salaryTax = this.calculateSalary() - DEFAULT_SALARY_1 - this.getNumOfPeople() * DEFAULT_SALARY_2;
        return salaryTax;
    }

    /**
     * Function get Personal income tax 
     * Output: return Personal income tax as double type
     */
    public double calculatePersonalIncomeTax() {
        double result = 0;
        EnumPersonalIncomeTax pITax = null;
        double calcSalaryTax = this.calculateSalaryTax();
        if (calcSalaryTax < pITax.RATE1.getSalaryTax()) {
            result = pITax.RATE1.calculatePersonalIncomeTax(calcSalaryTax);
        } else if (calcSalaryTax < pITax.RATE2.getSalaryTax()) {
            result = pITax.RATE2.calculatePersonalIncomeTax(calcSalaryTax);
        }else if (calcSalaryTax < pITax.RATE3.getSalaryTax()) {
            result = pITax.RATE3.calculatePersonalIncomeTax(calcSalaryTax);
        }else if (calcSalaryTax < pITax.RATE4.getSalaryTax()) {
            result = pITax.RATE4.calculatePersonalIncomeTax(calcSalaryTax);
        }else if (calcSalaryTax < pITax.RATE5.getSalaryTax()) {
            result = pITax.RATE5.calculatePersonalIncomeTax(calcSalaryTax);
        }else if (calcSalaryTax < pITax.RATE6.getSalaryTax()) {
            result = pITax.RATE6.calculatePersonalIncomeTax(calcSalaryTax);
        }else{
            result = pITax.RATE7.calculatePersonalIncomeTax(calcSalaryTax);
        }
        return result;
    }
    
    public double calculateNetSalary(){
        double result = this.calculateSalary() - this.calculatePersonalIncomeTax();
        return result;
    }
}