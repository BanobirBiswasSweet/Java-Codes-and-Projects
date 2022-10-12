package codes;

import java.util.Scanner;

public class Example005 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two values ::: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		for(int i = a; i <= b; i++){
			System.out.println("i = " + i);
		}
		
		
	}

}
