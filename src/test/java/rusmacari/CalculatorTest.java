package rusmacari;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for Calculator class.
 */
public class CalculatorTest {
	@Test
	public void calcFivePlusSix() {
		assertEquals(Calculator.calc(5, 6), 11);
	}
	
	@Test
	public void diffNineMinus3() {
		assertEquals(Calculator.diff(9, 3), 6);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(Calculator.multiply(2, 3), 6);
	}
	
	@Test
	public void testDivide() {
		assertEquals(Calculator.divide(10, 5), 2);
		try {
			Calculator.divide(10, 0);
			fail("IllegalArgumentException must be thrown");
		} catch (IllegalArgumentException e) {
			
		}
	}
}
