package classmid2;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 2, 4);
		Triangle t2 = new Triangle(1, 6, 7);
		System.out.println(t1.getX() + ", " + t1.getY() + ", " + t1.getZ() + " area:" + t1.area() + ", perimeter:" + t1.perimeter());
		System.out.println(t2.getX() + ", " + t2.getY() + ", " + t2.getZ() + " area:" + t2.area() + ", perimeter:" + t2.perimeter());
	}
}