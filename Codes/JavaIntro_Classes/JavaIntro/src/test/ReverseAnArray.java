package test;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] a=new int[5];
		int[] b=new int[a.length];
		
		System.out.println("Enter the elements:: ");
		
		for(int i=0; i<a.length; i++) {
			a[i]=input.nextInt();
		}
		
		for(int i=0, j=a.length-1; i<a.length; i++, j--) {
			b[j]=a[i];
		}
		
		for(int k=0; k<b.length; k++) {
			System.out.println("b["+k+"]="+b[k]);
		}
		input.close();
		
	}

}
