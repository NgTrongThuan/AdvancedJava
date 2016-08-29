package UnitTestEx19;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTest {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		for (Failure failre : result.getFailures()) {
			System.out.println(failre.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
