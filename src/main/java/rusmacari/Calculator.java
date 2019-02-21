package rusmacari;

/**
 * Calculator class
 *
 */
public class Calculator {

	public static int calc(int first, int second) {
		return first + second;
	}

	public static int diff(int first, int second) {
		return first - second;
	}

	public static int multiply(int first, int second) {
		return first * second;
	}

	public static Object divide(int first, int second) {
		if (second == 0) {
			throw new IllegalArgumentException("second argument must not be 0"); 
		}
		return first / second;
	}
	
}
