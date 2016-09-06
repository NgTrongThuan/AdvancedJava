package SourcePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Nguyen Trong Thuan 
 * date: 6/9/2016
 * @version : 1.0 
 * -------------------------- 
 * main method
 *
 */
public class main {

	public static void main(String[] args) throws ParseException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			// default list subject
			ArrayList<Subject> arrSubject1 = new ArrayList<>();
			ArrayList<Subject> arrSubject2 = new ArrayList<>();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			arrSubject1.add(new Subject(format.parse("02/10/2010"), "Toán", 4, format.parse("01/10/2010")));
			arrSubject1.add(new Subject(format.parse("02/10/2010"), "Anh Văn", 4, format.parse("01/10/2010")));
			arrSubject2.add(new Subject(format.parse("02/10/2010"), "Lịch sử", 4, format.parse("01/10/2010")));
			// default teacher
			Teacher teacher = new Teacher("tva@edu.vn", "Tran Van A", "0909741852", arrSubject1);

			// default list student
			ArrayList<Student> arrStudent1 = new ArrayList<>();
			ArrayList<Student> arrStudent2 = new ArrayList<>();
			Set<Student> setSt = new HashSet<Student>();
			arrStudent1.add(new Student("hv1@student", "Nguyen Van An", "0996123545", "1/1/1995"));
			arrStudent1.add(new Student("hv2@student", "Tran Van Binh", "0098745210", "13/10/1995"));
			arrStudent2.add(new Student("hv3@student", "Le Thanh Nam", "0978521419", "19/5/1995"));
			arrStudent2.add(new Student("hv4@student", "Tran Huy Hoang", "0987456123", "30/5/1995"));

			// default class
			Class class1 = new Class(format.parse("10/10/2010"), "id1", "Class 1", 24, format.parse("01/10/2010"),
					arrSubject1, arrStudent1);
			Class class2 = new Class(format.parse("10/10/2010"), "id2", "Class 1", 12, format.parse("01/10/2010"),
					arrSubject2, arrStudent2);

			// default list class
			ArrayList<Class> arrClass = new ArrayList<>();
			arrClass.add(class1);
			arrClass.add(class2);

			long countDay = 0;
			double gradeMorning = 0;
			double gradeAfternoon = 0;
			double gradeDiligence = 0;
			double gradeExercise = 0;
			double gradePossitive = 0;
			double gradeTheory = 0;
			double gradePractice = 0;

			ArrayList<ResultSubject> arrResultSubject = new ArrayList<>();

			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Chọn lớp muốn nhập điểm");
			System.out.println("Nhấn 1: Lớp 1");
			System.out.println("Nhấn 2: Lớp 2");
			int typeClass = Integer.parseInt(input.readLine());
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

			if (typeClass == 1) {
				System.out.println("Danh sách các môn của lớp 1:");
				for (Subject subject : class1.getM_Subject()) {
					System.out.println("Môn: " + subject.getName());
					System.out.println("Số ngày học: " + subject.calcDistanceDay());
					System.out.println("----------------------------------------");
				}
				System.out.println("Danh sách các học viên lớp 1:");
				for (Student student : class1.getM_Student()) {
					System.out.println(student.getName());
				}
				for (Student student : class1.getM_Student()) {
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("Nhập điểm cho học viên: " + student.getName());
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
					for (Subject subject : class1.getM_Subject()) {
						ResultSubject resultSubject = new ResultSubject();
						System.out.println("----------------------------------------");
						System.out.println("Môn: " + subject.getName());
						countDay = subject.calcDistanceDay();
						System.out.println("----------------------------------------");
						ArrayList<GradeOfDay> arrGradeOfDay = new ArrayList<>();
						for (int i = 1; i <= countDay; i++) {
							System.out.println("Ngày thứ " + i);
							GradeOfDay gradeOfDay = new GradeOfDay();
							System.out.println("----------------------------------------");
							System.out.println("Điểm danh: (hướng dẫn cách tính điểm)");
							System.out.println("Đi học: 10 điểm, Nghỉ học: 0 điểm, Đi trễ: 5 điểm, Về sớm: 5 điểm");
							System.out.println("----------------------------------------");
							System.out.print("Nhập điểm chuyên cần điểm danh buổi sáng: ");
							gradeMorning = Double.parseDouble(input.readLine());
							if (gradeMorning < 0 || gradeMorning > 10)
								throw new ArithmeticException("Nhập điểm không đúng!");
							System.out.print("Nhập điểm chuyên cần điểm danh buổi chiều: ");
							gradeAfternoon = Double.parseDouble(input.readLine());
							if (gradeAfternoon < 0 || gradeAfternoon > 10)
								throw new ArithmeticException("Nhập điểm không đúng!");
							gradeDiligence = gradeOfDay.calcGradeDeligence(gradeMorning, gradeAfternoon);
							if (gradeDiligence >= 0 && gradeDiligence <= 10) {
								gradeOfDay.setGradeDiligence(gradeDiligence);
							}
							System.out.print("Nhập điểm bài tập: ");
							gradeExercise = Double.parseDouble(input.readLine());
							if (gradeExercise < 0 || gradeExercise > 10) {
								throw new ArithmeticException("Nhập điểm không đúng!");
							} else {
								gradeOfDay.setGradeExam(gradeExercise);
							}
							System.out.print("Nhập điểm tích cực: ");
							gradePossitive = Double.parseDouble(input.readLine());
							System.out.println("----------------------------------------");
							if (gradePossitive < 0 || gradePossitive > 10) {
								throw new ArithmeticException("Nhập điểm không đúng!");
							} else {
								gradeOfDay.setGradePossitive(gradePossitive);
							}

							arrGradeOfDay.add(gradeOfDay);
						}

						resultSubject.setGradeOfDay(arrGradeOfDay);
						resultSubject.setSubject(subject);
						resultSubject.setStudent(student);
						System.out.println("----------------------------------------");
						System.out.print("Nhập điểm lý thuyết: ");
						gradeTheory = Double.parseDouble(input.readLine());
						if (gradeTheory < 0 || gradeTheory > 10) {
							throw new ArithmeticException("Nhập điểm không đúng!");
						} else {
							resultSubject.setGradeTheory(gradeTheory);
						}
						System.out.print("Nhập điểm thực hành: ");
						gradePractice = Double.parseDouble(input.readLine());
						if (gradePractice < 0 || gradePractice > 10) {
							throw new ArithmeticException("Nhập điểm không đúng!");
						} else {
							resultSubject.setGradePractice(gradePractice);
						}
						arrResultSubject.add(resultSubject);
					}
					ResultStudy resultStudy = new ResultStudy(arrResultSubject, student);
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("Kết quả học tập của học viên: ");
					for (Student st : class1.getM_Student()) {
						System.out.println(st.getName());
					}
					resultStudy.show();
				}
			} else if (typeClass == 2) {
				System.out.println("Danh sách các môn của lớp 2:");
				for (Subject subject : class2.getM_Subject()) {
					System.out.println("Môn: " + subject.getName());
					System.out.println("Số ngày học: " + subject.calcDistanceDay());
					System.out.println("----------------------------------------");
				}
				System.out.println("Danh sách các học viên lớp 2:");
				for (Student student : class2.getM_Student()) {
					System.out.println(student.getName());
				}
				ResultStudy resultStudy = new ResultStudy();
				for (Student student : class2.getM_Student()) {
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("Nhập điểm cho học viên: " + student.getName());
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
					for (Subject subject : class2.getM_Subject()) {
						ResultSubject resultSubject = new ResultSubject();
						System.out.println("----------------------------------------");
						System.out.println("Môn: " + subject.getName());
						countDay = subject.calcDistanceDay();
						System.out.println("----------------------------------------");
						ArrayList<GradeOfDay> arrGradeOfDay = new ArrayList<>();
						for (int i = 1; i <= countDay; i++) {
							System.out.println("Ngày thứ " + i);
							GradeOfDay gradeOfDay = new GradeOfDay();
							System.out.println("----------------------------------------");
							System.out.println("Điểm danh: ");
							System.out.println("Đi học: 10 điểm, Nghỉ học: 0 điểm, Đi trễ: 5 điểm, Về sớm: 5 điểm");
							System.out.println("----------------------------------------");
							System.out.print("Nhập điểm chuyên cần điểm danh buổi sáng: ");
							gradeMorning = Double.parseDouble(input.readLine());
							if (gradeMorning < 0 || gradeMorning > 10)
								throw new ArithmeticException("Nhập điểm không đúng!");
							System.out.print("Nhập điểm chuyên cần điểm danh buổi chiều: ");
							gradeAfternoon = Double.parseDouble(input.readLine());
							if (gradeAfternoon < 0 || gradeAfternoon > 10)
								throw new ArithmeticException("Nhập điểm không đúng!");
							gradeDiligence = gradeOfDay.calcGradeDeligence(gradeMorning, gradeAfternoon);
							if (gradeDiligence >= 0 && gradeDiligence <= 10) {
								gradeOfDay.setGradeDiligence(gradeDiligence);
							}
							System.out.print("Nhập điểm bài tập: ");
							gradeExercise = Double.parseDouble(input.readLine());
							gradeOfDay.setGradeExam(gradeExercise);
							if (gradeExercise < 0 || gradeExercise > 10) {
								throw new ArithmeticException("Nhập điểm không đúng!");
							} else {
								gradeOfDay.setGradeExam(gradeExercise);
							}
							System.out.print("Nhập điểm tích cực: ");
							gradePossitive = Double.parseDouble(input.readLine());
							System.out.println("----------------------------------------");
							if (gradePossitive < 0 || gradePossitive > 10) {
								throw new ArithmeticException("Nhập điểm không đúng!");
							} else {
								gradeOfDay.setGradePossitive(gradePossitive);
							}

							arrGradeOfDay.add(gradeOfDay);
						}

						resultSubject.setGradeOfDay(arrGradeOfDay);
						resultSubject.setSubject(subject);
						System.out.println("----------------------------------------");
						System.out.print("Nhập điểm lý thuyết: ");
						gradeTheory = Double.parseDouble(input.readLine());
						if (gradeTheory < 0 || gradeTheory > 10) {
							throw new ArithmeticException("Nhập điểm không đúng!");
						} else {
							resultSubject.setGradeTheory(gradeTheory);
						}
						System.out.print("Nhập điểm thực hành: ");
						gradePractice = Double.parseDouble(input.readLine());
						System.out.println("----------------------------------------");
						if (gradePractice < 0 || gradePractice > 10) {
							throw new ArithmeticException("Nhập điểm không đúng!");
						} else {
							resultSubject.setGradePractice(gradePractice);
						}
						arrResultSubject.add(resultSubject);
					}
					resultStudy.setStudent(student);
					resultStudy.setArrResultSubject(arrResultSubject);
				}
				
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Kết quả học tập của học viên: ");
				for (Student st : class2.getM_Student()) {
					System.out.println(st.getName());
				}
				resultStudy.show();
			} else {
				throw new ArithmeticException("Chọn lớp không đúng!");
			}

		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("error: " + ex.getMessage());
		}

	}
}
