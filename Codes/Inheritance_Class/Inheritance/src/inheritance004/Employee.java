package inheritance004;

public class Employee {
	
	private Person person;
	private String office;
	private double salary;
	private int date;
	
	
	public Employee(Person person, String office, double salary, int date) {
		
		this.person=person;
		this.office=office;
		this.salary=salary;
		this.date=date;
	}
	
	public void setPerson(Person person) {
		
		this.person=person;
	}
	
	public Person getPerson() {
		
		return person;
	}
	
	public void setOffice(String office) {
		
		this.office=office;
	}
	
	public String getOffice() {
		
		return office;
	}
	
	public void setSalary(double salary) {
		
		this.salary=salary;
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	public void setDate(int date) {
		
		this.date=date;
	}
	
	public int getDate() {
		
		return date;
	}

}
