package inheritance003;

public class GeometricShape {
	
	private double slide1;
	private double slide2;
	private double slide3;
	
	public GeometricShape(double slide1, double slide2, double slide3) {
		
		this.slide1=Math.abs(slide1);
		this.slide2=Math.abs(slide2);
		this.slide3=Math.abs(slide3);
	}
	
	public void setSlide1(double slide1) {
		
		this.slide1=Math.abs(slide1);
	}
	
	public double getSlide1() {
		
		return slide1;
	}
	
    public void setSlide2(double slide2) {
		
		this.slide2=Math.abs(slide2);
	}
	
	public double getSlide2() {
		
		return slide2;
	}
	
    public void setSlide3(double slide3) {
		
		this.slide3=Math.abs(slide3);
	}
	
	public double getSlide3() {
		
		return slide3;
	}
	
	

}
