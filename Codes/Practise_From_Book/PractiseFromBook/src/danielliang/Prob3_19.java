package danielliang;

import java.util.Scanner;

public class Prob3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the edges of the trinagle(a, b & c): ");
		
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		boolean triangle=false;
		
		if((a+b)>c && (a+c)>b && (b+c)>a){
			triangle=true;
			System.out.println("can "+a+" "+b+" and "+c+" form a trinagle? "+triangle);
		}
		else
			System.out.println("can "+a+" "+b+" and "+c+" form a trinagle? "+triangle);
		input.close();

	}

}
