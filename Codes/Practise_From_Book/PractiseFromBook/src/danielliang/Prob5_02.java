package danielliang;

import java.util.Scanner;

public class Prob5_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an integer:: ");
		int n=input.nextInt();
		
		int print=sumDigits(n);
		System.out.println("Sum is:: "+print);
		input.close();
		

	}
	
	public static int sumDigits(int x) {
		int rem=0;
		int sum=0;
		while(x!=0) {
			rem=(int)x%10;
			x=x/10;
			sum=sum+rem;
		}
		
		return sum;
	}

}
