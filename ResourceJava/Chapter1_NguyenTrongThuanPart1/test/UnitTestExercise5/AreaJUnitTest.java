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
 * @version  1
 * Unit test for function calculate area of rectangle
 * Output: compare actual value and expected value
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
     * declare Point A and C
     */
    Point pointA = new Point();
    Point pointC = new Point();
    
    /**
     * declare Rectangle
     */
    
    Rectangle rec = new Rectangle();
    
    @Test
    public void testArea1(){
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 4;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea2(){
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(5);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 6;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea3(){
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(4);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 6;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea5(){
        pointA.setX(2);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 2;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea6(){
        pointA.setX(4);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 2;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea7(){
        pointA.setX(0);
        pointA.setY(2);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 6;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea8(){
        pointA.setX(1);
        pointA.setY(0);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 8;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea9(){
        pointA.setX(1);
        pointA.setY(2);
        pointC.setX(0);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 2;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testArea10(){
        pointA.setX(0);
        pointA.setY(0);
        pointC.setX(3);
        pointC.setY(4);
        rec.setA(pointA);
        rec.setC(pointC);
        double ex = 12;
        double ac = rec.calculateArea();
        assertEquals(ex, ac, 0);
    }
}
