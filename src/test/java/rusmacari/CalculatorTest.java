package rusmacari;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for Calculator class.
 */
public class CalculatorTest {
	
	private Calculator calc;
	
	public CalculatorTest() {
		calc = new Calculator(10, 5);
	}

	@Test
	public void calcFivePlusSix() {
		calc.plus();
		assertResult(15);
	}
	
	private void assertResult(int expected) {
		assertEquals(expected, calc.getResult());
	}

	@Test
	public void diffNineMinus3() {
		calc.diff();
		assertResult(5);
	}
	
	@Test
	public void testMultiply() {
		calc.multiply();
		assertResult(50);
	}
	
	@Test
	public void testDivide() {
		calc.divide();
		assertEquals(2.0, calc.getResultDiv(), 0.001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divideRuntimeException() {
		calc.setArgs(10, 0);
		calc.divide();
	}
}
