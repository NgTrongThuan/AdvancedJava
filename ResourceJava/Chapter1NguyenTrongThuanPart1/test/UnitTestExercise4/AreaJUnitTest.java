/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise4;

import Exercise3.Point;
import Exercise4.Circle;
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
 * @version 
 * ------------------------------
 * Unit test for find perimeter of circle
 * output: compare actual and expected value
 */
public class AreaJUnitTest {
    
    public AreaJUnitTest() {
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
    public void testArea1() {
        O.setX(0);
        O.setY(0);
        R.setX(0);
        R.setY(1);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea2() {
        O.setX(0);
        O.setY(0);
        R.setX(1);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea3() {
        O.setX(0);
        O.setY(1);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea4() {
        O.setX(1);
        O.setY(0);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea5() {
        O.setX(-1);
        O.setY(0);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea6() {
        O.setX(0);
        O.setY(-1);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea7() {
        O.setX(0);
        O.setY(0);
        R.setX(-1);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea8() {
        O.setX(0);
        O.setY(0);
        R.setX(0);
        R.setY(-1);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 3.14;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea9() {
        O.setX(2);
        O.setY(0);
        R.setX(0);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 12.56;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea10() {
        O.setX(0);
        O.setY(0);
        R.setX(2);
        R.setY(0);
        C.setPointO(O);
        C.setPointR(R);
        double ex = 12.56;
        double ac = C.calculateArea();
        assertEquals(ex, ac, 0);
    }
}
