import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

public class testUnit4 extends TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is the setUpClass");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is the tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is the setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is the tearDown");
		System.out.println();
	}

	@Test
	// this test sorts an array and compares the excepted output to the actual
	// output
	public void testArraySort() {
		String name = this.getName(); // Gets the name of a TestCase.
		System.out.println("Test Case Name = " + name);
		int[] numbers = { 5, 6, 4, 2, 3, 1 };
		Arrays.sort(numbers);
		int[] expectedOutput = { 1, 2, 3, 4, 5, 6 };

		assertArrayEquals(expectedOutput, numbers);

	}

	@Test(expected = NullPointerException.class)
	// the test is expected to throw and exception
	public void testArraySortWithNullCondition() {
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		int[] numbers = null;
		Arrays.sort(numbers);

	}

	@Test(timeout = 40)
	// this method test performance to see how much time it takes to execute a
	// method
	// if not completed in this set time it will fail.
	public void testArraysSortPerformance() {
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		for (int i = 0; i < 1000000; i++) {
			int[] numbers = { i, i - 1, i + 1 };
			Arrays.sort(numbers);
		}

	}

}
