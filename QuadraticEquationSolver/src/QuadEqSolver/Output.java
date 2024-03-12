package QuadEqSolver;

import QuadEqSolver.ROOTFLAG.FLAG;

public class Output {
	
	public void output() {
		
		Roots r = new Roots();
		Input i = new Input();
		
		// -- prompts user to input 3 numbers
		i.promptInput();
		// -- determines the solution type (method calls for solvers depend on flag)
		r.setFlag(i.getA(), i.getB(), i.getC());
		
		FLAG f = r.getFlag();
		
		// -- output determined by flag type
		if (f == FLAG.INFINITE) {
			System.out.println("Infinite roots");
		}
		else if (f == FLAG.LINEAR) {
			System.out.println("One Linear Solution: ");
			System.out.println(r.getRRoot1());
		}
		else if (f == FLAG.NOSOL) {
			System.out.println("No solution");
			
		}
		else if (f == FLAG.TWOREAL) {
			System.out.println("Two Real Solutions: ");
			System.out.println(r.getRRoot1());
			System.out.println(r.getRRoot2());
		}
		else if (f == FLAG.ONEREAL) {
			System.out.println("One Real Solution: ");
			System.out.println(r.getRRoot1());
		}
		else if (f == FLAG.TWOCOMPLEX) {
			System.out.println("Two Complex Solutions");
			System.out.println(r.getCRoot1());
			System.out.println(r.getCRoot2());
		}
		
	}
	
	
}

