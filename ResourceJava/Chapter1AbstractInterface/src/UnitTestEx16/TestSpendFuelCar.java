/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * Version: 1.0
 * -----------------------
 * unit test for calculate fuel spend of car
 */
package UnitTestEx16;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise_16.Car;

public class TestSpendFuelCar {

	/**
	 * declare object car
	 */
	Car car = new Car();
	
	@Test
	public void test1() {
		car.literFuel = 1;
		car.distance = 1;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test2() {
		car.literFuel = 2;
		car.distance = 2;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test3() {
		car.literFuel = 3;
		car.distance = 3;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test4() {
		car.literFuel = 4;
		car.distance = 4;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test5() {
		car.literFuel = 5;
		car.distance = 5;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test6() {
		car.literFuel = 6;
		car.distance = 6;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void test7() {
		car.literFuel = 7;
		car.distance = 7;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test8() {
		car.literFuel = 8;
		car.distance = 8;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test9() {
		car.literFuel = 9;
		car.distance = 9;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test10() {
		car.literFuel = 10;
		car.distance = 10;
		double expected = 1;
		double actual = car.calcSpendFuel();
		assertEquals(expected, actual, 0);
	}
}

