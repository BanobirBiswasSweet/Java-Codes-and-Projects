package codes;

import java.util.Scanner;

public class Example001 {

	public static void main(String[] args) {
		
		int[] b = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < b.length; i++){
			
			System.out.print("Enter the value for b[" + i + "] ::: ");
			b[i] = input.nextInt();
		}
		
		
		for(int i = 0; i < b.length; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}	
	}

}
