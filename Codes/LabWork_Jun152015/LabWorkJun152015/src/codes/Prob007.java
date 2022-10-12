package codes;
import java.util.Scanner;

public class Prob007 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter two integers::: ");
		int a=input.nextInt();
		int b=input.nextInt();
		
		for(int i=a; i<b; i++){
			int k=isprime(i);
			if(k==1)
				System.out.println(i);
		}
	}

	public static int isprime(int x){
		for(int i=2; i<x; i++){
			if(x%i==0){
				return 0;
			}
				
		}
		return 1;	
		
	}

}
