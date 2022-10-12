package classmid2;

public class PyramidMain {

	public static void main(String[] args) {
		Pyramid p = new Pyramid(new Point(1, 2), new Point(4, 6), 20);
		System.out.println(p.getVolume());
		System.out.println(p.getPerimeter());
		System.out.println(p.getHeight());
		System.out.println(p.getSide1());
		System.out.println(p.getSide2());
	}
}