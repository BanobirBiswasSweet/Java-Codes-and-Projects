package inheritance002;

public class Shape {
	
	private double width;
	private double length;
	
	public Shape(double width, double length) {
		
		this.width=width;
		this.length=length;
	}
	
	public void setWidth(double width) {
		
		this.width=width;
	}
	
	public double getWidth() {
		
		return width;
	}
	
    public void setLength(double length) {
		
		this.length=length;
	}
	
	public double getLength() {
		
		return length;
	}
	
	public double area() {
		
		return width*length;
	}

}
