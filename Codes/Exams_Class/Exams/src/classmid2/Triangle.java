package classmid2;

public class Triangle {

	private double x;
	private double y;
	private double z;
	
	public Triangle(double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		if(x > 0){
			this.x = x;
		}
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		if(y > 0){
			this.y = y;
		}
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		if(z > 0){
			this.z = z;
		}
	}
	
	public double area(){
		double s = perimeter() / 2.0;
		return Math.sqrt(s * (s - x) * (s - y) * (s - z));
	}
	
	public double perimeter(){
		return x + y + z;
	}
}