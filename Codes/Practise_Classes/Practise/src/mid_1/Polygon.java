package mid_1;

public class Polygon {
	
	private int n;
	private double side;
	private double x;
	private double y;
	
	public Polygon(){
		
		
	}
	
	public Polygon(int n, double side){
		
		setN(n);
		setSide(side);
	}
	
	public void setN(int n){
		
		if(n>3){
			
		this.n=n;
		
		}
	}
	
	public int getN(){
		
		return n;
	}
	
	public void setSide(double side){
		
		if(side>1){
		
		this.side=side;
		
		}
	}
	
	public double getSide(){
		
		return side;
	}
	
	public void setX(double x){
		
		this.x=x;
	}
	
	public double getX(){
		
		return x;
	}
	
	public void setY(double y){
		
		this.y=y;
	}
	
	public double getY(){
		
		return y;
		
	}
	
	public double area(){
		
		return (n*side*side)/(4*Math.tan((perimeter())/n));
	}
	
	public double perimeter(){
		
		return n*side;
	}

	
}
