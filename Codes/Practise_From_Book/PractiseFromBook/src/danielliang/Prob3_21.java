package danielliang;

import java.util.Scanner;

public class Prob3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year in number: ");
		
		int k=input.nextInt();
		int j=k/100;
		
		System.out.println("Enter the month in number(1-12): ");
		int m=input.nextInt();
		
		System.out.println("Enter the day of the month in number(1-31): ");
		int q=input.nextInt();
		
		int h=(q+(26*(m+1)/10)+k+(k/4)+(j/4)+(5*j))%7;
		if(h==1)
			System.out.println("The day of the week is Saturday.");
		
		else if(h==2)
			System.out.println("The day of the week is Sunday.");
		
		else if(h==3)
			System.out.println("The day of the week is Monday.");
		
		else if(h==4)
			System.out.println("The day of the week is Tuesday.");
		
		else if(h==5)
			System.out.println("The day of the week is Wednesday.");
		
		else if(h==6)
			System.out.println("The day of the week is Thursday.");
		
		else if(h==7)
			System.out.println("The day of the week is Friday.");
		input.close();

	}

}
