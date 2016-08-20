/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise6;

import Exercise6.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 20/8/2016
 * @version 1
 * Unit test for function calculate salary of employee
 * Output: compare expected value and actual value
 */
public class SalaryNetJUnitTest {
    
    public SalaryNetJUnitTest() {
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
     * Declare employee
     */
    Employee emp = new Employee();
    
    @Test
    public void testSalary1(){
        emp.setPayRate(2);
        emp.setNumOfPeople(1);
        emp.setFringeBenefits(100000000);
        double ex = 80898000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary2(){
        emp.setPayRate(2);
        emp.setNumOfPeople(2);
        emp.setFringeBenefits(100000000);
        double ex = 82158000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary3(){
        emp.setPayRate(2);
        emp.setNumOfPeople(3);
        emp.setFringeBenefits(100000000);
        double ex = 83418000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary4(){
        emp.setPayRate(2);
        emp.setNumOfPeople(4);
        emp.setFringeBenefits(100000000);
        double ex = 84634000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary5(){
        emp.setPayRate(2);
        emp.setNumOfPeople(5);
        emp.setFringeBenefits(100000000);
        double ex = 85714000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary6(){
        emp.setPayRate(2);
        emp.setNumOfPeople(6);
        emp.setFringeBenefits(100000000);
        double ex = 86794000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary7(){
        emp.setPayRate(2);
        emp.setNumOfPeople(7);
        emp.setFringeBenefits(100000000);
        double ex = 87874000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary8(){
        emp.setPayRate(2);
        emp.setNumOfPeople(8);
        emp.setFringeBenefits(100000000);
        double ex = 88954000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary9(){
        emp.setPayRate(2);
        emp.setNumOfPeople(9);
        emp.setFringeBenefits(100000000);
        double ex = 90034000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
    @Test
    public void testSalary10(){
        emp.setPayRate(2);
        emp.setNumOfPeople(10);
        emp.setFringeBenefits(100000000);
        double ex = 91114000;
        double ac = emp.calculateNetSalary();
        assertEquals(ex, ac, ex);
    }
    
}
