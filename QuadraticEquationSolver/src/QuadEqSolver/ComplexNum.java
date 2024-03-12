package QuadEqSolver;

public class ComplexNum {

	private double real;
	private double imag;
	
	// constructors
	public ComplexNum() {
		
	}
	
	ComplexNum(double r, double i) {
		this.real = r;
		this.imag = i;
	}
	
	ComplexNum(ComplexNum rhs) { // rhs = right hand side
		this.real = rhs.real;
		this.imag = rhs.imag;
		
	}
	
	// setters
	public void setReal(double r) {
		this.real = r;
	}
	
	public void setImag(double i) {
		this.imag = i;
	}
	
	// getters
	public double getReal() {
		return this.real;
	}
	
	public double getImag() {
		return this.imag;
	}
	
	public String toString() {
		
		// -- if imaginary part is greater than or equal to 0 print
		if (Math.abs(this.real) < 0.000001) {
			this.real = Math.abs(this.real);
		}
		if (this.imag >= 0) {
			return this.real + " + " + this.imag + "i";
		}
		else if (this.imag < 0) {
			return this.real + " - " + (this.imag*-1) + "i";
		}
		
		return null;
		
	}
	
}
