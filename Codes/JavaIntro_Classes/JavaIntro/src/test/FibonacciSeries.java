package test;
import java.util.Scanner;

public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter limiting number: ");
		int n=input.nextInt();
		int f=0;
		int s=1;
		int next=0;
		for(int c=0; c<n; c++){
			if(c<=1)
				next=c;
			else
				next=f+s;
			    f=s;
			    s=next;
			    System.out.print("\t"+next);
		}
		input.close();

	}

}
