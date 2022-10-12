package test;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int[] a=new int[5];
		
		int sum=0;
		
		System.out.println("Enter the elements:: ");
		for(int i=0; i<a.length; i++) {
			a[i]=input.nextInt();
	    }
		
		for(int j=0; j<a.length; j++) {
			sum=sum+a[j];
		}
		
		System.out.println("Sum is:: "+sum);
		input.close();

	}

}
