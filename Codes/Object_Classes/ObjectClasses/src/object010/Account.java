package object010;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterest;
	private String dateCreated;
	private double withdraw;
	
	public Account() {
		
		id=0;
		balance=0.0;
	}
	
	public Account(int id, double balance, double annualInterest, String dateCreated) {
		
		this.id=id;
		this.balance=balance;
		this.annualInterest=annualInterest;
		this.dateCreated=dateCreated;
	}
	
	public void setID(int id) {
		
		this.id=id;
	}
	
	public int getID() {
		
		return id;
	}
	
	public void setBalance(double balance) {
		
		this.balance=balance;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public void setAnnualInterest(double annualInterest) {
		
		this.annualInterest=annualInterest;
	}
	
	public double getAnnualInterest() {
		
		return annualInterest*getBalance();
	}
	
	public void setDateCreated(String dateCreated) {
		
		this.dateCreated=dateCreated;
	}
	
	public String getDateCreated() {
		
		return dateCreated;
	}
	
	public double getMonthlyInterest() {
		
		return getAnnualInterest()/12;
	}
	
	public void setWithdraw(double withdraw) {
		
		this.withdraw=withdraw;
	}
	
	public double getWithdraw() {
		
		return withdraw;
	}
	
	public void setDeposit(double balance) {
		
		double pay=Math.abs(balance-getWithdraw());
		balance=pay;
	}
	
	public double getDeposit() {
		
		return balance;
	}

}
