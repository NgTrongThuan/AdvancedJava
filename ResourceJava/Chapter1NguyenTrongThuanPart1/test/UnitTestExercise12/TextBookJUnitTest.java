/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise12;

import Exercise12.TextBook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 * @version 1.0
 * --------------------------
 * Unit test for text book 
 */
public class TextBookJUnitTest {
    
    public TextBookJUnitTest() {
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
     * declare class textbook
     */
    TextBook text = new TextBook();
    
    @Test 
    public void testCalcMoney1(){
        text.setAmount(1);
        text.setPrice(10000);
        text.setState(1);
        double ex = 10000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney2(){
        text.setAmount(2);
        text.setPrice(10000);
        text.setState(1);
        double ex = 20000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney3(){
        text.setAmount(3);
        text.setPrice(10000);
        text.setState(1);
        double ex = 30000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney4(){
        text.setAmount(4);
        text.setPrice(10000);
        text.setState(1);
        double ex = 40000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney5(){
        text.setAmount(5);
        text.setPrice(10000);
        text.setState(1);
        double ex = 50000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney6(){
        text.setAmount(6);
        text.setPrice(10000);
        text.setState(1);
        double ex = 60000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney7(){
        text.setAmount(7);
        text.setPrice(10000);
        text.setState(1);
        double ex = 70000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney8(){
        text.setAmount(8);
        text.setPrice(10000);
        text.setState(1);
        double ex = 80000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney9(){
        text.setAmount(9);
        text.setPrice(10000);
        text.setState(1);
        double ex = 90000;
        double ac = text.calculateMoney();
    }
    
    @Test 
    public void testCalcMoney10(){
        text.setAmount(10);
        text.setPrice(10000);
        text.setState(1);
        double ex = 100000;
        double ac = text.calculateMoney();
    }
}
