package simple;

import java.util.Scanner;

public class AverageOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		int a=input.nextInt();
		int b=input.nextInt();
		input.close();
		
		int av=((a+b)/2);
		
		System.out.println("The average value of a and b is: "+av);

	}

}
