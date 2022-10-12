package codes;

import java.util.Scanner;

public class Example005 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your score:: ");
		int score = input.nextInt();
		
		if(score >= 90)
			System.out.println("A");
		
		if(score >= 80)
			System.out.println("B");
		
		if(score >= 70)
			System.out.println("C");
		
		else
			System.out.println("F");
		
		
		
	}

}
