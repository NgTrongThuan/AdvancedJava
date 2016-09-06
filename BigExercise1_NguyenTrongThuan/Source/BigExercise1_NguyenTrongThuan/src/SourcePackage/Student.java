package SourcePackage;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 06-Sep-2016 8:34:44 AM
 * -------------------------------
 * create class student to manage information of student of class
 */
public class Student extends Human {

	public String dateOfBirth;

	public Student(String email, String name, String phone) {
		super(email, name, phone);
	}

	public Student(String email, String name, String phone, String dateOfBirth) {
		super(email, name, phone);
		this.dateOfBirth = dateOfBirth;
	}

	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}