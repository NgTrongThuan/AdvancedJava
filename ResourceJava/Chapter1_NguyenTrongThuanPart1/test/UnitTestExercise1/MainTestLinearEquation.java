package UnitTestExercise1;


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
 * @author Nguyen Trong Thuan
 * @date: 19/08/2016
 * @version : 1
 */
public class MainTestLinearEquation {

    /**
     * Main method to test Linear Equation
     * Input: LinearEquationTestSuite
     * Output: failure of result
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(LinearEquationTestSuite.class);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    
}
