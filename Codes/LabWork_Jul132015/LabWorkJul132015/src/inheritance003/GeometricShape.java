package inheritance003;

public class GeometricShape {
	
	private String name;
	
	public GeometricShape(String name){
		
		this.name=name;
	}
	
	public void setName(String name){
		
		this.name=name;
	}
	
	public String getName(){
		
		return name;
	}
	
	public double area(){
		
		return 0;
	}
	
	public double perimeter(){
		
		return  0;
	}

}
