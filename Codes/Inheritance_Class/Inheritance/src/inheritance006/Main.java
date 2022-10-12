package inheritance006;

public class Main {

	public static void main(String[] args) {
		
        Person P=new Person("Sweet", "Student", 151, 60000.0);
		Employee A=new Employee("Sweet", "Managing Director", 1, 60000.0, 120000, 122015 );
		
		System.out.println(P.toString());
		System.out.println(A.toString());

	}

}
