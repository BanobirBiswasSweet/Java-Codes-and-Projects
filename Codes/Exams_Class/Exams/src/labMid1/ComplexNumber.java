package labMid1;

public class ComplexNumber {
	
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void setReal(int real) {
		
		this.real=real;
	}
	
	public int getReal() {
		
		return real;
	}
	
	public void setImaginary(int imaginary) {
		
		this.imaginary=imaginary;
	}
	
	public int getImaginary() {
		
		return imaginary;
	}
	
	public void add(ComplexNumber c) {
		
		real=(real+c.getReal());
		imaginary=(imaginary+c.getImaginary());
	}
	

	public void sub(ComplexNumber c) {
		
		real=(real-c.getReal());
		imaginary=(imaginary-c.getImaginary());
	}
	
	public String toString() {
		
		return real+"+"+imaginary+"i";
	}

}
