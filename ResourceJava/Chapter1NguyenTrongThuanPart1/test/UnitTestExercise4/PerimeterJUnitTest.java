/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise4;

import Exercise3.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Exercise4.Circle;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version 1
 * ----------------------------------
 * Unit test for perimeter of circle
 * output: compare actual and expected
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
     * declare Point O and R
     */
    Point O = new Point();
    Point R = new Point();
    
    /**
     * declare circle C
     */ 
    Circle C = new Circle();
       
    @Test
    public void testPerimeter1() {
        O.setX(0);
        O.setY(0);
        R.setX(0);
        R.setY(1);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 6.28;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter2() {
        O.setX(0);
        O.setY(0);
        R.setX(1);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 6.28;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter3() {
        O.setX(0);
        O.setY(1);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 6.28;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter4() {
        O.setX(1);
        O.setY(0);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 6.28;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter5() {
        O.setX(2);
        O.setY(0);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 12.56;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter6() {
        O.setX(0);
        O.setY(2);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 12.56;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter7() {
        O.setX(0);
        O.setY(0);
        R.setX(2);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 12.56;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter8() {
        O.setX(0);
        O.setY(0);
        R.setX(0);
        R.setY(2);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 12.56;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter9() {
        O.setX(-1);
        O.setY(0);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 6.28;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter10() {
        O.setX(0);
        O.setY(0);
        R.setX(-1);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 6.28;
        double ac = C.findPerimeter();
        assertEquals(ex, ac, 0);
    }
}
