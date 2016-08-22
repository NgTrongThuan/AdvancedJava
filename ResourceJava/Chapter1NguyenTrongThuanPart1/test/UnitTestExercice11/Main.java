/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTestExercice11;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 22/08/2016
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MoneyTransJUnitTest.class);
        for(Failure failre : result.getFailures()){
            System.out.println(failre.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    
}
