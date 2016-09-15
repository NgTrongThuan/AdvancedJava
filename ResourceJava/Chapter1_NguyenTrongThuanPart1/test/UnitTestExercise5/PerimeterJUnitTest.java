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
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 8;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter2(){
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(5);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 10;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter3(){
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(4);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 10;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter5(){
        pointA.setX(2);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 6;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter6(){
        pointA.setX(4);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 6;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter7(){
        pointA.setX(0);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 10;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter8(){
        pointA.setX(1);
        pointA.setY(0);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 12;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter9(){
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(0);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 6;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testPerimeter10(){
        pointA.setX(0);
        pointA.setY(0);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 14;
        double ac = rec.calculatePerimeter();
        assertEquals(ex, ac, 0);
    }
}
