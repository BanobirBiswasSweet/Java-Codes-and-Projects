package codes;

import java.util.Scanner;

public class MainArrayOfObjects {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Circle[] circles = new Circle[5];
		
		for(int i = 0; i < circles.length; i++){
			
			System.out.print("Enter a radius value for index # " + i + " : ");
			double radius = input.nextDouble();
			circles[i] = new Circle(radius); 
		}
		
		for(int i = 0; i < circles.length; i++){
			
			System.out.println("Area of circles[" + i + "] is " + circles[i].area());
			System.out.println("Circumference of circles["+i+"] is: "+circles[i].circumference());
		}
		
		
		
		
	}

}
