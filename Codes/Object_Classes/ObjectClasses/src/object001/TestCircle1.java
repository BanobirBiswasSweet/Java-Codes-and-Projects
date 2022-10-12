package object001;

public class TestCircle1 {
	double radius;
	
	public TestCircle1(){
		radius=1.0;
	}
	
	public TestCircle1(double newRadius) {
		radius=newRadius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
