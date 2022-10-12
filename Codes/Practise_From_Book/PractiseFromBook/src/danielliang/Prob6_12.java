package danielliang;

import java.util.Scanner;

public class Prob6_12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n=input.nextInt();
		
		int[] a=new int[n];
		int[] b=new int[a.length];
		
		System.out.println("Enter the elements:: ");
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		reverse(a, b);
		System.out.println("Reversed array:: ");
		for(int i=0; i<a.length; i++) {
			System.out.println(b[i]);
		}
		

	}
	
	public static int[] reverse(int[] x, int[] y) {
		
		for(int j=0, k=x.length-1; j<x.length; j++, k--) {
		  y[j]=x[k];
		}
		return y;
	}

}
