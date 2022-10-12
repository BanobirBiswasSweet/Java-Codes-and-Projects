package object010;

public class Main {

	public static void main(String[] args) {
		
		Account A=new Account(1122, 20000.0, 4.5, "02-08-2013");
		
		System.out.println("Account ID: "+A.getID());
		System.out.println("Account Balance: "+A.getBalance());
		System.out.println("Annual Interest: "+A.getAnnualInterest());
		System.out.println("Date Created: "+A.getDateCreated());
		System.out.println("Monthly Interest: "+A.getMonthlyInterest());
		
		A.setWithdraw(2500.0);
		System.out.println("Withdraw: "+A.getWithdraw());
		
		System.out.println("Deposit: "+A.getDeposit());

	}

}
