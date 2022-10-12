package test;

import java.util.Scanner;

public class SumofaSeries {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		int a=input.nextInt();
		
		int sum1=0;
		int sum2=0;
		int sum=0;
		
		if(a%2!=0) {
			for(int z=a; z>=1; z--) {
				if(z%2==0) {
					sum1=sum1+(z*z);
				}
				else
					sum2=sum2+(z*z);
			}
			sum=sum2-sum1;
		}
		else if(a%2==0) {
			for(int z=a; z>=1; z--) {
				if(z%2==0) {
					sum1=sum1+(z*z);
				}
				else
					sum2=sum2+(z*z);
			}
			sum=sum1-sum2;
		}
		System.out.println("Sum is:: "+sum);
		input.close();

	}

}
