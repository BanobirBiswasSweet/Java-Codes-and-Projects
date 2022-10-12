package codes;

import java.util.Scanner;

public class Example003 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer value a ::: ");
		int a = input.nextInt();
		
		System.out.print("Please enter an integer value b ::: ");
		int b = input.nextInt();
		
		System.out.println("a = " + a + " b = " + b);
		int c = a + b;
		System.out.println("Sum = " + c);
	}

}
