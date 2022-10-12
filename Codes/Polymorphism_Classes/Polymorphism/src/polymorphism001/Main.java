package polymorphism001;

public class Main {

	public static void main(String[] args) {

		Sqaure s1=new Sqaure(5);
		System.out.println("Side of the sqaure is:: "+s1.getSide());
		System.out.println("Area of the sqaure is:: "+s1.getArea());
		
		Sqaure s2=new Sqaure(5, "violet", true);
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
