import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// First Test Runner
		Result result = JUnitCore.runClasses(JunitTestSuite.class);

		for (Failure failure : result.getFailures()) {

			System.out.println(failure.toString());

		}
		System.out.println();
		System.out.println("Were all test successful? " + result.wasSuccessful());
		System.out.println("Number of test ran " + result.getRunCount());
		System.out.println("Number of test failed " + result.getFailureCount());
		System.out.println("The number of tests ignored during the run " + result.getIgnoreCount());
		System.out.println("The number of  milliseconds it took to run the suite " + result.getRunTime());

		// second Test Runner
		System.out.println();
		System.out.println("This is the second Test runner #2");
		System.out.println();
		Result result2 = JUnitCore.runClasses(testUnit4.class);

		for (Failure failure : result2.getFailures()) {

			System.out.println(failure.toString());
		}
		System.out.println();
		System.out.println("Were all test successful? " + result2.wasSuccessful());
		System.out.println("Number of test ran " + result2.getRunCount());
		System.out.println("Number of test failed " + result2.getFailureCount());
		System.out.println("The number of tests ignored during the run " + result.getIgnoreCount());
		System.out.println("The number of milliseconds it took to run the suite " + result.getRunTime());
	}

}
