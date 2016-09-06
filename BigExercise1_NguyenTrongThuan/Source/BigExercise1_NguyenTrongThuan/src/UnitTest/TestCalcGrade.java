package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import SourcePackage.GradeOfDay;
import SourcePackage.ResultSubject;

public class TestCalcGrade {

	GradeOfDay gradaOfDay = new GradeOfDay();

	@Test
	public void test1() {
		gradaOfDay.setGradeDiligence(0);
		gradaOfDay.setGradeExam(0);
		gradaOfDay.setGradePossitive(0);
		double expected = 0;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test2() {
		gradaOfDay.setGradeDiligence(1);
		gradaOfDay.setGradeExam(1);
		gradaOfDay.setGradePossitive(1);
		double expected = 1;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test3() {
		gradaOfDay.setGradeDiligence(2);
		gradaOfDay.setGradeExam(2);
		gradaOfDay.setGradePossitive(2);
		double expected = 2;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test4() {
		gradaOfDay.setGradeDiligence(3);
		gradaOfDay.setGradeExam(3);
		gradaOfDay.setGradePossitive(3);
		double expected = 3;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test5() {
		gradaOfDay.setGradeDiligence(4);
		gradaOfDay.setGradeExam(4);
		gradaOfDay.setGradePossitive(4);
		double expected = 4;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test6() {
		gradaOfDay.setGradeDiligence(5);
		gradaOfDay.setGradeExam(5);
		gradaOfDay.setGradePossitive(5);
		double expected = 5;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test7() {
		gradaOfDay.setGradeDiligence(6);
		gradaOfDay.setGradeExam(6);
		gradaOfDay.setGradePossitive(6);
		double expected = 6;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test8() {
		gradaOfDay.setGradeDiligence(7);
		gradaOfDay.setGradeExam(7);
		gradaOfDay.setGradePossitive(7);
		double expected = 7;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test9() {
		gradaOfDay.setGradeDiligence(8);
		gradaOfDay.setGradeExam(8);
		gradaOfDay.setGradePossitive(8);
		double expected = 8;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test10() {
		gradaOfDay.setGradeDiligence(9);
		gradaOfDay.setGradeExam(9);
		gradaOfDay.setGradePossitive(9);
		double expected = 9;
		double actual = gradaOfDay.calcGrade();
		assertEquals(expected, actual, 0);
	}

}
