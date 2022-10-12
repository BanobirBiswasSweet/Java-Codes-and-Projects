package codes;

import java.util.Scanner;

public class Example007 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value to check primality :: ");
		int x = input.nextInt();
		
		System.out.println("Is " + x + " a prime (true/false) :: " + checkPrime(x));
		
	}

	public static boolean checkPrime(int x){
		
		for(int i = 2; i < x; i++){
			
			if(x % i == 0){
				
				return false;
			}
			
		}
		
		return true;
	}
	
	
}
