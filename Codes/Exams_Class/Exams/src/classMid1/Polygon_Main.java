package classMid1;

import java.util.Scanner;

public class Polygon_Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Polygon[] polygons=new Polygon[5];
		
		System.out.println("Enter the values of side and n::: ");
		
		for(int i=0; i<polygons.length; i++) {
			
			double side=input.nextDouble();
			int n=input.nextInt();
			int x=input.nextInt();
			int y=input.nextInt();
			polygons[i]=new Polygon(n, side, x, y);
			
		}
		
		input.close();
		
		for(int j=0; j<polygons.length; j++) {
			
			System.out.println("Area is::: "+polygons[j].area());
		}
		
        for(int k=0; k<polygons.length; k++) {
			
			System.out.println("Area is::: "+polygons[k].perimeter());
		}
		

	}

}
