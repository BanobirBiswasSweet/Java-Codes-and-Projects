package classmid2;

public class Square {

	private Point side1;
	private Point side2;
	
	public Square(Point side1, Point side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	public Point getSide1() {
		return side1;
	}

	public void setSide1(Point side1) {
		this.side1 = side1;
	}

	public Point getSide2() {
		return side2;
	}

	public void setSide2(Point side2) {
		this.side2 = side2;
	}
	
	public double getArea(){
		return Math.pow(side1.distance(side2), 2);
	}
	
	public double getPerimeter(){
		return 4 * side1.distance(side2);
	}
}