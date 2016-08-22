/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercice11;

import Excercise11.GoldTransaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1.0
 * ---------------------------
 * Unit test for gold transaction
 */
public class GoldTransJUnitTest {
    
    public GoldTransJUnitTest() {
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
     * declare class gold transaction
     */
    GoldTransaction gold = new GoldTransaction();
    @Test
    public void testCalcGold1(){
        gold.setQuality(1);
        double ex = 3500000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold2(){
        gold.setQuality(2);
        double ex = 7000000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold3(){
        gold.setQuality(3);
        double ex = 10500000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold4(){
        gold.setQuality(4);
        double ex = 14000000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold5(){
        gold.setQuality(5);
        double ex = 17500000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold6(){
        gold.setQuality(6);
        double ex = 21000000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold7(){
        gold.setQuality(7);
        double ex = 24500000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold8(){
        gold.setQuality(8);
        double ex = 28000000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold9(){
        gold.setQuality(9);
        double ex = 31500000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold10(){
        gold.setQuality(10);
        double ex = 35000000;
        double ac = gold.calculateGold(1);
        assertEquals(ex, ac, 0);
    }
}
