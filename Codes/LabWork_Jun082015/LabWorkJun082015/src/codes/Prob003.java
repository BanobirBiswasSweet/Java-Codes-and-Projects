package codes;

import java.util.Scanner;

public class Prob003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		int sum=0;
		int flag=0;
		for(int i=1; i<n; i++){
			if(n%i==0){
				sum=sum+i;
				if(sum==n)
					flag=1;
			}
	   }
		if(flag==1)
			System.out.println("The number is perfect!!");
		else
			System.out.print("The number is not perfect!!");
		input.close();

	}

}
