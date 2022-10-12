package object001;

import object001.Circle;

public class Main {

	public static void main(String[] args) {
		
		Circle A = new Circle(5);
		Circle B = new Circle(7);
		
		System.out.println("Radius of Circle A :: " + A.radius);
		System.out.println("Radius of Circle B :: " + B.radius);
		
		System.out.println("Area of Circle A :: " + A.area());
		System.out.println("Area of Circle B :: " + B.area());
		
		A.radius = 4; //directly accessed to change radius
		
		System.out.println("\n\n After changing the radius of circle A");
		
		System.out.println("Radius of Circle A :: " + A.radius);
		System.out.println("Area of Circle A :: " + A.area());

	}

}
