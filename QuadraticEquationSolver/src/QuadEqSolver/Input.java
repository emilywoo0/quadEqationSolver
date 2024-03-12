package QuadEqSolver;

import java.util.Scanner;

public class Input {
	
	Scanner input = new Scanner(System.in);
	
	private double a;
	private double b;
	private double c;
	
	public Input() {
	}
	
	// -- prompts user to input 3 numbers
	public void promptInput() {
		
		// -- prompt user for coefficients a, b, and c
		System.out.println("Enter 3 values");
		
		try {
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
		}
		// -- if a, b, or c is not a number
		catch(Exception e) {
			
			System.out.println("INPUT MUST BE NUMERIC ");
			System.exit(0);
		}
		

	}
	
	// -- getters
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	
	
}
