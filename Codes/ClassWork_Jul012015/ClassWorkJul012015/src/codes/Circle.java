package codes;

public class Circle {
	
	private double radius; // attributes of Circle are defined here
	public static int count = 0;
	
	
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
	
	public static void printRadius(){
		
			Circle c = new Circle(2);
			System.out.println("Radius " + c.getRadius());
	}
	
	
	
	
	public double area(){
		
		return Math.PI * radius * radius;
	}
	
	
	public double circumference(){
		
		return Math.PI * radius * 2;
		
	}
	
	public boolean isGreater(Circle c){
		
		 	if(radius > c.getRadius())
		 		return true;
		 	else
		 		return false;
	}
	
	
	
	
	

}
