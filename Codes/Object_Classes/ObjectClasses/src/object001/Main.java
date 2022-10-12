package object001;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCircle1 circle1=new TestCircle1();
		System.out.println("The area of the circle of radius: "+circle1.radius+"is: "+circle1.getArea());
		
		TestCircle1 circle2=new TestCircle1();
		System.out.println("The area of the circle of radius: "+circle2.radius+"is: "+circle2.getArea());
		
		TestCircle1 circle3=new TestCircle1();
		System.out.println("The area of the circle of radius: "+circle3.radius+"is: "+circle3.getArea());
		
		circle2.radius=100;
		System.out.println("The area of the circle of radius: "+circle2.radius+"is: "+circle2.getArea());

	}

}
