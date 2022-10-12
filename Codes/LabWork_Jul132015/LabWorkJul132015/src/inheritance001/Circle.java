package inheritance001;

public class Circle {
	
	private double radius;
	//private String color;
	
	public Circle(double radius){
		
		this.radius=Math.abs(radius);
	}
	
	public double getRadius(){
		
		return radius;
	}
	
	public void setRadius(double radius){
		
		this.radius=Math.abs(radius);
		
	}
	
	public double getArea(){
		
		return Math.PI*radius*radius;
	}

}
