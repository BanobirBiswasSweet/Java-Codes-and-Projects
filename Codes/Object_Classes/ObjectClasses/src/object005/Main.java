package object005;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Before creating object");
		System.out.println("Number of objects:: "+Circle.getnumberOfObjects());
		
		Circle c1=new Circle();
		
		System.out.println("After creating c1 object");
		System.out.println("C1: Radius:: "+c1.getRadius());
		System.out.println("c2: Area:: "+c1.getArea());
		System.out.println("Number of objects:: "+c1.getnumberOfObjects());
		
		Circle c2=new Circle();
		c1.setRadius(9.0);
		
		System.out.println("After creating c2 and modifying c1");
		System.out.println("C1: Radius:: "+c1.getRadius());
		System.out.println("c2: Area:: "+c1.getArea());
		System.out.println("C2: Radius:: "+c2.getRadius());
		System.out.println("c2: Area:: "+c2.getArea());
		System.out.println("Number of objects:: "+c2.getnumberOfObjects());
		

	}

}
