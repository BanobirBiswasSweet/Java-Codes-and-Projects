package inheritance005;

public class Account {
	
	private int account_Number;
	private double balance;
	private double annual_Interest_Rate;
	private int creation_Date;
	
	
	public Account(int account_Number, double balance, double annual_Interest_Rate, int creation_Date) {
		
		this.account_Number=Math.abs(account_Number);
		this.balance=Math.abs(balance);
		this.annual_Interest_Rate=Math.abs(annual_Interest_Rate);
		this.creation_Date=creation_Date;
	}
	
	public void setAccount_Number(int account_Number) {
		
		this.account_Number=Math.abs(account_Number);
	}
	
	public int getAccount_Number() {
		
		return account_Number;
	}
	
	public void setBalance(double balance) {
		
		this.balance=Math.abs(balance);
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public void setAnnual_Interest_Rate(double annual_Interest_Rate) {
		
		this.annual_Interest_Rate=Math.abs(annual_Interest_Rate);
	}
	
	public double getAnnual_Interest_Rate() {
		
		return annual_Interest_Rate;
		
	}
	
	public void setCration_Date(int creation_Date) {
		
		this.creation_Date=creation_Date;
		
	}
	
	public int getCreation_Date() {
		
		return creation_Date;
		
	}

}
