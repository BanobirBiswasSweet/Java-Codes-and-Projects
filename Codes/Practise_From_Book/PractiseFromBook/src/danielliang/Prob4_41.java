package danielliang;

import java.util.Scanner;

public class Prob4_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner input=new Scanner(System.in);
				int max=0;
				int c=1;
				int n=1;
				System.out.println("Enter the numbers: ");
				while(n!=0){
					n=input.nextInt();
				   
					if(n>max) {
						max=n;
						c=1;
					}
					else if(n==max)
						c++;
				}
				System.out.println("The max number is: "+max);
				System.out.println("The occurrences of the max number is: "+c);
				input.close();

		}

  }

