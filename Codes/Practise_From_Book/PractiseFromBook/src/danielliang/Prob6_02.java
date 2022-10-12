package danielliang;

import java.util.Scanner;

public class Prob6_02 {

	    public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       
	       int[] num = new int[10];
	       int[] rev=new int[num.length];
	       
	       System.out.print("Enter the elements::: ");
	       for(int i=0; i<num.length; i++) {
	    	    num[i]=input.nextInt();
	    	   
	       }
	       
	       for(int i=0, j=(num.length-1); i<num.length; i++, j--) {
	    	   
	    	   rev[j]=num[i];
	       }
	       
	       for(int i=0; i<num.length; i++) {
	    	   System.out.println("i["+i+"]="+rev[i]);
	       }
     }
}