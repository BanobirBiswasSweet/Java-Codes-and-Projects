package inheritance006;

public class Person {
	
	private String name;
	private String type;
	private int id;
	private double payment;
	
	public Person(String name, String type, int id, double payment) {
		
		this.name=name;
		this.type=type;
		this.id=Math.abs(id);
		this.payment=Math.abs(payment);
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setType(String type) {
		
		this.type=type;
	}
	
	public String getType() {
		
		return type;
	}
	
	public void setID(int id) {
		
		this.id=Math.abs(id);
	}
	
	public int getID() {
		
		return id;
	}
	
	public void setPayment() {
		
		this.payment=Math.abs(payment);
	}
	
	public double getPayment() {
		
		return payment;
	}
	
	public String toString() {
		
		return "Name: "+name+" Type: "+type+" ID: "+id+" Payment: "+payment;
	}

}
