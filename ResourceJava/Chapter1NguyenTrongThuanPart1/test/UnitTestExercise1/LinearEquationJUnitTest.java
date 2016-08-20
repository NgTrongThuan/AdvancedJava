package UnitTestExercise1;

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
import Exercise1.LinearEquation;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 */
public class LinearEquationJUnitTest {

    public LinearEquationJUnitTest() {
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
     * Declare LinearEquation
     */
    public LinearEquation le = new LinearEquation();
    /*
    UnitTest for LinearEquation function
    Input: actual is root LinearEquation, expected
    Output: compare actual and expected
    */
    
    @Test
    public void testLinearEquation1() {
        le.setA(1);
        le.setB(1);
        double ex = -1;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation2() {
        le.setA(3);
        le.setB(3);
        double ex = -1;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation3() {
        le.setA(1);
        le.setB(0);
        double ex = 0;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation4() {
        le.setA(0);
        le.setB(0);
        double ex = Double.MAX_VALUE;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation5() {
        le.setA(0);
        le.setB(1);
        double ex = Double.MIN_VALUE;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation6() {
        le.setA(1);
        le.setB(2);
        double ex = -2;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation7() {
        le.setA(3);
        le.setB(6);
        double ex = -2;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation8() {
        le.setA(1);
        le.setB(-6);
        double ex = 6;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation9() {
        le.setA(5);
        le.setB(5);
        double ex = -1;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testLinearEquation10() {
        le.setA(8);
        le.setB(16);
        double ex = -2;
        double ac = le.calculateRoot();
        assertEquals(ex, ac, 0);
    }
}
