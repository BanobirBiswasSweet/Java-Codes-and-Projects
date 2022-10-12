package danielliang;

import java.util.Scanner;

public class Prob6_11 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size:: ");
		int n=input.nextInt();
		
		double[] array=new double[n];
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<n; i++) {
			array[i]=input.nextDouble();

	    }
		double sum=mean(array);
		System.out.println("The mean is: "+sum);
		double dev=deviation(array);
		System.out.println("The standard deviation is: "+dev);
	}
	
	public static double deviation(double[] x) {
		
		double use=mean(x);
		double total=0.0;
		double up=0.0;
		
		for(int k=0; k<x.length; k++) {
		    up=Math.pow((x[k]-use), 2);
			total=total+(up/(x.length-1));
		}
		double dv=Math.sqrt(total);
		return dv;
	}
	
	public static double mean(double[] x) {

		double add=0.0;
		
		for(int j=0; j<x.length; j++) {
			add=add+x[j];
		}
		return add;
	}
}

