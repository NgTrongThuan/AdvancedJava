package UnitTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class runTest {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}

}
