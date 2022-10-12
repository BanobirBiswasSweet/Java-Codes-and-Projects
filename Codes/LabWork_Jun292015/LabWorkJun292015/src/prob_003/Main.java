package prob_003;

public class Main {

	public static void main(String[] args) {
		
		Account A=new Account(1511, "Shuvro", 1, 500);
		System.out.println(A.toString());
		
		boolean a=A.withdraw(250);
		
		if(a==true)
			System.out.println("Withdraw successful!");
		else
			System.out.println("Withdraw is not successful!");
	}

}