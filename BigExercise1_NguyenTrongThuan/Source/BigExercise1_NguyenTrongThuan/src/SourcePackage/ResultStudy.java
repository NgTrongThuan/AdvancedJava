package SourcePackage;

import java.util.ArrayList;

public class ResultStudy {
	public ArrayList<ResultSubject> arrResultSubject;
	public Student student;
	
	public ResultStudy() {
		super();
	}

	public ResultStudy(ArrayList<ResultSubject> arrResultSubject, Student student) {
		super();
		this.arrResultSubject = arrResultSubject;
		this.student = student;
	}

	public ArrayList<ResultSubject> getArrResultSubject() {
		return arrResultSubject;
	}

	public void setArrResultSubject(ArrayList<ResultSubject> arrResultSubject) {
		this.arrResultSubject = arrResultSubject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void show(){
		System.out.println("Học viên: " + student.getName());
		for(ResultSubject result: arrResultSubject){
			result.showResult();
		}
	}
}
