package labMid1;

public class Main {

	public static void main(String[] args) {
		
		ComplexNumber c1=new ComplexNumber(4, 6);
		ComplexNumber c2=new ComplexNumber(2, 4);
		
		System.out.println("1st complex number is:: "+c1.toString());
		System.out.println("1st complex number is:: "+c2.toString());
		
		c1.add(c2);
		System.out.println("Sum is:: "+c1.toString());
		
		c1.sub(c2);
		System.out.println("Sub is:: "+c1.toString());

	}

}