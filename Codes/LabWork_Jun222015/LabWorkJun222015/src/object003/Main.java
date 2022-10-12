package object003;

public class Main {

	public static void main(String[] args) {
		
		Student s1=new Student("Sweet", "Male", 20, "CSE", 1511168042);
		Student s2=new Student("Adriti", "Female", 18, "CSE", 1521168042);
		
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.age);
		System.out.println(s1.dept);
		System.out.println(s1.id);
		
		System.out.println(s2.name);
		System.out.println(s2.gender);
		System.out.println(s2.age);
		System.out.println(s2.dept);
		System.out.println(s2.id);

	}

}
