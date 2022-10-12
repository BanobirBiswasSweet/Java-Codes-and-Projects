package object004;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Before creating objects");
		System.out.println("The number of circle objects is:: "+Circle2.numberOfObjects);//Circle2.numberOfObjects is called here 
		                                                                                  //though objects are not created yet.
		
		Circle2 c1=new Circle2();
		
		System.out.println("After creating object c1");
		System.out.println("C1:Radius ("+c1.radius+") and number of objects is ("+c1.numberOfObjects+")");
		
        Circle2 c2=new Circle2();
        c1.radius=9;
		
		System.out.println("After creating object c2 and modifying c1");
		System.out.println("C1:Radius ("+c1.radius+") and number of objects ("+c1.numberOfObjects+")");
		System.out.println("C1:Radius ("+c2.radius+") and number of objects ("+c2.numberOfObjects+")");

	}

}
