package codes;

import java.util.Scanner;

public class Prob002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value of a & b: ");
		int a=input.nextInt();
		int b=input.nextInt();
	    int n=a;
		
		while(n<=b){
			int flag=1;
			for(int i=2; i<n; i++){
				if(n%i==0){
					flag=0;
					break;
				}
			}
			
			if(flag==1)
				System.out.println(n);
			
			n++;
			}
		input.close();

	}

}
