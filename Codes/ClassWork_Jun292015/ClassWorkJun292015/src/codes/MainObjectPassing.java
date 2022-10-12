package codes;

public class MainObjectPassing {

	public static void main(String[] args) {
		
		Circle A = new Circle(5);
		
		System.out.println("Radius = " + A.getRadius());
		
		objectPass(A);
		
		System.out.println("Radius = " + A.getRadius());
		
	}
	
	public static void objectPass(Circle c){
		
		c.setRadius(c.getRadius() + 1);
		
	}
	
	

}
