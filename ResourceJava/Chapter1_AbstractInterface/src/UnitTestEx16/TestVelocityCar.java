/**
 * @author Nguyen Trong Thuan
 * date: 23/28/2016
 * Version : 1.0
 * -----------------------------
 * Unit test for caculate Velocity car
 */
package UnitTestEx16;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise_16.Car;

public class TestVelocityCar {

	/**
	 * declare object car
	 */
	Car car = new Car();
	
	@Test
	public void test1() {
		car.distance = 1;
		car.time = 1;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test2() {
		car.distance = 2;
		car.time = 2;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test3() {
		car.distance = 3;
		car.time = 3;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test4() {
		car.distance = 4;
		car.time = 4;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test5() {
		car.distance = 5;
		car.time = 5;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test6() {
		car.distance = 6;
		car.time = 6;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test7() {
		car.distance = 7;
		car.time = 7;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test8() {
		car.distance = 8;
		car.time = 8;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test9() {
		car.distance = 9;
		car.time = 9;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test10() {
		car.distance = 10;
		car.time = 10;
		double expected = 1;
		double actual = car.calculateVelocity();
		assertEquals(expected, actual, 0);
	}

}
