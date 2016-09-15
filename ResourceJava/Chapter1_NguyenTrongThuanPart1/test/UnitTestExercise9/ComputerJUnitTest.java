/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise9;

import Exercise9.Computer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/08/2016
 * @version: 1.0
 * -------------------------
 * Unit test for calculate money computer
 */
public class ComputerJUnitTest {
    
    public ComputerJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Declare computer
     */
    Computer c = new Computer();
    
    @Test
    public void testCalcMoney1(){
        c.setPrice(10000);
        c.setQuantity(1);
        double ex = 10000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney2(){
        c.setPrice(10000);
        c.setQuantity(2);
        double ex = 20000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney3(){
        c.setPrice(10000);
        c.setQuantity(3);
        double ex = 30000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney4(){
        c.setPrice(10000);
        c.setQuantity(4);
        double ex = 40000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney5(){
        c.setPrice(10000);
        c.setQuantity(5);
        double ex = 50000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    @Test
    public void testCalcMoney6(){
        c.setPrice(10000);
        c.setQuantity(6);
        double ex = 60000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney7(){
        c.setPrice(10000);
        c.setQuantity(7);
        double ex = 70000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    @Test
    public void testCalcMoney8(){
        c.setPrice(10000);
        c.setQuantity(8);
        double ex = 80000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney9(){
        c.setPrice(10000);
        c.setQuantity(9);
        double ex = 90000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney10(){
        c.setPrice(10000);
        c.setQuantity(10);
        double ex = 100000;
        double ac = c.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    
}
