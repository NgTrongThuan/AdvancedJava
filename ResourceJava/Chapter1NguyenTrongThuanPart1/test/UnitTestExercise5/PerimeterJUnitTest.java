/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise5;

import Exercise3.Point;
import Exercise5.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 * -----------------------------
 * Unit test for perimeter of rectangle
 * Output: compare value actual and expected
 */
public class PerimeterJUnitTest {
    
    public PerimeterJUnitTest() {
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
     * declare Point A and C
     */
    Point pointA = new Point();
    Point pointC = new Point();
    
    /**
     * declare Rectangle
     */
    
    Rectangle rec = new Rectangle();
    
    @Test
    public void testPerimeter1(){
        pointA.setX(x);
        pointA.setY(y);
        pointC.setX(x);
        pointC.setY(y);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex =
    }
}
