package prob_001;

public class Main {
	
	public static void main(String[] args) {
		
		Point A=new Point(4, 6);
		Point B=new Point(2, 4);
		
		System.out.println("For point A, Values of x & y:: "+A.toString());
		System.out.println("For point B, Values of x & y:: "+B.toString());
		
		
		System.out.println("Distance is:: "+A.distance(B));

	}

}
