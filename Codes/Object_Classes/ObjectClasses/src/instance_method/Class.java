package instance_method;

public class Class {
	
		 int i = 5;
		 static int k = 2;
		
		 public void m1() {
		 i = i + k + m2(i, k);
		 }
		
		 public static int m2(int i, int j) {
		 return (int)(Math.pow(i, j));
		 }
 }

