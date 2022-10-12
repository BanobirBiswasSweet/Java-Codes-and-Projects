package polymorphism001;

public class Sqaure extends Rectangle{
	
	public Sqaure() {
		
		super();
	}
	
	public Sqaure(double side) {
		super(side, side);
		
	}
	
	public Sqaure(double side, String color, boolean filled) {
		
		super(side, side, color, filled);
	}
	
	public double getSide() {
		
		return super.getWidth();
	}
	
	public void setSide(double side) {
		
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side) {
		
		super.setWidth(side);
		super.setLength(side);
	}
	
	public String toString() {
		
		return "A sqaure with a side "+getSide()+" which is subclass of "+super.toString();
	}

}
