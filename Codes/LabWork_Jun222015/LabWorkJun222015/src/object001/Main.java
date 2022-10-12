package object001;

public class Main {

	public static void main(String[] args) {
		
		Circle A=new Circle(10.0);
		System.out.println("Area of A circle is:: "+A.area());
		
		A.setRadius(12.0);
		System.out.println("Area of A circle is:: "+A.area());

	}

}
