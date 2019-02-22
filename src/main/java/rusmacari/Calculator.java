package rusmacari;

/**
 * Calculator class
 *
 */
public class Calculator {

	int first, second;
	int result;
	double resultDiv;
	
	public Calculator() {
		super();
	}
	
	/**
	 * Calculator constructor with params init 
	 * @param first int param
	 * @param second int param
	 */
	
	public Calculator(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	public void setArgs(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public void plus() {
		result = first + second;
	}
	
	public int getResult() {
		return result;
	}

	public void diff() {
		result = first - second;
	}

	public void multiply() {
		result = first * second;
	}

	/**
	 * if field second is 0 then IllegalArgumentException is thrown
	 * the result is set to resultDiv
	 */
	public void divide() {
		if (second == 0) {
			throw new IllegalArgumentException("second argument must not be 0"); 
		}
		resultDiv = first / second;
	}

	public double getResultDiv() {
		return resultDiv;
	}
	
	
	
}
