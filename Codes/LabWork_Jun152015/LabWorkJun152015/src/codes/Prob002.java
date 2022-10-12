package codes;

import java.util.Scanner;

public class Prob002 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an intefger::: ");
		int x=input.nextInt();
		
		divisble(x);
		
		input.close();
	}
	
	public static int divisble(int n){
		
		if(n%5!=0 && n%6!=0)
			System.out.println(n+" is not divisible by both either 5 or 6.");
		else if(n%5==0 && n%6==0)
			System.out.println(n+" is divisible by both 5 and 6.");
		else if(n%5==0 || n%6==0)
			System.out.println(n+" is divisible by 5 or 6 but not both.");
		return n;

	}

}
