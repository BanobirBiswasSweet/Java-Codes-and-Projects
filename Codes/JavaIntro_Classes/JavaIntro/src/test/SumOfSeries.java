package test;
import java.util.Scanner;

public class SumOfSeries {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
	    int a=input.nextInt();
	  
	        int z, sum1, sum2, sum;
	        sum1=0;
	        sum2=0;
	        sum=0;
	        if(a%2!=0){
	            for(z=a; z>=1; z--)
	            {
	                if(z%2==0){
	                    sum1 = sum1 + (z*z);
	                }
	                else{
	                    sum2 = sum2 + (z*z);
	                }
	            }
	            sum = (sum2-sum1);
	        }
	        else if(a%2==0){
	            for(z=a; z>=1; z--)
	            {
	                if(z%2==0){
	                    sum1 = sum1 + (z*z);
	                }
	                else{
	                    sum2 = sum2 + (z*z);
	                }
	            }
	            sum = (sum1 - sum2);
	    }
	        System.out.print("Sum is: "+sum);
	        input.close();

	}

}
