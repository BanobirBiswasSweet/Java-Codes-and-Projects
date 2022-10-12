package danielliang;
import java.util.Scanner;

public class Prob5_26 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter two integers::: ");
		int a=input.nextInt();
		int b=input.nextInt();
		
		for(int i=a; i<b; i++){
			int k=isprime(i);
			int l=reversal(i);
				
			if(k==1 && l==1)
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
	
    public static int reversal(int y) {
		int rem=0;
		int reverse=0;
		int temp=y;
		while(y!=0) {	
		   rem=temp%10;
		   reverse=reverse*10+rem;
		   temp=rem/10;
		}
		   if(reverse==y) {
			return 1;
		   }
		return 0;
		
	}

}
