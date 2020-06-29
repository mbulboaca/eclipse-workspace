package employee;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee e1 = new Employee(); 
		e1.setAge(25);
		e1.setName("Emi");
		e1.setSurname("Mihai");
		e1.setSalary(2000);
		

		Employee e2 = new Employee(); 
		e2.setAge(25);
		e2.setName("Adi");
		e2.setSurname("Jucaru");
		

		Employee e3 = new Employee(); 
		e3.setAge(65);
		e3.setName("Alex");
		e3.setSurname("Marinescu");
		e3.setSalary(7000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
