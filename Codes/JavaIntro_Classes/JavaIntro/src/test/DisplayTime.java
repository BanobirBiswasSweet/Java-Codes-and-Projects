package test;

import java.util.Scanner;

public class DisplayTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter time in seconds: ");
		int seconds=input.nextInt();
		int minutes=seconds/60;
		int remainingSeconds=seconds%60;
		System.out.println(seconds+ " is "+minutes+" minutes and "+remainingSeconds+" seconds");
		input.close();

	}

}
