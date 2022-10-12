package classMid1;

public class Polygon {

	private int n;
	private double side;
	private int x;
	private int y;
	
	public Polygon(){
		n = 3;
		side = 1;
	}
	
	public Polygon(int n, double side, int x, int y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double area(){
		return (n * side * side) / (4 * Math.tan(perimeter() / n));
	}
	
	public double perimeter(){
		return n * side;
	}
}