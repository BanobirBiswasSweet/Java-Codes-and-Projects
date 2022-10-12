package codes;

public class Main {

	public static void main(String[] args) {
		
		Cylinder A = new Cylinder(3,5);
		
		System.out.println("A's volume = " + A.volume());
		System.out.println("A's base area = " + A.area());
		System.out.println("A's radius = " + A.getRadius());
		
		Circle innerCircleOfA = (Circle)A; //up casting=child to parent
		
		Circle randomCircle = new Circle(7);
		
		System.out.println("A's base circle area = " + innerCircleOfA.area());
		//System.out.println("A's volume = " + innerCircleOfA.volume());
		
		Cylinder B = (Cylinder)innerCircleOfA; //down casting=parent to child
		// Cylinder C = (Cylinder)randomCircle; // this is wrong since randomCircle was not created from any cylinder object
		
	}

}
