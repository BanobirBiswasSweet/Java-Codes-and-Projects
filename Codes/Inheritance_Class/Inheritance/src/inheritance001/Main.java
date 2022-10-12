package inheritance001;

public class Main {

	public static void main(String[] args) {
		
		Cylinder A=new Cylinder(10, 15);
		
		System.out.println("A's radius:: "+A.getRadius());
		System.out.println("A's volume:: "+A.volume());
		System.out.println("A's surface area:: "+A.surfaceArea());
		
	}

}
