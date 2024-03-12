package QuadEqSolver;

import QuadEqSolver.ROOTFLAG.FLAG;

public class Roots {	
	
	SolveQuad q = new SolveQuad();

	
	private double Rroot1;
	private double Rroot2;
	
//	FLAG flag = FLAG.INFINITE;
	private FLAG flag;
	
	private ComplexNum Croot1;
	private ComplexNum Croot2;
	
//	Input i = new Input();
//	
//	double a = i.getA();
//	double b = i.getB();
//	double c = i.getC();

	// -- determines solution type based on input
	public void setFlag(double a, double b, double c) {

		if (equals(a, 0) == true) {
			
			if (equals(b, 0) == true) {
				
				if (equals(c, 0) == true) {
					// -- if a, b, and c are equal to 0 flag is INFINITE
					flag = FLAG.INFINITE;
					
				}
				else {
					// -- if a & b are 0 but c is not flag is NO SOLUTION
					flag = FLAG.NOSOL;
					
				}
					
			}
			else {
				// -- if a is 0 but b is not (c is unknown)
				// -- call linear solver method
				// --- flag is LINEAR
				Rroot1 = q.Linear(b, c);
				
				flag = FLAG.LINEAR;

			}
		
		}
		
		else {
			// -- if a does not equal 0 (b & c unknown) calculate the discriminant
			
			SolveQuad q = new SolveQuad();
			
			double d = q.discrim(a, b, c);
			
			// -- flag is TWOREAL if discriminant is greater than 0
			if (d > 0) {
				
				Rroot1 = q.realPlus(a, b, c);
				Rroot2 = q.realMinus(a, b, c);
//				type = 0;
				flag = FLAG.TWOREAL;
//				System.out.println("TWOREAL");
			}
			// -- flag is TWOCOMPLEX if discriminant is less than 0
			else if (d < 0) {
				
				Croot1 = q.complexPlus(a, b, c);
				Croot2 = q.complexMinus(a, b, c);
//				type = 2;
				flag = FLAG.TWOCOMPLEX;
//				System.out.println("TWOCOMPLEX");
			}
			// -- flag is ONEREAL if discriminant is equal to 0
			else if (equals(d, 0) == true) {
				
				Rroot1 = q.realPlus(a, b, c);
//				type = 1;
				flag = FLAG.ONEREAL;
//				System.out.println("ONEREAL");
			}
			
		}
	}
	
	// -- returns real root 1
	public double getRRoot1() {
		return Rroot1;
	}
	
	// -- returns real root 2
	public double getRRoot2() {
	
		return Rroot2;
	}
	
	// -- returns complex root 1
	public ComplexNum getCRoot1() {
		
		return Croot1;
	}
	
	// -- returns complex root 2
	public ComplexNum getCRoot2() {
		return Croot2;
	}
	
	
	// -- returns flag type
	public FLAG getFlag() {
		return flag;
	}
	
	
	
	// -- checks if two values are equal using |X| < 0.00001
	public boolean equals(double x, double y) {
		
		if (Math.abs(x - y) < 0.000001) {
			return true;
		}
		
		return false;
	}
	
}
