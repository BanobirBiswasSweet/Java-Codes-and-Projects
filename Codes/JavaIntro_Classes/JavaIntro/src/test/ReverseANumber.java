package test;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=input.nextInt();
		
		System.out.print("Reersed number: ");
		
	    while(n!=0){
	    	int r=n%10;
	    	n=n/10;
	    	System.out.print(r);
	    }
	    input.close();

	}

}
