import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

public class TestJunit extends TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is the setUpClass");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is the tear Down AfterClass");
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
	public void testAssertEqualsTest() {
		// test getName
		String name = this.getName(); // Gets the name of a TestCase.
		System.out.println("Test Case Name = " + name);
		String message = "pickachu";
		MessageUtil messageUtil = new MessageUtil(message);
		message = "Raichu";
		assertEquals(message, messageUtil.printMessage()); // Checks that two
															// primitives
															// objects are
															// equal.

	}

	@Test
	public void testAssertNotNullTest() {
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		String message = "blastories";
		MessageUtil messageUtil = new MessageUtil(message);
		assertNotNull(messageUtil); // Checks that an object isn't null.

	}

	@Test
	public void testAssertNullTest() {
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		String message = "ghost";
		MessageUtil messageUtil = new MessageUtil(message);
		assertNull(messageUtil); // Checks that an object is null.

	}

	@Test
	public void testAssertFalseTest() {
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		int num = 5;

		assertFalse(num > 6); // Checks that a condition is false.

	}

	@Test
	public void testAssertTrueTest() {
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		int num = 5;

		assertTrue(num > 6); // Checks that a condition is true.

	}

}
