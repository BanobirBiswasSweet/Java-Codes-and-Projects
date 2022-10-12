package NewPrograms;

public class Circle {
	
	private int radius;
	
	public Circle(int radius) {
		
		this.radius=radius;
	}
	
	public void setRadius(int radius) {
		
		this.radius=radius;
	}
	
	public double getArea() {
		
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		
		return 2*Math.PI*radius;
	}
	

}
