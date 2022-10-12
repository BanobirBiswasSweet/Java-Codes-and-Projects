package NewPrograms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer:: ");
		int r=input.nextInt();
		
		Circle c=new Circle(r);
		
		System.out.println("Area# "+c.getArea());
		
		//c.radius=5;
		c.setRadius(5);
		System.out.println("Area# "+c.getArea());

	}

}
