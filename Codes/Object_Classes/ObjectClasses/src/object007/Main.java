package object007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Polygon[] polygons=new Polygon[5];
		
		for(int i=0; i<polygons.length; i++){
			
			System.out.println("Enter n and side value for polygon["+i+"] ::");
			int n=input.nextInt();
			double side=input.nextInt();
			 polygons[i]= new Polygon(n, side);
		}
		
		System.out.println("\n");
		
        for(int i=0; i<polygons.length; i++){
			
			System.out.println("Perimeter of polygon["+i+"] ::"+polygons[i].perimeter());
        }
        
        System.out.println("\n");
		
        for(int i=0; i<polygons.length; i++){
			
			System.out.println("Area of polygon["+i+"] ::"+polygons[i].area());
        }
		

	}

}
