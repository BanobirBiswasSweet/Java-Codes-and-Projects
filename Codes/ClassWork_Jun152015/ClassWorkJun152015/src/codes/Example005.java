package codes;

public class Example005 {

	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("x = " + x);
		
		x = passValue(x);
		
		System.out.println("x = " + x);
		
		
	}

	public static int passValue(int x){
		
		x = 7;
		
		return x;
	}

}
