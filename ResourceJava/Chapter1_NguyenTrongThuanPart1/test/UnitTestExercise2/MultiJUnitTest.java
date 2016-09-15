package UnitTestExercise2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Exercise2.Calculator;

/**
 *
 * @author Win7-64 SP1
 */
public class MultiJUnitTest {

    public MultiJUnitTest() {
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
     * Unit test for Operator *
     * Output: compare actual and expected
     */
    public Calculator cal = new Calculator();
    
    @Test
    public void testMulti1() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(2);
        double ex = 2;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti2() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(1);
        double ex = 1;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti3() {
        cal.setFirstNumber(2);
        cal.setSecondNumber(2);
        double ex = 4;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti4() {
        cal.setFirstNumber(-1);
        cal.setSecondNumber(2);
        double ex = -2;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti5() {
        cal.setFirstNumber(-10);
        cal.setSecondNumber(2);
        double ex = -20;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti6() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(7);
        double ex = 7;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti7() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(12);
        double ex = 12;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti8() {
        cal.setFirstNumber(2);
        cal.setSecondNumber(20);
        double ex = 40;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti9() {
        cal.setFirstNumber(-1);
        cal.setSecondNumber(21);
        double ex = -21;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testMulti10() {
        cal.setFirstNumber(-10);
        cal.setSecondNumber(2);
        double ex = -20;
        double ac = cal.calculateMultiplication();
        assertEquals(ex, ac, 0);
    }
}
