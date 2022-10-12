package danielliang;
import java.util.Scanner;

public class Prob6_15 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("Please enter numbers ::: ");
	        int[] tenNumbers = new int[5];
	        for (int i=0; i<5; i++)
	        {
	           tenNumbers[i] = input.nextInt();
	           
	        }  
	        
	        System.out.println("Refreshed list of numbers:: ");
	        int[] newArray = eliminateDuplicates(tenNumbers);
	        for(int i=0;i<newArray.length;i++){
	              System.out.println(newArray[i]);
	        }
	       
	     }

	  public static int[] eliminateDuplicates (int[] numbers)
	     {
	        int count = 0; 
	        
	        for (int i = 0; i < numbers.length; i++)
	           {
	            for (int j = i + 1; j < numbers.length; j++)
	              {

	                 if(numbers[i] == numbers[j])
	                    {
	                       numbers[i]=-1;;
	                    }                       
	              }      
	           }


	        for (int i = 0; i < numbers.length; i++)
	           {
	              if(numbers[i]!=-1)
	                 {
	                    count++;
	                 }

	           }
	        int[] array2 = new int[count]; 
	        int newCount = 0;
	        for (int i = 0; i < numbers.length; i++)
	           {
	              if(numbers[i]!=-1)
	                 {
	                    array2[newCount] = numbers[i];
	                    newCount++;
	                 }                  
	           }      

	        return array2;
	     }   

	   


	}