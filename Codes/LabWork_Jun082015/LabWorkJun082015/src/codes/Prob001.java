package codes;

import java.util.Scanner;

public class Prob001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input=new Scanner(System.in);
			System.out.println("Enter a value: ");
			int n=input.nextInt();
			int flag=1;
			for(int i=2; i<(n/2)+1; i++){
				if(n%i==0){
					flag=0;
					break;
				}
			}
			
			if(flag==1)
				System.out.println("The number is prime!");
			else
				System.out.println("The number is not prime!");
			input.close();

	}

}
