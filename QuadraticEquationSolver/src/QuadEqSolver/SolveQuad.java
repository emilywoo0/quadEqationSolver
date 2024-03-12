package QuadEqSolver;

public class SolveQuad {
	
	// -- calculates discriminant ( b^2 - 4ac )
	public double discrim(double a, double b, double c) {
	 
		double d = ( Math.pow(b, 2) ) - (4 * a * c);
		
		return d;

	}
	
	// -- calculates a one real root using positive form( (- b + (b^2 - 4 ac)^-2) / 2a )
	public double realPlus(double a, double b, double c) {
		
		double d0 = discrim(a, b, c);
		double rroot = ( (b * -1) + Math.sqrt(d0) )/ (2 * a);
		
		return rroot;
		
	}
	
	// -- calculates a one real root using negative form ( (- b - (b^2 - 4 ac)^-2) / 2a )
	public double realMinus(double a, double b, double c) {
		
		double d1 = discrim(a, b, c);
		double rroot = ( (b * -1) - Math.sqrt(d1)) / (2 * a);
		
		return rroot;
		
	}
	
	// -- returns a complex root as a complex number using positive form ( (- b + (b^2 - 4 ac)^-2) / 2a )
	public ComplexNum complexPlus(double a, double b, double c) {
		
		double d2 = Math.abs(discrim(a, b, c));
		double real =  (-b) / (2 * a);
		double complex =  Math.sqrt(d2) / (2 * a);
		
		ComplexNum cn0 = new ComplexNum(real, complex);
		
		return cn0;
		
		
	}
	
	// -- returns a complex root as a complex number using negative form ( (- b + (b^2 - 4 ac)^-2) / 2a )
		public ComplexNum complexMinus(double a, double b, double c) {
			

			double d3 = Math.abs(discrim(a, b, c));
			double real =  (b * -1) / (2 * a);
			double complex =  (Math.sqrt(d3) / (2 * a)) * -1;
			
			ComplexNum cn1 = new ComplexNum(real, complex);
			
			return cn1;
			
			
		}
		
		// -- calculates one linear root using ( -c / b )
		public double Linear(double b, double c) {
			double lin = -c / b;
			
			return lin;
		}
	

	
}
