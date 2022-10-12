package object005;

public class Circle {
	
	private double radius;
	
	private static int numberOfObjects=0;
	
	public Circle() {
		radius=1.0;
		numberOfObjects++;
	}
	
	public Circle(double radius) {
		this.radius=radius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public void setRadius(double radius) {
		
		this.radius=radius;
	}
	
	public static int getnumberOfObjects() {
		
		return numberOfObjects;
	}
	
	public double getArea() {
		
		return Math.PI*radius*radius;
	}

}
