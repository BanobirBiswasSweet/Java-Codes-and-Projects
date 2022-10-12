package inheritance003;

public class Rectangle extends GeometricShape{
	
	private double length;
	private double width;
	
	public Rectangle(String name, double length, double width){
		
		super(name);
		setLength(length);
		setWidth(width);
		
	}
	
	public void setLength(double length){
		
		this.length=length;
	}
	
	public double getLength(){
		
		return length;
	}
	
    public void setWidth(double width){
		
		this.width=width;
	}
	
	public double getWidth(){
		
		return width;
	}
	
	public double area(){
		
		return length*width;
	}
	
	public double perimeter(){
		
		return 2*(length+width);
	}

}
