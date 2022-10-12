package danielliang;

import java.util.Scanner;

public class Prob5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number:: ");
		int n=input.nextInt();
		
		double print=sumOfSeries(n);
		System.out.println("Sum is:: "+print);
		input.close();

	}
	
	public static double sumOfSeries(int x) {
		
		double sum=0.0;
		
		for(int i=1, j=i+1; i<=x; i++, j++) {
			 sum=sum+(double)(i/j);
		}
		
		return sum;
	}

}
