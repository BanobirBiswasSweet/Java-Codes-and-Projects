package banobir_biswas_sweet_1511168042;

public class Main {

	public static void main(String[] args) {
		
		Car[] cars=new Car[3];
		
		cars[0]=new Car("Audi", "sv5", .031);
		cars[1]=new Car("BMW", "x01s", .027);
		cars[2]=new Car("Mercedez", "n99o", .037);
	
		System.out.println("Speed of 1st car:: "+cars[0].getSpeed());
		System.out.println("Speed of 2nd car:: "+cars[1].getSpeed());
		System.out.println("Speed of 3rd car:: "+cars[2].getSpeed());
		
		System.out.println("Is the "+cars[0].getBrand()+" is faster than the "+cars[2].getBrand()+ "? Ans:: "+cars[0].hasmoreSpeed(cars[2]));

	}

}
