package codes;

public class Example008 {

	public static void main(String[] args) {
		
		double[] a = {2.3 , 5.6 , 7.9 , 8.2};
		
		arrayPass(a);
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
		
	}
	
	public static void arrayPass(double[] nums){
		
		for(int i = 0; i < nums.length; i++)
			nums[i] = nums[i] + 7;
		
		
	}
	
	

}
