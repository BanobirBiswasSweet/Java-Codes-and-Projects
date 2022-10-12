package test;

import java.util.Scanner;

public class FarenheitToCelsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value in Farenheit: ");
		double farenheit=input.nextDouble();
		double celsius=(5.0/9)*(farenheit-32);
		System.out.print("The deisred value is: "+celsius);
		input.close();

	}

}
