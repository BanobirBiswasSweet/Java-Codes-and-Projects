package codes;

public class Example002 {

	public static void main(String[] args) {
		
		System.out.println(area(5.0,6.8));
		System.out.println(area(5.2));
		
	}

	public static double area(double radius){
		
		return 3.14 * radius * radius;
		
	}
	
	public static double area(double length,double width){
		
		return length * width;
	}
	
	
	
	
}
