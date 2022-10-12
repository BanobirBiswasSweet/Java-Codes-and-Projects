package test;

import java.util.Scanner;

public class AverageOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		double a=input.nextInt();
		double b=input.nextInt();
		double av=(a+b)/2;
		System.out.print("Average is: "+av);
		input.close();
	}

}
