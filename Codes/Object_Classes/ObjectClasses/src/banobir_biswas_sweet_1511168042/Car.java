package banobir_biswas_sweet_1511168042;

public class Car {
	
	private String brand;
	private String model;
	private double tireRadius;
	
	public Car(String brand, String model, double tireRadius){
		
		this.brand=brand;
		this.model=model;
		this.tireRadius=tireRadius;
	}
	
	public String getBrand(){
		
		return brand;
	}
	
	public String getModel(){
		
		return model;
	}
	
	public double getitreRadius(){
		return tireRadius;
	}
	
    public void setBrand(String brand){
		
		this.brand=brand;
	}
	
	public void setModel(String model){
		
		this.model=model;
	}
	
	public void setitreRadius(double tireRadius){
		this.tireRadius= tireRadius;
	}
	
	public double getSpeed(){
		
		return 14400*Math.PI*tireRadius;
	}
	
	public boolean hasmoreSpeed(Car c){
		
		if(tireRadius>c.tireRadius)
			return true;
		else
			return false;
			
	}

}
