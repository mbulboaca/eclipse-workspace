package employee;

public class Employee {
	private String name; 
	private String surname;
	private int salary; 
	private int age;
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>64) {
		System.out.println("Trebuie sa iesi la pensie");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", salary=" + salary + ", age=" + age + "]";
	}
	
}
