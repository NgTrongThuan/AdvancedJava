package UnitTestEx19;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex19.DetailOrder;
import Ex19.Item;

/**
 * @author Nguyen Trong Thuan
 * date: 29/08/2016
 * version : 1.0
 * -------------------------
 * create unit test for calculate money 
 */
public class UnitTestCalcMoney {

	Item item = new Item();
	DetailOrder detail = new DetailOrder();
	@Test
	public void test1() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(1);
		double expected = 10000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test2() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(2);
		double expected = 20000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test3() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(3);
		double expected = 30000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test4() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(4);
		double expected = 40000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test5() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(5);
		double expected = 50000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test6() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(6);
		double expected = 60000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test7() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(7);
		double expected = 70000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test8() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(8);
		double expected = 80000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test9() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(9);
		double expected = 90000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test10() {
		item.setName("test");
		item.setPrice(10000);
		detail.setM_Item(item);
		detail.setAmount(10);
		double expected = 100000;
		double actual = detail.calMoney();
		assertEquals(expected, actual, 0);
	}

}
