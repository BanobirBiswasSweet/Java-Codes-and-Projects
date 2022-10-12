package inheritance003;

public class Main {

	public static void main(String[] args) {
		
		Rectangle A=new Rectangle("A", 3, 5);
		
		System.out.println("Length of A is:: "+A.getLength());
		System.out.println("Width of A is:: "+A.getWidth());
		System.out.println("Area of A is:: "+A.area());
		System.out.println("Perimeter of A is:: "+A.perimeter());
	}

}