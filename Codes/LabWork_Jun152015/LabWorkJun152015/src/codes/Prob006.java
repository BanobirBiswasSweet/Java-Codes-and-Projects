package codes;
import java.util.Scanner;

public class Prob006 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n=input.nextInt();
		
		isprime(n);
		
		input.close();

	}
	public static int isprime(int x){
		int flag=1;
		for(int i=2; i<x; i++){
			if(x%i==0)
				flag=0;
				break;
			
		}
		
		if(flag==0)
		System.out.print("Number is not prime.");
		
		else
		System.out.print("Number is prime.");
		
		return flag;
		
	}

}
