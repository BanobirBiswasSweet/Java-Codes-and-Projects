package polymorphism002;

public class Shape {
	
	private String color;
	private boolean filled;
	
	public Shape(){
		
		color="red";
		filled=true;
	}
	
	public Shape(String color, boolean filled){
		
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor(){
		
		return color;
	}
	
	public void setColor(String color){
		
		this.color=color;
	}
	
	public boolean getFilled(){
		
		return filled;
	}
	
	public void setFilled(boolean filled){
		
		this.filled=filled;
	}
	
    public String toString() {
		
		if(filled==true)
		
		return "A shape with color of "+color+" filled";
		
		else
			return "A shape with color of "+color+" not filled";
	}
}
