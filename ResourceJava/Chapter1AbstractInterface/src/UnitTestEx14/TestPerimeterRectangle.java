/**
 * Nguyen Trong Thuan
 * date: 23/08/2016
 * version : 1.0
 * -------------------
 * unit test perimeter for rectangle
 */
package UnitTestEx14;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise_14.Rectangle;

public class TestPerimeterRectangle {

	/**
	 * declare object rectangle
	 */
	Rectangle rec = new Rectangle();

	@Test
	public void test1() {
		rec.setHeight(1);
		rec.setWidth(1);
		double ex = 4;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		rec.setHeight(1);
		rec.setWidth(2);
		double ex = 6;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {
		rec.setHeight(2);
		rec.setWidth(1);
		double ex = 6;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test4() {
		rec.setHeight(1);
		rec.setWidth(1);
		double ex = 4;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test5() {
		rec.setHeight(2);
		rec.setWidth(2);
		double ex = 8;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test6() {
		rec.setHeight(3);
		rec.setWidth(1);
		double ex = 8;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		rec.setHeight(1);
		rec.setWidth(3);
		double ex = 8;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test8() {
		rec.setHeight(1);
		rec.setWidth(1);
		double ex = 4;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test9() {
		rec.setHeight(3);
		rec.setWidth(4);
		double ex = 14;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test10() {
		rec.setHeight(4);
		rec.setWidth(1);
		double ex = 10;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}

}
