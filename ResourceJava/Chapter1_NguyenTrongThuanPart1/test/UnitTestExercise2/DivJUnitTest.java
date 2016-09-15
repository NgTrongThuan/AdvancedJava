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
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 */
public class DivJUnitTest {

    public DivJUnitTest() {
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
     * Unit test for Operator /
     * Output: compare actual and expected
     */
    public Calculator cal = new Calculator();
    
    @Test
    public void testDiv1() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(2);
        double ex = 0.5;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv2() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(1);
        double ex = 1;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv3() {
        cal.setFirstNumber(2);
        cal.setSecondNumber(2);
        double ex = 1;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv4() {
        cal.setFirstNumber(-1);
        cal.setSecondNumber(2);
        double ex = -0.5;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv5() {
        cal.setFirstNumber(-10);
        cal.setSecondNumber(2);
        double ex = -5;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv6() {
        cal.setFirstNumber(12);
        cal.setSecondNumber(2);
        double ex = 6;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv7() {
        cal.setFirstNumber(11);
        cal.setSecondNumber(1);
        double ex = 11;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv8() {
        cal.setFirstNumber(12);
        cal.setSecondNumber(2);
        double ex = 6;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv9() {
        cal.setFirstNumber(-10);
        cal.setSecondNumber(2);
        double ex = -5;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testDiv10() {
        cal.setFirstNumber(-18);
        cal.setSecondNumber(2);
        double ex = -9;
        double ac = cal.calculateDevision();
        assertEquals(ex, ac, 0);
    }
}
