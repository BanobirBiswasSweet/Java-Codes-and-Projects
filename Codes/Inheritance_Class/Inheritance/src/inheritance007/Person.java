package inheritance007;

public class Person {
	
	private String name;
	private String address;
	private int phnnmbr;
	private String email;
	
	public Person(String name, String address, int phnnmbr, String email){
		
		this.name=name;
		this.address=address;
		this.phnnmbr=phnnmbr;
		this.email=email;
	}
	
	public void setName(String name){
		
		this.name=name;
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setAddress(String address){
		
		this.address=address;
	}
	
	public String getAddress(){
		
		return address;
	}
	
	public void setPhnnmbr(int phnnmbr){
		
		this.phnnmbr=phnnmbr;
	}
	
	public int getPhnnmbr(){
		
		return phnnmbr;
	}
	
	public void setEmail(String email){
		
		this.email=email;
	}
	
	public String getEmail(){
		
		return email;
	}

}
