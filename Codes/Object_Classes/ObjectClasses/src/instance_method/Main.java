package instance_method;

public class Main {

	public static void main(String[] args) {
		
		Class a = new Class();
		 int j=a.i; // OK, a.i accesses the object's instance variable
		 
		 int value=a.m2(5, 2);
		 System.out.println("Value is:: "+value);
		 }

 }
