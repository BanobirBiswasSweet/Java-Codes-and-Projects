package stockDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the previous price:: ");
		double pre=input.nextDouble();
		
		System.out.println("Enter the current price:: ");
		double cur=input.nextDouble();
		
		Stock s=new Stock("A", "Product1", pre, cur);
		
		System.out.println("Previous Price:: "+s.getPreviousPrice()+" Dollars");
		System.out.println("Current Price:: "+s.getCurrentPrice()+" Dollars");
		System.out.println("Price change percentage:: "+s.getChangePercent()+"%");
		

		

	}

}
