package test;

import java.util.Scanner;

public class SumOfEverFourDigits {

	public static void main(String[] args) {
		
        Scanner input=new Scanner(System.in);
        
        int sum=0;
		
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		while(n!=0){
			int r=n%10;
			n=n/10;
			sum=sum+r;
		}
		
		System.out.print("Sum is: "+sum);
		input.close();
	}

}
