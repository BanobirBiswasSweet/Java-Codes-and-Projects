package codes;
import java.util.Scanner;

public class Prob001 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Ënter the values of x, y & z:: ");
		 double x=input.nextDouble ();
		 double y=input.nextDouble ();
		 double z=input.nextDouble ();
		 
		 double p=Eq(x, y, z);
		  
		  input.close();

	}
	public static double Eq(double a, double b, double c ){
	double base=(b*b)-(4*a*c);
	  double root=Math.sqrt(base);
	  double root1=(-b+root)/(2*a);
	  double root2=(-b-root)/(2*a);
	  System.out.print("Roots are "+root1+" and "+root2);
	  return root;
	}

}
