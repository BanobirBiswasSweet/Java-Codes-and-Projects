package codes;

public class Example001 {

	public static void main(String[] args) {
		
		int[] x = {3,6,8,5,4};
		int[] y = arrayReturn(x);
		
		for(int i = 0; i < y.length; i++)
			System.out.println("y[" + i + "] = " + y[i]);
		
	}

	public static int[] arrayReturn(int[] original){
		
		int[] fresh = new int[original.length];
		
		for(int i = 0; i < original.length; i++){
			
			if(original[i] % 2 == 0)	
				fresh[i] = 0;
			else
				fresh[i] = 1;
			
		}
		
		return fresh;
		
	}
	
	
}
