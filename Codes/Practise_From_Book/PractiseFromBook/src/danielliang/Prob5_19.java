package danielliang;

import java.util.Scanner;

public class Prob5_19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter three sides of the triangle:: ");
		double a=input.nextInt();
		double b=input.nextInt();
		double c=input.nextInt();
		
		double result=area(a, b, c);
		System.out.println("The area is:: "+result);
		
		input.close();
		
	}	
	
	public static boolean isValid(double a, double b, double c){
		
		if(a+b>c && b+c>a && c+a>b){
			
		 return true;
		}
		else
			return false;
	}
	
	public static double area(double a, double b, double c){
		
		double area=0.0;
		boolean bool=isValid(a, b, c);
		
		if(bool=true){
			
			 area=0.5*a*b;
		}
		else
			System.out.println("Input is invalid!!!");
		
		return area;
		
	}
	
	

}
