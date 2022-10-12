package codes;

public class Example002 {

	public static void main(String[] args) {
		
			int[] nums = {1,5,7,9};
		
			int sum = 0;
			
			double avg;
			
			for(int i = 0; i < nums.length; i++){
				
				sum = sum + nums[i];
			}
			
			System.out.println("Sum = " + sum);
		
			avg = (double)sum/nums.length;
		
			System.out.println("Avg = " + avg);
			
	}

}
