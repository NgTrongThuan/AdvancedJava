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
 * @date:19/08/2016
 * @version 1
 */
public class AddJUnitTest {

    public AddJUnitTest() {
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
     * UnitTest for  Operator +
     * Output: compare actual and expected
     */
    public Calculator cal = new Calculator();
    
    @Test
    public void testAdd1() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(2);
        double ex = 3;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd2() {
        cal.setFirstNumber(1);
        cal.setSecondNumber(1);
        double ex = 2;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd3() {
        cal.setFirstNumber(2);
        cal.setSecondNumber(2);
        double ex = 4;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd4() {
        cal.setFirstNumber(-1);
        cal.setSecondNumber(2);
        double ex = 1;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd5() {
        cal.setFirstNumber(-10);
        cal.setSecondNumber(2);
        double ex = -8;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd6() {
        cal.setFirstNumber(5);
        cal.setSecondNumber(2);
        double ex = 7;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd7() {
        cal.setFirstNumber(3);
        cal.setSecondNumber(1);
        double ex = 4;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd8() {
        cal.setFirstNumber(6);
        cal.setSecondNumber(2);
        double ex = 8;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd9() {
        cal.setFirstNumber(11);
        cal.setSecondNumber(2);
        double ex = 13;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testAdd10() {
        cal.setFirstNumber(-10);
        cal.setSecondNumber(-2);
        double ex = -12;
        double ac = cal.calculateAddition();
        assertEquals(ex, ac, 0);
    }
}
