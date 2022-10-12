package danielliang;

import java.util.Scanner;

public class Prob5_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
			
			System.out.println("Enter an integer: ");
			int n=input.nextInt();
			
			int reversed=reverse(n);
			System.out.println("Reversed number is: "+reversed);
		
   }
		
		public static int reverse(int y) {
			
			int temp=y;
			int rem=0;
			int reverse=0;
			while(temp!=0) {
				rem=temp%10;
				reverse=reverse*10+rem;
				temp=temp/10;
			}
			return reverse;
		}

	}
