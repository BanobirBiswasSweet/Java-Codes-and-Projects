package prob_003;

public class Account {
	int ID;
	String name;
	int accType;
	double balance;
	
	public Account(int Id, String name, int accType, double balance){
		this.ID=Id;
		this.name=name;
		this.accType=accType;
		this.balance=balance;
	}
	
	public void setId(int ID){
		this.ID=ID;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAccType(int accType){
		this.accType=accType;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public int getId(int ID){
		return ID;
	}
	
	public String getName(String name){
		return name;
	}
	
	public int getAccType(int accType){
		return accType;
	}
	
	public double getBalance(double balance){
		return balance;
	}
	
	public String toString(){
		return "("+ID+","+name+","+accType+","+balance+")";
	}
	
	/*public void deposit(double amount){
		double pay=balance-amount;
		balance=pay;
	}*/
	
	public boolean withdraw(double amount){
		if(balance>amount){
			if(accType==1){
				return true;
			}
			else{
				return false;
			}
		}
		else if(accType==2){
			return false;
		}
		else
			return true;
		
			
		}
	}
	
