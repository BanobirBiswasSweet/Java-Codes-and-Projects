package object011;

public class Circle {
	
	private double radius;
	
	public Circle(double radius){
		
		this.radius=Math.abs(radius);
	}
	
	public void setRadius(double radius){
		
		this.radius=Math.abs(radius);
		
	}
	
	public double getRadius(){
		
		return radius;
	}
	
	public double circumference(){
		
		return 2*Math.PI*radius;
	}
	
	public double area(){
		
		return Math.PI*radius*radius;
	}
	
	public boolean isGreater(Circle c){
		if(radius>c.getRadius())
			return true;
		else
			return false;
		
	}

}
