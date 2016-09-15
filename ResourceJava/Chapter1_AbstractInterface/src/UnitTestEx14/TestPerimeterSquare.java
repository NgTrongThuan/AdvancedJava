/**
 * Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * ----------------------
 * unit test for perimeter of square
 */
package UnitTestEx14;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise_14.Square;

public class TestPerimeterSquare {

	/**
	 * declare object square
	 */
	Square square = new Square();
	
	@Test
	public void test1() {
		square.setEdge(1);
		double expected = 4;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test2() {
		square.setEdge(2);
		double expected = 8;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test3() {
		square.setEdge(3);
		double expected = 12;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test4() {
		square.setEdge(4);
		double expected = 16;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test5() {
		square.setEdge(5);
		double expected = 20;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test6() {
		square.setEdge(6);
		double expected = 24;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test7() {
		square.setEdge(7);
		double expected = 28;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test8() {
		square.setEdge(8);
		double expected = 32;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test9() {
		square.setEdge(9);
		double expected = 36;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test10() {
		square.setEdge(10);
		double expected = 40;
		double actual = square.perimeter();
		assertEquals(expected, actual, 0);
	}

}
