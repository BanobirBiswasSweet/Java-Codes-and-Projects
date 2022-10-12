package codes;

import java.util.Scanner;

public class Example003 {
	
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the values of a and b ::: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		int c = add(x,y);
		
		
		System.out.println("c = " + c);
		//System.out.println("sum = " + add(3,4));
	}
	
	public static int add(int a,int b){
		
		int sum = a + b;
		
		return sum;
		
		
	}
}
