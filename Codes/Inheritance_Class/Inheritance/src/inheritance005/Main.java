package inheritance005;

public class Main {

	public static void main(String[] args) {

		Account A=new Account (151, 120000.50, 2.50, 2072012);
		SavingsAccount S=new SavingsAccount(A, 1200.30, 128.75);
		
		System.out.println("Account Nummber:: "+S.getA().getAccount_Number());
		System.out.println("Balance Of the Account:: "+S.getA().getBalance());
		System.out.println("Annual Interest Rate:: "+S.getA().getAnnual_Interest_Rate());
		System.out.println("Creation Date:: "+S.getA().getCreation_Date());
		System.out.println("Deposit:: "+S.getDeposit());
		System.out.println("Withdraw:: "+S.getWithdraw());
		System.out.println(S.toString());
		

	}

}
