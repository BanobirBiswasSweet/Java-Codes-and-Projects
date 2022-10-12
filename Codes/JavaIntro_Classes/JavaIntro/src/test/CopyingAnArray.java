package test;

import java.util.Scanner;

public class CopyingAnArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] a=new int[5];
		int[] b=new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			a[i]=input.nextInt();
		}
		
		for(int k=0; k<a.length; k++) {
			System.out.println("a["+k+"]=::"+a[k]);
		}
		System.out.println("\n");
		
		for(int j=0; j<a.length; j++) {
				b[j]=a[j];
				System.out.println("b["+j+"]=::"+b[j]);
		}
		input.close();
	}

}
