package codes;

import java.util.Scanner;

public class Example006 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value n ::: ");
		int n = input.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++){
			
			fact = fact * i;
			
			System.out.println(i + "!= " + fact);
			
		}
		

	}

}
