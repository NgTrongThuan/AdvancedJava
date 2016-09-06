package SourcePackage;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 06-Sep-2016 8:34:43 AM
 * -------------------------------
 * create class Class of course 
 */
public class Class {

	public Date endDay;
	public String id;
	public String name;
	public int numOfLesson;
	public Date startDay;
	public ArrayList<Subject> m_Subject;
	public ArrayList<Student> m_Student;

	public Class(){

	}
	
	public Class(Date endDay, String id, String name, int numOfLesson,
			Date startDay, ArrayList<Subject> m_Subject) {
		super();
		this.endDay = endDay;
		this.id = id;
		this.name = name;
		this.numOfLesson = numOfLesson;
		this.startDay = startDay;
		this.m_Subject = m_Subject;
	}

	public Class(Date endDay, String id, String name, int numOfLesson, Date startDay, ArrayList<Subject> m_Subject,
			ArrayList<Student> m_Student) {
		super();
		this.endDay = endDay;
		this.id = id;
		this.name = name;
		this.numOfLesson = numOfLesson;
		this.startDay = startDay;
		this.m_Subject = m_Subject;
		this.m_Student = m_Student;
	}


	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfLesson() {
		return numOfLesson;
	}

	public void setNumOfLesson(int numOfLesson) {
		this.numOfLesson = numOfLesson;
	}

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public ArrayList<Subject> getM_Subject() {
		return m_Subject;
	}

	public void setM_Subject(ArrayList<Subject> m_Subject) {
		this.m_Subject = m_Subject;
	}
	


	public ArrayList<Student> getM_Student() {
		return m_Student;
	}

	public void setM_Student(ArrayList<Student> m_Student) {
		this.m_Student = m_Student;
	}

	/**
	 * function calculate distance between days
	 * return number of day is long
	 */
	
	public long calcDistanceDay(){
		return (endDay.getTime() - startDay.getTime()) / 86400000;
	}
	public void finalize() throws Throwable {

	}

}