package object001;

public class Circle {
	
	private double radius; // attributes of Circle are defined here
	
	public Circle(){
		
		radius = 1;
	}
	
	
	
	public Circle(double radius){
		
		if(radius > 0)
			this.radius = radius;
		else 
			this.radius = -1 * radius;
	}
	
	public double getRadius(){
		
		return radius;
	}
	
	public void setRadius(double radius){
		
		if(radius > 0)
			this.radius = radius;
		else 
			this.radius = -1 * radius;
		
		
	}
	
	
	
	public double area(){
		
		return Math.PI * radius * radius;
	}
	
	
	public double circumference(){
		
		return Math.PI * radius * 2;
		
	}

}
