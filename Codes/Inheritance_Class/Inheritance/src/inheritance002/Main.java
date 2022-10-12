package inheritance002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the value of width:: ");
		double width=input.nextDouble();
		
		System.out.println("Enter the value of length:: ");
		double length=input.nextDouble();
		
		Rectangle A=new Rectangle(width, length);
		
		System.out.println("The value of area:: "+A.area());
		
		input.close();

	}

}
