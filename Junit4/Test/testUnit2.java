import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

public class testUnit2 extends TestCase {

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
	public void testAssertEqualsTest2() {
		this.setName("AssertEqualsTest2"); // Sets the name of a TestCase.
		String newName = this.getName();
		System.out.println("Updated Test Case Name = " + newName);
		String message = "Charizard";
		MessageUtil messageUtil = new MessageUtil(message);
		message = "Charmander";
		assertEquals(message, messageUtil.printMessage()); // Checks that two
															// primitives
															// objects are equa
	}

	@Test
	public void testAssertEqualsTest3() {
		String name = this.getName(); // Gets the name of a TestCase.
		System.out.println("Test Case Name = " + name);
		String message = "squirtle";
		MessageUtil messageUtil = new MessageUtil(message);
		message = "squirtle";
		assertEquals(message, messageUtil.printMessage()); // Checks that two
															// primitives
															// objects are equa
	}
}
