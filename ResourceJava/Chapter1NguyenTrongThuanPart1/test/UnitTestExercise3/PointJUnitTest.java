/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Exercise3.Point;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 */
public class PointJUnitTest {
    
    public PointJUnitTest() {
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
     * Declare 2 Point A and B
     */
    public Point A = new Point();
    public Point B = new Point();
    
    /**
     * Unit test for function findDistanceFomular
     * Output: compare actual and expected
     */
    @Test
    public void testPoint1() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(1);
        double ex = 1;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint2() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(2);
        double ex = 2;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint3() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(3);
        double ex = 3;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint4() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(4);
        double ex = 4;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint5() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(5);
        double ex = 5;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint6() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(6);
        double ex = 6;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint7() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(7);
        double ex = 7;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint8() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(8);
        double ex = 8;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint9() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(9);
        double ex = 9;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPoint10() {
        A.setX(0);
        A.setY(0);
        B.setX(0);
        B.setY(10);
        double ex = 10;
        double ac = A.findDistanceFormula(B);
        assertEquals(ex, ac, 0);
    }
}
