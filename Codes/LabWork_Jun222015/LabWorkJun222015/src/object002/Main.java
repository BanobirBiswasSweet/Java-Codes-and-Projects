package object002;

public class Main {

	public static void main(String[] args) {
		
		Rectangle A=new Rectangle(10.0, 12.0);
		
	    System.out.println("The area is:: "+A.area());
	    
	    System.out.println("\nAfter changing the values");
	    
	    A.setChange(8.50, 10.0);
	    
	    System.out.println("The area is:: "+A.area());
	   

	}

}
