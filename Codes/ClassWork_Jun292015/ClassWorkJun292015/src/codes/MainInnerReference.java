package codes;

public class MainInnerReference {

	public static void main(String[] args) {
		
		Circle A = new Circle(3);
		Circle B = new Circle(5);
		
		System.out.println(A.isGreater(B));
		System.out.println(B.isGreater(A));
		
	}

}
