package codes;

public class Main {

	public static void main(String[] args) {
		
		Cylinder A = new Cylinder(3, 5);
		
		System.out.println("A's volume = " + A.volume());
		System.out.println("A's base area = " + A.area());
		System.out.println("A's surface area= "+A.surfaceArea());
		System.out.println("A's radius = " + A.getRadius());
		System.out.println("A's height= "+A.getHeight());
	}

}