package object006;

public class Main {

	public static void main(String[] args) {
		
		Circle1 c=new Circle1();
		System.out.println("Before modifying");
		System.out.println("Radius is: "+c.getRadius()+" and "+"Area is:: "+c.getArea());
		
		c.setRadius(10.0);
		
		System.out.println("After modifying");
		System.out.println("Radius is: "+c.getRadius()+" and "+"Area is:: "+c.getArea());

	}

}
