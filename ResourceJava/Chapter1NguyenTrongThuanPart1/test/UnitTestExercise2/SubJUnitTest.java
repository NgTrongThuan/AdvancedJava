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
public class SubJUnitTest {

    public SubJUnitTest() {
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
     * Unit test for operator -
     * Output: compare actual and expected
     */
    public Calculator cal = new Calculator();
    
    @Test
    public void testSub1() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(2);
        double ex = -1;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub2() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(1);
        double ex = 0;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub3() {
        cal.setFirstNumber(2);
        cal.setSecondNumber(2);
        double ex = 0;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub4() {
        cal.setFirstNumber(-1);
        cal.setSecondNumber(2);
        double ex = -3;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub5() {
        cal.setFirstNumber(-10);
        cal.setSecondNumber(2);
        double ex = -12;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub6() {
        cal.setFirstNumber(9);
        cal.setSecondNumber(2);
        double ex = 7;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub7() {
        cal.setFirstNumber(3);
        cal.setSecondNumber(1);
        double ex = 2;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub8() {
        cal.setFirstNumber(6);
        cal.setSecondNumber(2);
        double ex = 4;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub9() {
        cal.setFirstNumber(5);
        cal.setSecondNumber(2);
        double ex = 3;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSub10() {
        cal.setFirstNumber(-6);
        cal.setSecondNumber(2);
        double ex = -8;
        double ac = cal.calculateSubtraction();
        assertEquals(ex, ac, 0);
    }
}
