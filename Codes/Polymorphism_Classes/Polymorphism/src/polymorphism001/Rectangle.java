package polymorphism001;

public class Rectangle extends Shape {
	
	private double width=1.0;
	private double length=1.0;
	
	public Rectangle() {
		
		
	}
	
	public Rectangle(double width, double length) {
		
		this.width=Math.abs(width);
		this.length=Math.abs(length);
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		
		super(color, filled);
		this.width=Math.abs(width);
		this.length=Math.abs(length);

	}
	
	public double getWidth() {
		
		return width;
	}
	
	public void setWidth(double width) {
		
		this.width=Math.abs(width);
		
	}
	
	public double getLength() {
		
		return length;
		
	}
	
	public void setLength(double length) {
		
		this.length=Math.abs(length);
	}
	
	public double getArea() {
		
		return width*length;
	}
	
	public double getPerimeter() {
		
		return 2*(width+length);
	}
}
