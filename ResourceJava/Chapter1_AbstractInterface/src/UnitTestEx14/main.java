package UnitTestEx14;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class main {
	 public static void main(String[] args) {
		org.junit.runner.Result result = JUnitCore.runClasses(Ex14TestsSuite.class);
		for(Failure failre : result.getFailures()){
			System.out.println(failre.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
