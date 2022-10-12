package test;

import java.util.Scanner;

public class SumofAllOddNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter limiting range(a-b): ");
		
		int a= input.nextInt();
		int b=input.nextInt();
		
		int sum=0;
		
		for(int i=a; i<=b; i++){
			if(i%2==1)
				sum=sum+i;
		}
	   
		System.out.println("Sum is: "+sum);
		input.close();

	}

}
