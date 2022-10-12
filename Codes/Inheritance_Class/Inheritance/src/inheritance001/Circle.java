package inheritance001;

public class Circle {
	
	private double radius;
	
	public Circle (double radius) {
		
		if(radius>0)
			this.radius=radius;
		else
			this.radius=-1*radius;
	}
	
	public void setRadius(double radius) {
		
		if(radius>0)
			this.radius=radius;
		else
			this.radius=-1*radius;	
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public double Area() {
		
		return Math.PI*radius*radius;
	}
	
	public double circumference() {
		
		return 2*Math.PI*radius;
	}

}
