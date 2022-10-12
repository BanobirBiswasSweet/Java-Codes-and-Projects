package codes;
import java.util.Scanner;

public class Prob003 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the valuse of a, b, c, d, e & f sequencially:: ");
		
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		
		double base=(a*d-b*c);
		double x=(e*d-b*f)/base;
		double y=(a*f-b*c)/base;
		
		System.out.println("X= "+x);
		System.out.print("Y= "+y);
	}

}
