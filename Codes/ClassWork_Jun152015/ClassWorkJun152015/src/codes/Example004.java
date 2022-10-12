package codes;

public class Example004 {

	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("x = " + x);
		
		passValue(x);
		
		System.out.println("x = " + x);
		
		
	}

	public static void passValue(int x){
		
		x = 7;
	}
	
	
}
