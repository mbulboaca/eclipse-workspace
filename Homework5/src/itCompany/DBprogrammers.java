package itCompany;

public class DBprogrammers extends Employee implements Bonus{

	public DBprogrammers(String name, String surname, int age, double salary) {
		super(name, surname, age, salary);
	}
		public void Bonus() {
			System.out.println("Programmers have bonus");
		}
		
		
}
