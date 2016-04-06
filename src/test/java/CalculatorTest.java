import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator calcTest;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Before
	public void before() {
		calcTest = new Calculator();
		System.out.println("Before");
	}
	
	@Test
	public void testAdditionMethod1() {
		assertEquals("", 6.4, calcTest.addition(4.2, 2.2), 0);
		System.out.println("This is the first test");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
}
