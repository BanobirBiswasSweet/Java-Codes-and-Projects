package danielliang;

import java.util.Scanner;

public class Prob2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int n=input.nextInt();
		
		int sum=0;
		
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		
		System.out.println("Sum is: "+sum);
		input.close();

	}

}
