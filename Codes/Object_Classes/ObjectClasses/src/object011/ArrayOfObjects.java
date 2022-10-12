package object011;

import java.util.Scanner;

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Circle[] circles=new Circle[5];
		for(int i=0; i<circles.length; i++){
			
			System.out.println("Enter the value of radius of circles["+i+"]:: ");
			double radius=input.nextDouble();
			circles[i]=new Circle(radius);
			printRadius(radius);
		}
	}
	
	public static void printRadius(double radius){
		
		Circle c=new Circle(radius);
		System.out.println("Radius:: "+c.getRadius());
	}

}
