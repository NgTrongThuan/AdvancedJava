package SourcePackage;

import java.util.ArrayList;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 06-Sep-2016 8:34:43 AM
 * -------------------------------
 * create class teacher to manage information of teacher
 */
public class Teacher extends Human {

	public ArrayList<Subject> ability;

	public Teacher(String email, String name, String phone) {
		super(email, name, phone);
		// TODO Auto-generated constructor stub
	}

	
	public Teacher(String email, String name, String phone,
			ArrayList<Subject> ability) {
		super(email, name, phone);
		this.ability = ability;
	}


	public ArrayList<Subject> getAbility() {
		return ability;
	}


	public void setAbility(ArrayList<Subject> ability) {
		this.ability = ability;
	}


	public void finalize() throws Throwable {
		super.finalize();
	}

}