package object006;

public class Circle1 {
	
	private double radius;
	
	public Circle1(){
		
		radius=1.0;
	}
	
	public Circle1(double radius){
		this.radius=radius;
	}
	
	public void setRadius(double radius){
		
		if(radius<0)
			this.radius=radius*(-1);
		else
			this.radius=radius;
	}
	
	public double getRadius(){
		
		return radius;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}

}
