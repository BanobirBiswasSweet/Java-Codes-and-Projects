package inheritance003;

public class Rectangle extends GeometricShape {
	
	public Rectangle(double slide1, double slide2, double slide3) {
		
		super(slide1, slide2, slide3);
	}
	
	public double getArea() {
		
		return 0.5*super.getSlide2()*super.getSlide3();
	}
	
	public double getPerimeter() {
		
		return super.getSlide1()+super.getSlide2()+super.getSlide3();
	}
	
	public String toString() {
		
		return "Triangle:Slide1= "+super.getSlide1()+" Trinagle:Slide2= "+super.getSlide2()+" Trinagle:Slide3= "+super.getSlide3();
	}
	
	

}
