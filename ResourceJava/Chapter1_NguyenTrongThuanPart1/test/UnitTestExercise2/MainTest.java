package UnitTestExercise2;


import UnitTestExercise1.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7-64 SP1
 */
public class MainTest {

    /**
     * Main method to run operator
     * Input: AddTestSuite class
     * Output: Result of failure
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    
}
