package test;

import java.util.Scanner;

public class Factorial1ton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number(n): ");
		int n=input.nextInt();
		
		int fact=1;
		
		for(int i=1; i<=n; i++){
			fact=fact*i;
			System.out.println(i+"!= "+fact);
		}
		input.close();

	}

}
