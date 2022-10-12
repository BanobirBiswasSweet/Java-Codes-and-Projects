package object001;

public class Circle {
	
	public double radius;
	
	public Circle(double radius) {
		
		this.radius=radius;
	}
	
	public double area() {
		
		return Math.PI*radius*radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getRadius(double radius) {
		
		return radius;
	}

}
