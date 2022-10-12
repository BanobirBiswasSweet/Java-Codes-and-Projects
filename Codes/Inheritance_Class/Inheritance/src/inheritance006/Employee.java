package inheritance006;

public class Employee extends Person{
	
	private double salary;
	private int dateOfHiring;
	
	
	public Employee(String name, String type, int id, double payment, double salary, int dateOfHiring) {
		super(name, type, id, payment);
		
		setSalary(salary);
		setDateOfHiring(dateOfHiring);
	}
	
	public void setSalary(double salary) {
		
		this.salary=Math.abs(salary);
		
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	public void setDateOfHiring(int dateOfHiring) {
		
		this.dateOfHiring=dateOfHiring;
	}
	
	public int getDateOfHiring() {
		
		return dateOfHiring;
	}
	
	public String toString() {
		
		return super.toString()+" Salary: "+salary+" Date of hiring: "+dateOfHiring;
	}
	

}
