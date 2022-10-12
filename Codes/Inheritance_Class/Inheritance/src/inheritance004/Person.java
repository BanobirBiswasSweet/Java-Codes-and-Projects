package inheritance004;

public class Person {
	
	private String name;
	private String address;
	private int phnnmber;
	private String email;
	
	
	public Person(String name, String address, int phnnmber, String email) {
		
		this.name=name;
		this.address=address;
		this.phnnmber=phnnmber;
		this.email=email;
		
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAddress(String address) {
		
		this.address=address;
	}
	
	public String getAddress() {
		
		return address;
	}
	
	public void setPhnnmber(int phnnmber) {
		
		this.phnnmber=phnnmber;
	}
	
	public int getPhnnmber() {
		
		return phnnmber;
	}
	
	public void setEmail(String email) {
		
		this.email=email;
	}
	
	public String getEmail() {
		
		return email;
	}

}
