package object007;

public class Polygon {
	
	private int n;
	private double side;
	
	public Polygon(){
		
		n=3;
		side=1;
	}
	
	public Polygon(int n, double side){
		this.side=side;
		this.n=n;
	}
	
	public void setN(int n){
		
		if(n>2)
			this.n=n;
	}
	
	public int getN(){
		
		return n;
	}
	
	public void setSide(double side){
		
		if(side>1)
			this.side=side;
	}
	
	public double getSide(){
		
		return side;
	}
	
	public double perimeter(){
		
		return (side*n); 
	}
	
	public double area(){
		
		return Math.abs(((n*side*side)/(4*Math.tan(perimeter()/n))));
	}

}
