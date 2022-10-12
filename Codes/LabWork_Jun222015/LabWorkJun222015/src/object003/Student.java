package object003;

public class Student {
	
	public String name;
	public String gender;
	public int age;
	public String dept;
	public int id;
	
	public Student(String name, String gender, int age, String dept, int id) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.dept=dept;
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setGender(String gender) {
		
		this.gender=gender;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public void setDept(String dept) {
		
		this.dept=dept;
	}
	
	public void setId(int id) {
	
	this.id=id;
	}
	
	public String getName(String name) {
	    return name;
	}
	
	public String getGender(String gender) {
		
		return gender;
	}
	
	public int getAge(int age) {
		
		return age;
	}
	
	public String getDept(String dept) {
		
		return dept;
	}
	
	public int getId(int id) {
	
	   return id;
	}

}
