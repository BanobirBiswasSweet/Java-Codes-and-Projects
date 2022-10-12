package abstractclasses;

public class Circle extends Shape {
	
	
	private double radius; // attribute defined here
	
	public Circle(String color, boolean filled, double radius){
		
		super(color,filled);
		this.radius = Math.abs(radius);
		
	}
	
	
	public Circle(double radius){
		super();
		this.radius = Math.abs(radius);
	}
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area(){
		
		return radius * radius * Math.PI;
		
	}
	
	public double perimeter(){
		
		return 2 * Math.PI * radius;
		
	}
	


}
