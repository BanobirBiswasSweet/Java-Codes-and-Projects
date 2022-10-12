package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Square sq = new Square(3,"violet",true);
		Rectangle rect = new Rectangle(3,4,"indigo",false);
		Shape shape = new Shape();
		
		
		printColor(sq);
		printColor(rect);
		printColor(shape);
		
		
		
	}
	
	public static void printColor(Shape sh){
		
		System.out.println(sh.getColor());
		
		
	}
	
	
	

}
