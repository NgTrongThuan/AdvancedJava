package SourcePackage;

import java.util.Date;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 06-Sep-2016 8:34:44 AM
 * -------------------------------
 * create class Subject to manage information of subject
 */
public class Subject {

	public Date endDay;
	public String name;
	private int numOfLesson;
	public Date startDay;
	public Teacher teacher;

	public Subject(){

	}

	public Subject(Date endDay, String name, int numOfLesson, Date startDay) {
		super();
		this.endDay = endDay;
		this.name = name;
		this.numOfLesson = numOfLesson;
		this.startDay = startDay;
	}

	public Subject(Date endDay, String name, int numOfLesson, Date startDay,
			Teacher teacher) {
		super();
		this.endDay = endDay;
		this.name = name;
		this.numOfLesson = numOfLesson;
		this.startDay = startDay;
		this.teacher = teacher;
	}

	public void finalize() throws Throwable {

	}
	
	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * function calculate distance between days
	 * return number of day is long
	 */
	
	public long calcDistanceDay(){
		return (endDay.getTime() - startDay.getTime()) / 86400000;
	}

}