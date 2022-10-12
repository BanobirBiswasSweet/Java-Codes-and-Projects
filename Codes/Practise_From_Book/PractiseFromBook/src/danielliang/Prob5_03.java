package danielliang;

import java.util.Scanner;

public class Prob5_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int n=input.nextInt();
		
		boolean bool1=isPalindrome(n);
		if(bool1==true)
			System.out.print("Is The number palindrome? "+bool1);
		else
			System.out.println("Is The number palindrome? "+bool1);
		

	}
	
	public static boolean isPalindrome(int x){
		
	    int reversal=reverse(x);
	    
		boolean bool=false;    
			if(reversal==x) {
				bool=true;
			}
			else {
				 bool=false;
			}
			
			return bool;
	}
	
	public static int reverse(int y) {
		
		int temp=y;
		int rem=0;
		int reversed=0;
		while(temp!=0) {
			rem=temp%10;
			reversed=reversed*10+rem;
			temp=temp/10;
		}
		return reversed;
	   
		
	}	
}
