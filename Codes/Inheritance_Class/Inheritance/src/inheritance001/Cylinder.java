package inheritance001;

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(double radius, double height) {
		
		super(radius);
		setHeight(height);
	}
	
	public void setHeight(double height) {
		
		this.height=height;
	}
	
	public double getHeight() {
		
		return height;
	}
	
	public double volume() {
		
		return super.Area()*height;
	}
	
	public double surfaceArea() {
		
		return super.circumference()*height+2*super.Area();
	}

}
