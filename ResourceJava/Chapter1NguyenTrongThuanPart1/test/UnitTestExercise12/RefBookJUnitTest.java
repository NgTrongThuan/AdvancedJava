/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise12;

import Exercise12.ReferenceBook;
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
 * --------------------------
 * Unit test for reference book
 */
public class RefBookJUnitTest {
    
    public RefBookJUnitTest() {
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
     * declare reference book
     */
    ReferenceBook ref = new ReferenceBook();
    
    @Test
    public void testCalcMoney1(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(1);
        double ex = 10100;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney2(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(2);
        double ex = 10200;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney3(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(3);
        double ex = 10300;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney4(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(4);
        double ex = 10400;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney5(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(5);
        double ex = 10500;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney6(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(6);
        double ex = 10600;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney7(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(7);
        double ex = 10700;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney8(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(8);
        double ex = 10800;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney9(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(9);
        double ex = 10900;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcMoney10(){
        ref.setAmount(1);
        ref.setPrice(10000);
        ref.setTax(10);
        double ex = 11000;
        double ac = ref.calculateMoney();
        assertEquals(ex, ac, 0);
    }
}
