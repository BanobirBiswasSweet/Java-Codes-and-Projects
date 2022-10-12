package inheritance002;

public class Rectangle extends Shape {
	
	private double height;
	
	public Rectangle(double width, double length) {
		
		super(width, length);
		setHeight(height);
	}
	
	public void setHeight(double height) {
		
		this.height=height;
	}
	
	public double getHeight() {
		
		return height;
	}
	
	public double area() {
		
		return super.area();
	}

}
