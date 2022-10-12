package inheritance004;

public class Main {

	public static void main(String[] args) {

		Person p=new Person("Sweet", "Green House", 1726362036, "info.gateway66@gmail.com");
		Employee e=new Employee(p,"Banani", 120000.00, 7152013);
		
		System.out.println("Name:: "+e.getPerson().getName());
		System.out.println("Address:: "+e.getPerson().getAddress());
		System.out.println("Contact Numbe:: "+e.getPerson().getPhnnmber());
		System.out.println("Email Address:: "+e.getPerson().getEmail());
		System.out.println("Office Branch:: "+e.getOffice());
		System.out.println("Salary Amount:: "+e.getSalary());
		System.out.println("Hiring Date:: "+e.getDate());

	}

}
