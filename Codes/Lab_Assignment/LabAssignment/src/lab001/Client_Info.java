package lab001;

public class Client_Info {

	private String name;
	private String address;
	private String phnNmber;
	private String foodType;
	private int numOfPeople;
	private String spclReq;
	private String date;
	private String time;
	private String srvcType;
	private double totalCost;
	private double paid;
	private double owed;
	private String jobStatus;

	public Client_Info(String name, String address, String phnNmber, String foodType, int numOfPeople, String spclReq,
			String date, String time, String srvcType, double totalCost, double paid, String jobStatus) {
		
		
		super();
		this.name = name;
		this.address = address;
		this.phnNmber=phnNmber;
		this.foodType = foodType;
		this.numOfPeople = numOfPeople;
		this.spclReq=spclReq;
		this.date = date;
		this.time = time;
		this.srvcType=srvcType;
		this.totalCost = totalCost;
		this.paid=paid;
		
		
		if(srvcType == "full service")
			{this.paid= (30/100) * this.totalCost;}
		else
			{this.paid = (20/100) * this.totalCost;}
		this.owed = this.totalCost - this.paid;
		this.jobStatus = jobStatus;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhnNmber() {
		return phnNmber;
	}
	
	public void setPhoneNumber(String phnNmber) {
		this.phnNmber=phnNmber;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public int getNumOfPeople() {
		return numOfPeople;
	}
	
	public void setNumOfPople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	
	public String getSpclreq() {
		return spclReq;
	}
	
	public void setSpclReq(String spclReqt) {
		this.spclReq=spclReq;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getSrvcType() {
		return srvcType;
	}
	
	public void setSrvcType(String srvcType) {
		this.srvcType=srvcType;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	public double getPaid() {
		return paid;
	}
	public void setPaid(double paid) {
		this.paid = paid;
	}
	
	public double getOwed() {
		return (totalCost-paid);
		
	}
	
	public void setOwed(double owed){
		
		this.owed=owed;
	}

	public String getJobsStatus() {
		return jobStatus;
	}
	
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String showInfo(){
		return "Client's Name : " + name + "\n"  +"Client's Address: " + address + "\n" + "Client's Phone number : " + phnNmber + "\n"
        + "Food type : " + foodType + "\n" + "Number Of People : " + numOfPeople + "\n" + "Special Requirment :" + spclReq + "\n"
		 + "Booking Date : " + date + "\n" + "Booking Time : " + time + "\n" + "Service type : " + srvcType + "\n"
		 + "Total Cost : " + totalCost + "\n" + "Paid Amount : " +paid + "\n"
		 + "Owed Amount : " + getOwed() + "\n" + "Job Status : " + jobStatus + "\n";
		
		}
}
