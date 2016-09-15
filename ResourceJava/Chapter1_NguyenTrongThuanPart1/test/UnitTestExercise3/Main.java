/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercise3;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Nguyen Trong Thuan
 * @date 19/08/2016
 * @version 1
 */
public class Main {

    /**
     * Main method to run unit test
     * Output: failure of Result
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(LineTestSuite.class);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    
}
