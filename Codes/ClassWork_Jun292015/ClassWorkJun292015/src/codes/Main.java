package codes;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("count = " + Circle.count);

		Circle A = new Circle(4);
		Circle B=new Circle(3);
		
		A.count = 7;
		
		System.out.println("count = " + Circle.count);
		System.out.println("count = " + A.count);
		System.out.println("Is A is greater than B? "+A.isGreater(B));
		
	}

}
