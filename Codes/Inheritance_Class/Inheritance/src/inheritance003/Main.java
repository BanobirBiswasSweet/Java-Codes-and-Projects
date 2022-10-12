package inheritance003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Rectangle A=new Rectangle(1.0, 1.0 , 1.0);
		
		System.out.println("Before changing anything!!");
		System.out.println(A.toString());
		System.out.println("Area is:: "+A.getArea());
		System.out.println("Perimeter is:: "+A.getPerimeter());
		
		System.out.println("Enter the value of slide1::");
		double slide1=input.nextDouble();
		A.setSlide1(slide1);
		
		
		System.out.println("Enter the value of slide2::");
		double slide2=input.nextDouble();
		A.setSlide2(slide2);
		
		
		System.out.println("Enter the value of slide3::");
		double slide3=input.nextDouble();
		A.setSlide3(slide3);
		
		System.out.println("After changing the values of slides!!");
		System.out.println(A.toString());
		System.out.println("Area is:: "+A.getArea());
		System.out.println("Perimeter is:: "+A.getPerimeter());
		
		input.close();

	}

}
