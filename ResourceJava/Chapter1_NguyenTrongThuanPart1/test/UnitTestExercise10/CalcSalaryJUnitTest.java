/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise10;

import Exercise10.Teacher;
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
 * @version : 1.0
 * ----------------------------
 * Unit test for calculate salary teacher
 */
public class CalcSalaryJUnitTest {
    
    public CalcSalaryJUnitTest() {
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
     * declare class teacher
     */
    Teacher teacher = new Teacher();
    
    @Test
    public void testCalcSalary1(){
        teacher.setRateSalary(1);
        teacher.setSubvention(1000000);
        double ex = 2260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary2(){
        teacher.setRateSalary(1);
        teacher.setSubvention(2000000);
        double ex = 3260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary3(){
        teacher.setRateSalary(1);
        teacher.setSubvention(3000000);
        double ex = 4260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary4(){
        teacher.setRateSalary(1);
        teacher.setSubvention(4000000);
        double ex = 5260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary5(){
        teacher.setRateSalary(1);
        teacher.setSubvention(5000000);
        double ex = 6260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary6(){
        teacher.setRateSalary(1);
        teacher.setSubvention(6000000);
        double ex = 7260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary8(){
        teacher.setRateSalary(1);
        teacher.setSubvention(8000000);
        double ex = 9260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary9(){
        teacher.setRateSalary(1);
        teacher.setSubvention(9000000);
        double ex = 10260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcSalary10(){
        teacher.setRateSalary(1);
        teacher.setSubvention(10000000);
        double ex = 11260000;
        double ac = teacher.calculateSalary();
        assertEquals(ex, ac, 0);
    }
}
