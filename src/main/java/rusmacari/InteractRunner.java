package rusmacari;

import java.util.Scanner;

public class InteractRunner {
	
	private boolean running = true;
	Scanner scanner;
	
	public InteractRunner(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public static void main(String[] args) {
		InteractRunner runner = new InteractRunner(new Scanner(System.in));
		runner.run();
	}
	
	public void run() {
		while(running) {
			System.out.println("Calculation...");
			calc();
		}
		System.out.println("Exit...");
		scanner.close();
	}
	
	private void calc() {
		System.out.println("Enter first arg:");
		int first = scanner.nextInt();
		System.out.println("Enter second arg:");
		int second = scanner.nextInt();
		Calculator calc = new Calculator(first, second);
		calc.plus();
		System.out.println("plus result: " + calc.getResult());
		calc.diff();
		System.out.println("diff result: " + calc.getResult());
		calc.multiply();
		System.out.println("multiply result: " + calc.getResult());
		calc.divide();
		System.out.println("divide result: " + calc.getResultDiv());
		System.out.println("Exit?(y/n)");
		running = (scanner.next().equals("n"));
	}
	
}
