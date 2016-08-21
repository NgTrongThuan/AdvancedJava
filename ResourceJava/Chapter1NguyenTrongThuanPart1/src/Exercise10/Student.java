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
 * --------------------------
 * create class student
 */
public class Student extends Human{
    private String studentOfClass;
    private double scoreSemester1;
    private double scoreSemester2;

    public Student() {
    }

    public Student(String studentOfClass, double scoreSemester1, double scoreSemester2, String name, String birth, String address, String phone) {
        super(name, birth, address, phone);
        this.studentOfClass = studentOfClass;
        this.scoreSemester1 = scoreSemester1;
        this.scoreSemester2 = scoreSemester2;
    }

    public String getStudentOfClass() {
        return studentOfClass;
    }

    public void setStudentOfClass(String studentOfClass) {
        this.studentOfClass = studentOfClass;
    }

    public double getScoreSemeter1() {
        return scoreSemester1;
    }

    public void setScoreSemeter1(double scoreSemester1) {
        this.scoreSemester1 = scoreSemester1;
    }

    public double getScoreSemeter2() {
        return scoreSemester2;
    }

    public void setScoreSemeter2(double scoreSemester2) {
        this.scoreSemester2 = scoreSemester2;
    }
    
    /**
     * 
     * function calculate average score of student
     * return average score of student
     */
    public double calculateAverageScore(){
        double averageScore = (this.getScoreSemeter1() + this.getScoreSemeter2()) / 2;
        return averageScore;
    }
    
    /**
     * function show information of student
     */
    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Class: " + this.getStudentOfClass());
        System.out.println("Average score: " + this.calculateAverageScore());
    }
    
}
