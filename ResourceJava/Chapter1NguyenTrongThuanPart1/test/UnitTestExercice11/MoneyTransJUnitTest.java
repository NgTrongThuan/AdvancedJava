/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercice11;

import Excercise11.MoneyTransaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen  Trong Thuan
 * date: 22/08/2016
 * @version 1.0
 * ---------------------------
 * Unit test for money transaction
 */
public class MoneyTransJUnitTest {
    
    public MoneyTransJUnitTest() {
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
     * declare class money transaction
     */
    MoneyTransaction money = new MoneyTransaction();
    
    @Test
    public void testCalcMoney1(){
        money.setQuality(1);
        money.setTypeTransaction(1);
        double ex = 22000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney2(){
        money.setQuality(2);
        money.setTypeTransaction(1);
        double ex = 44000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney3(){
        money.setQuality(3);
        money.setTypeTransaction(1);
        double ex = 66000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney4(){
        money.setQuality(4);
        money.setTypeTransaction(1);
        double ex = 88000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney5(){
        money.setQuality(5);
        money.setTypeTransaction(1);
        double ex = 110000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney6(){
        money.setQuality(6);
        money.setTypeTransaction(1);
        double ex = 132000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney7(){
        money.setQuality(7);
        money.setTypeTransaction(1);
        double ex = 154000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney8(){
        money.setQuality(8);
        money.setTypeTransaction(1);
        double ex = 176000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney9(){
        money.setQuality(9);
        money.setTypeTransaction(1);
        double ex = 198000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney10(){
        money.setQuality(10);
        money.setTypeTransaction(1);
        double ex = 220000;
        double ac = money.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
}
