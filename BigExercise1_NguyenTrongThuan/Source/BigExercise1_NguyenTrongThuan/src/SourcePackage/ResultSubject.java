package SourcePackage;

import java.util.ArrayList;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 06-Sep-2016 8:34:44 AM 
 * ------------------------------- 
 * create class Result implements to interface CalculateGrade
 */
public class ResultSubject implements CalculateGrade {

	public double gradeTheory;
	public double gradePractice;
	public ArrayList<GradeOfDay> gradeOfDay;
	public Subject subject;
	public Student student;

	public ResultSubject() {

	}

	public ResultSubject(double gradeTheory, double gradePractice, ArrayList<GradeOfDay> gradeOfDay, Subject subject,
			Student student) {
		super();
		this.gradeTheory = gradeTheory;
		this.gradePractice = gradePractice;
		this.gradeOfDay = gradeOfDay;
		this.subject = subject;
		this.student = student;
	}


	public ResultSubject(double gradeTheory, double gradePractice,
			ArrayList<GradeOfDay> gradeOfDay, Subject subject) {
		super();
		this.gradeTheory = gradeTheory;
		this.gradePractice = gradePractice;
		this.gradeOfDay = gradeOfDay;
		this.subject = subject;
	}

	public double getGradeTheory() {
		return gradeTheory;
	}

	public void setGradeTheory(double gradeTheory) {
		this.gradeTheory = gradeTheory;
	}

	public double getGradePractice() {
		return gradePractice;
	}

	public void setGradePractice(double gradePractice) {
		this.gradePractice = gradePractice;
	}

	public ArrayList<GradeOfDay> getGradeOfDay() {
		return gradeOfDay;
	}

	public void setGradeOfDay(ArrayList<GradeOfDay> gradeOfDay) {
		this.gradeOfDay = gradeOfDay;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public void finalize() throws Throwable {

	}

	/**
	 * function calculate grade personal of student return grade personal of student
	 */

	public double calcGradePersonal() {
		int count = 0;
		int temp = 0;
		for (GradeOfDay value : gradeOfDay) {
			temp += value.calcGrade();
			count++;
		}
		return temp / count;
	}

	/**
	 * function calculate grade total of student 
	 * return grade = grade personal * 0.3 + theory * 0.4 + practice * 0.3
	 */
	public double calcGrade() {
		return calcGradePersonal() * 0.3 + gradeTheory * 0.4 + gradePractice * 0.3;
	}

	/**
	 * function show result study of student 
	 * input: student object
	 */
	public void showResult() {
		System.out.println("Môn: " + subject.getName());
		System.out.println("Điểm tổng kết cá nhân: " + calcGradePersonal());
		System.out.println("Điểm lý thuyết: " + gradeTheory);
		System.out.println("Điểm thực hành: " + gradePractice);
		System.out.println("Điểm trung bình môn: " + calcGrade());
		System.out.println("--------------------------------------");
	}

}
