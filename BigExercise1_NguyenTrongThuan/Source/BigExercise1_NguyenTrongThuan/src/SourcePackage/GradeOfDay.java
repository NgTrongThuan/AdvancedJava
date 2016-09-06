package SourcePackage;

/**
 * @author Nguyen Trong Thuan
 * @version 1.0
 * @created 06-Sep-2016 8:34:44 AM
 * -------------------------------
 * create class GradeOfDay implements CalculateGrade
 */
public class GradeOfDay implements CalculateGrade {

	public double gradeDiligence;
	public double gradeExam;
	public double gradePossitive;

	public GradeOfDay(){

	}

	public GradeOfDay(double gradeDiligence, double gradeExam,
			double gradePossitive) {
		super();
		this.gradeDiligence = gradeDiligence;
		this.gradeExam = gradeExam;
		this.gradePossitive = gradePossitive;
	}

	public double getGradeDiligence() {
		return gradeDiligence;
	}

	public void setGradeDiligence(double gradeDiligence) {
		this.gradeDiligence = gradeDiligence;
	}

	public double getGradeExam() {
		return gradeExam;
	}

	public void setGradeExam(double gradeExam) {
		this.gradeExam = gradeExam;
	}

	public double getGradePossitive() {
		return gradePossitive;
	}

	public void setGradePossitive(double gradePossitive) {
		this.gradePossitive = gradePossitive;
	}

	public void finalize() throws Throwable {

	}

	/**
	 * function calculate grade Diligence
	 * input: grade diligence morning and afternoon
	 * output: grade diligence of day = (grade diligence morning + afternoon)/2
	 */
	public double calcGradeDeligence(double morningGrade, double afternoonGrade){
		return (morningGrade + afternoonGrade) / 2;
	}
	
	/**
	 * function calculate grade of day student
	 * return grade of day student = gradeDiligence * 0.3 + gradePossitive * 0.1 + gradeExam * 0.6
	 */
	public double calcGrade(){
		return gradeDiligence * 0.3 + gradePossitive * 0.1 + gradeExam * 0.6;
	}

}