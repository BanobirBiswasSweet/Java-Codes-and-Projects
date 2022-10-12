package mid_1;

import java.util.Scanner;

public class Polygon_Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		Polygon[] polygon=new Polygon[5];
		
		System.out.println("Enter the values of n and side for ploygon 1#: ");
		int n1=input.nextInt();
		double side1=input.nextDouble();
		polygon[0]=new Polygon(n1, side1);
		
		System.out.println("Enter the values of n and side for ploygon 2#: ");
		int n2=input.nextInt();
		double side2=input.nextDouble();
		polygon[1]=new Polygon(n2, side2);
		
		System.out.println("Enter the values of n and side for ploygon 3#: ");
		int n3=input.nextInt();
		double side3=input.nextDouble();
		polygon[2]=new Polygon(n3, side3);
		
		System.out.println("Enter the values of n and side for ploygon 4#: ");
		int n4=input.nextInt();
		double side4=input.nextDouble();
		polygon[3]=new Polygon(n4, side4);
		
		System.out.println("Enter the values of n and side for ploygon 5#: ");
		int n5=input.nextInt();
		double side5=input.nextDouble();
		polygon[4]=new Polygon(n5, side5);
		
		input.close();
		
		for(int i=0; i<polygon.length; i++){
			
			System.out.println("Area of polygon["+i+"]#: "+polygon[i].area());
			System.out.println("Perimeter of polygon["+i+"]#: "+polygon[i].perimeter());
		}

	}

}
