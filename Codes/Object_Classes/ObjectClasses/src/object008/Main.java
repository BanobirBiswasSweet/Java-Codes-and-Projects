package object008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the value of a, b and c:::");
		
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		QuadraticEquation eq=new QuadraticEquation(a, b, c);
		
		System.out.println("Root1 is:: "+eq.getRoot1());
		System.out.println("Root2 is:: "+eq.getRoot2());
		
		input.close();
		

	}

}
