package object002;

public class Rectangle {
	
	public double height;
	public double width;
	

	public Rectangle(double height, double width) {
		
		setChange(height, width);
		
		/*this.height=height;
		this.width=width;
		*/
	}
	
	public double area() {
		
		return height*width;
	}
	
	public void setChange(double height, double width) {
		
		this.height=height;
		this.width=width;
	}
	
	public double getHeight(double height) {
		
		return height;
	}
	
	public double getWidth( double width){
		
		return width;
	}
	

}
