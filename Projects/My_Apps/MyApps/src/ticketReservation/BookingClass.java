package ticketReservation;

public class BookingClass {

	private String name;
	private String address;
	private String phone;
	private String email;
	
	public BookingClass(String name, String address, String phone, String email){
		
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		
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
	
	public void setPhone(String phone){
		
		this.phone=phone;
	}
	
	public String getPhone(){
		
		return phone;
	}
	
	public void setEmail(String email){
		
		this.email=email;
	}
	
	public String getEmail(){
		
		return email;
	}
}
