package inheritance005;

public class SavingsAccount {
	
	private Account A;
	private double deposit;
	private double withdraw;
	
	public SavingsAccount(Account A, double deposit, double withdraw) {
		
		this.A=A;
		this.deposit=Math.abs(deposit);
		this.withdraw=Math.abs(withdraw);
	}
	
	public void setA(Account A) {
		
		this.A=A;
	}
	
	public Account getA() {
		
		return A;
	}
	
	public void setDeposit(double deposit) {
		
		this.deposit=Math.abs(deposit);
		
	}
	
	public double getDeposit() {
		
		return deposit;
	}
	
	public void setWithdraw(double withdraw) {
		
		this.withdraw=Math.abs(withdraw);
		
	}
	
	public double getWithdraw() {
		
		return withdraw;
	}
	
	
	public String toString() {
		
		return "Savings Account can't be withdrawn.";
	}

}
