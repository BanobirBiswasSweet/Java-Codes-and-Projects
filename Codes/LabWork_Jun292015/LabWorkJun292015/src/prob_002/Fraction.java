package prob_002;


public class Fraction {
	
	public int x;
	public int y;
	
	public Fraction(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x){
		
		this.x=x;
	}
    public void setY(int y){
		
		this.y=y;
	}
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void add(Fraction f){
		
		 int a=(x*f.y+f.x*y);
		 int b=y*f.y;
		 x=a;
		 y=b;
	}
	
	public String toString(){
		return x+"/"+y;
		
	}
	

}
