package codes;
import java.util.Scanner;

public class Prob005 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the valus of a, b & c::: ");
		
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		boolean bool=false;
		
		if((a+b)>c && (b+c)>a && (c+a)> b){	
			bool=true;
			System.out.print("Can "+a+" "+b+" "+"and"+c+" form a triangle? "+bool);
		}
		else
			System.out.print("Can "+a+" "+b+" "+"and"+c+" form a triangle? "+bool);


	}

}
