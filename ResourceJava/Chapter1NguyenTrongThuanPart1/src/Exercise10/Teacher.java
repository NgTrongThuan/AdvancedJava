/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 21/08/2016
 * @version 1
 * ---------------------------
 * create class teacher
 */
public class Teacher extends Human{
    final double SALARY = 1260000;
    private String managerClass;
    private double rateSalary;
    private double subvention;

    public Teacher() {
    }

    public Teacher(String managerClass, double rateSalary, double subvention, String name, String birth, String address, String phone) {
        super(name, birth, address, phone);
        this.managerClass = managerClass;
        this.rateSalary = rateSalary;
        this.subvention = subvention;
    }

    public String getManagerClass() {
        return managerClass;
    }

    public void setManagerClass(String managerClass) {
        this.managerClass = managerClass;
    }

    public double getRateSalary() {
        return rateSalary;
    }

    public void setRateSalary(double rateSalary) {
        this.rateSalary = rateSalary;
    }

    public double getSubvention() {
        return subvention;
    }

    public void setSubvention(double subvention) {
        this.subvention = subvention;
    }
    
    /**
     * function calculate salary of teacher
     * output: return salary of teacher as double type
     */
    
    public double calculateSalary(){
        double salary = this.getRateSalary() * SALARY + this.getSubvention();
        return salary;
    }
    
    /**
     * function show information of teacher
     */
    
    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Class manager: " + this.getManagerClass());
        System.out.println("Rate of salary: " + this.getRateSalary());
        System.out.println(String.format("Subvention: %.3f", this.getSubvention()));
        System.out.println(String.format("Salary: %.3f", this.calculateSalary()));
    }
}
