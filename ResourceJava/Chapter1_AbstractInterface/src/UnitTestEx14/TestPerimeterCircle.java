/**
 * @author Nguyen Trong Thuan
 * date: 23/08/2016
 * @version : 1.0
 * --------------------------
 * Unit test for perimeter circle
 */
package UnitTestEx14;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise_14.Circle;

public class TestPerimeterCircle {

	/**
	 * declare object circle
	 */
	Circle c = new Circle();
	
	@Test
	public void test1() {
		c.setR(1);
		double ex = 6.283185307179586;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() {
		c.setR(2);
		double ex = 12.566370614359172;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		c.setR(3);
		double ex = 18.84955592153876;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		c.setR(4);
		double ex = 25.132741228718345;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		c.setR(5);
		double ex = 31.41592653589793;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		c.setR(6);
		double ex = 37.69911184307752;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() {
		c.setR(7);
		double ex = 43.982297150257104;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		c.setR(8);
		double ex = 50.26548245743669;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		c.setR(9);
		double ex = 56.548667764616276;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		c.setR(10);
		double ex = 62.83185307179586;
		double ac = c.perimeter();
		assertEquals(ex, ac, 0);
	}
}
