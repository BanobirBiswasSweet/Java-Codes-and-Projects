package guessgame;

import java.util.Random;
import java.util.Scanner;

public class Codes {

	public static void main(String[] args) {

		boolean bool;
	    int a,b;
	    Scanner sc=new Scanner(System.in);
	    Random rn=new Random();
	    
	    while(true)
	    {
	    	a=rn.nextInt(10);
	    	System.out.println("choosing bewteen 0 to 10 is done:");
	    	bool=true;
	    	while(true)
	    	{
	    		System.out.println("Enter your guess:");
	    		b=sc.nextInt();
	    		
	    		if(b>a)
	    			System.out.println("Too high!! . try again:");
	    		else if(b<a)
	    			System.out.println("Too low!! . try again:");
	    		else{System.out.println("Excellent!!! Guessed right !!!");	
	    				bool=false;
	    		}
	    	}
	    }
	}

}
