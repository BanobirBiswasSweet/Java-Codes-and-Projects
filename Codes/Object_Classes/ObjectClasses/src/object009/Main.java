package object009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the value of a, b, c, d, e and f:: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e=input.nextInt();
		int f=input.nextInt();
		
		LinearEquation eq=new LinearEquation(a, b, c, d, e, f);
		System.out.println("Is it valid to solve? Ans:: "+eq.isSolvable());
		System.out.println("The value of X is::"+eq.getX());
		System.out.println("The value of Y is::"+eq.getY());
		
		input.close();
		
		

	}

}
