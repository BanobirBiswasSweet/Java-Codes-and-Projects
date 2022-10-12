package abstractclasses;

public class Main {

	public static void main(String[] args) {
		
		Circle cir = new Circle("red",true,5);
		
		System.out.println("Area = " + cir.area());
		
		Shape sh = (Shape)cir;
		
		System.out.println("Area = " + sh.area());
		
		
	}

}
