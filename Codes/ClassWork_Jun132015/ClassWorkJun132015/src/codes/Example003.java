package codes;

import java.util.Scanner;

public class Example003 {

	public static void main(String[] args) {
		
		double[] original = new double[5];
		double[] reverse = new double[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < original.length; i++){
			
			System.out.print("Enter the value for original[" + i + "] ::: ");
			original[i] = input.nextDouble();
		}
	
		for(int i = 0, j = original.length - 1; i < original.length; i++,j--){
			
				reverse[i] = original[j];
			
		}
		
		
		for(int i = 0; i < reverse.length; i++){
			System.out.println("reverse[" + i + "] = " + reverse[i]);
		}
		
	}

}
