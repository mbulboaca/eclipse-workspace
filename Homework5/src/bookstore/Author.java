package bookstore;



public class Author {
	String name;
	String surname;
	String dateOfBirth;
	
	
	
	public Author(String name, String surname, String dateOfBirth) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return this.surname + " " + this.name + " " + this.dateOfBirth;
	}
}
