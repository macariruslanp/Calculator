package test.java.rusmacari;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main.java.rusmacari.Calculator;

/**
 * Unit test for Calculator class.
 */
public class CalculatorTest {
	@Test
	public void calcFivePlusSix() {
		assertEquals(Calculator.calc(5, 6), 11);
	}
}
