package inheritance001;

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(double radius, double height){
		
		super(radius);
		setHeight(height);
	}
	
	public void setHeight(double height){
		
		this.height=Math.abs(height);
	}
	
	public double getHeight(){
		
		return height;
	}
	
	public double getVolume(){
		
		return super.getArea()*height;
	}

}
