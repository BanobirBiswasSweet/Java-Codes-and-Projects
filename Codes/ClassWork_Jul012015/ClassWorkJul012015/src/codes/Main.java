package codes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of radius :::  ");
		double r = input.nextDouble();
		
		Circle c = createObject(r);
		System.out.println("Area = " + c.area());
		
		input.close();
		
		//c.printRadius();
		
				
	}

	public static Circle createObject(double radius){
		
		Circle cir = new Circle(radius);
		
		return cir;
		
	}
	
	
	
	
}
