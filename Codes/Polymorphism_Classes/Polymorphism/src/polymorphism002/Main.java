package polymorphism002;

public class Main {

	public static void main(String[] args) {

		Square s1=new Square(5);
		System.out.println("Side of the sqaure is:: "+s1.getSide());
		System.out.println("Area of the sqaure is:: "+s1.getArea());
		
		Square s2=new Square(5, "violet", true);
		Rectangle rec=new Rectangle(5, 4, "yellow", false);
		Shape sh=new Shape("Blue", true);
		
		printColor(s2);
		printColor(rec);
		printColor(sh);

	}
	
	public static void printColor(Shape sh) {
		
		System.out.println(sh.getColor());
		System.out.println(sh.toString());
	}

}
