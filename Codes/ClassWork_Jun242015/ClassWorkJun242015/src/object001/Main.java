package object001;

import object001.Circle;

public class Main {

	public static void main(String[] args) {
		
		Circle A = new Circle(-5);
		
		System.out.println("Radius of Circle A :: " + A.getRadius());
		System.out.println("Area of Circle A :: " + A.area());
		System.out.println("Circumference of Circle A :: " + A.circumference());
		
		
		A.setRadius(-4); //directly accessed to change radius
		//A.radius = -4;
		
		System.out.println("\n\nAfter changing the radius of circle A");
		
		System.out.println("Radius of Circle A :: " + A.getRadius());
		System.out.println("Area of Circle A :: " + A.area());
		System.out.println("Circumference of Circle A :: " + A.circumference());
		
	}

}
