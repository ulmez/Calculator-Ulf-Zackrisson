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
		//System.out.println("BeforeClass");
	}
	
	@Before
	public void before() {
		calcTest = new Calculator();
		//System.out.println("Before");
	}
	
	// **************************************************
	// Test of method addition **************************
	@Test
	public void testAdditionMethod1() {
		assertEquals("Unexpected calculation of additionMethod1", 6.4, calcTest.addition(4.2, 2.2), 0);
	}
	
	@Test
	public void testAdditionMethod2() {
		assertEquals("Unexpected calculation of additionMethod2", 10.4, calcTest.addition(-2.4, 12.8), 0);
	}
	
	@Test
	public void testAdditionMethod3() {
		assertEquals("Unexpected calculation of additionMethod3", 244.6, calcTest.addition(56, 188.6), 0);
	}
	// **************************************************
	
	// **************************************************
	// Test of method subtraction ***********************
	@Test
	public void testSubtractionMethod1() {
		assertEquals("Unexpected calculation of subtractionMethod1", 2.0, calcTest.subtraction(4.2, 2.2), 0);
	}
	
	@Test
	public void testSubtractionMethod2() {
		assertEquals("Unexpected calculation of subtractionMethod2", -14.4, calcTest.subtraction(-2.4, 12), 0);
	}
	
	@Test
	public void testSubtractionMethod3() {
		assertEquals("Unexpected calculation of subtractionMethod3", -132.6, calcTest.subtraction(56, 188.6), 0);
	}
	// **************************************************
	
	// **************************************************
	// Test of method multiplication ********************
	@Test
	public void testMultiplicationMethod1() {
		assertEquals("Unexpected calculation of multiplicationMethod1", 12.0, calcTest.multiplication(4, 3), 0);
	}
	
	@Test
	public void testMultiplicationMethod2() {
		assertEquals("Unexpected calculation of multiplicationMethod2", -24.0, calcTest.multiplication(-2, 12), 0);
	}
	
	@Test
	public void testMultiplicationMethod3() {
		assertEquals("Unexpected calculation of multiplicationMethod3", 10561.6, calcTest.multiplication(56, 188.6), 0);
	}
	// **************************************************
	
	// **************************************************
	// Test of method division **************************
	@Test
	public void testDivisionMethod1() {
		assertEquals("Unexpected calculation of divisionMethod1", 2.0, calcTest.division(4, 2), 0);
	}
	
	@Test
	public void testDivisionMethod2() {
		assertEquals("Unexpected calculation of divisionMethod2", -4.0, calcTest.division(-8, 2), 0);
	}
	
	@Test
	public void testDivisionMethod3() {
		assertEquals("Unexpected calculation of divisionMethod3", 8.0, calcTest.division(24, 3), 0);
	}
	// **************************************************
	
	@After
	public void after() {
		//System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		//System.out.println("AfterClass");
	}
}
