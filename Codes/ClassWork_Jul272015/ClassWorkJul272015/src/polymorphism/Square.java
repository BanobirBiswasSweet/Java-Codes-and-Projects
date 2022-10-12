package polymorphism;

public class Square extends Rectangle {
	
	public Square(){
		super();
	}
	
	public Square(double side){
		super(side,side);
	}
	
	public Square(double side,String color,boolean filled){
		super(side,side,color,filled);
	}

	public double getSide(){
		
		return super.getLength();
	}
	
	public void setSide(double side){
		super.setLength(side);
		super.setWidth(side);
		
	}
	
	public void setLength(double side){
		super.setLength(side);
		super.setWidth(side);
		
	}
	
	public void setWidth(double side){
		super.setLength(side);
		super.setWidth(side);
		
	}
	
	public String toString(){
		
		return "A Square of side = " + getSide() + " which is a subclass of " + super.toString(); 
	}
	
	
	
}
