package Exercise13;

import Exercise6.Employee;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1.0
 * -------------------------
 * create class trade Employee
 */
public class TradeEmployee extends Employee{
    private double salaryTrade;
    private double rateSalaryTrade;

    public TradeEmployee() {
    }

    public TradeEmployee(double salaryTrade, double rateSalaryTrade, String name, double payRate, int numOfPeople, double fringeBenefits) {
        super(name, payRate, numOfPeople, fringeBenefits);
        this.salaryTrade = salaryTrade;
        this.rateSalaryTrade = rateSalaryTrade;
    }

    public double getSalaryTrade() {
        return salaryTrade;
    }

    public void setSalaryTrade(double salaryTrade) {
        this.salaryTrade = salaryTrade;
    }

    public double getRateSalaryTrade() {
        return rateSalaryTrade;
    }

    public void setRateSalaryTrade(double rateSalaryTrade) {
        this.rateSalaryTrade = rateSalaryTrade;
    }
    
    /**
     * function calculate bonus salary
     * return bonus salary
     */
    
    public double calculateBonus(){
        return this.getSalaryTrade() * this.getRateSalaryTrade();
    }
    /**
     * function calculate salary
     */
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + this.calculateBonus();
    }
}
