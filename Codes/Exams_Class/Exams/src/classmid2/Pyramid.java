package classmid2;

public class Pyramid extends Square {

	private double height;

	public Pyramid(Point side1, Point side2, double height) {
		super(side1, side2);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume(){
		return getArea() * height / 3.0;
	}
	
	public double getSurfaceArea(){
		return getArea() + getPerimeter() * 0.5 * Math.sqrt(Math.pow(getPerimeter() / 8, 2) + height * height);
	}
}