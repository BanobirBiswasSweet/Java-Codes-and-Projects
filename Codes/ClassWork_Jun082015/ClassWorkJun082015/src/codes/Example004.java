package codes;

import java.util.Scanner;

public class Example004 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the values of g and t ::: ");
		double g = input.nextDouble();
		double t = input.nextDouble();
		
		double x = 1.0/2 * g * t * t;
		
		System.out.println("x = " + x);
		
	}

}
