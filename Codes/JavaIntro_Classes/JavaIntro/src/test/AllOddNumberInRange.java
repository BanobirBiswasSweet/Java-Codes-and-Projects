package test;

import java.util.Scanner;

public class AllOddNumberInRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter limiting range(a-b): ");
		int a=input.nextInt();
		int b=input.nextInt();
		for(int n=a; n<=b; n++){
			if(n%2==1)
				System.out.println(n);
		}
		input.close();

	}

}
