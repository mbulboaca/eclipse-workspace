
public class Student implements Comparable {
	String name; 
	int age; 
	String university;
	boolean gender; 
	

	public Student(String name, int age, String university, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.university = university;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", university=" + university + ", gender=" + gender
				+ "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Student studentToCompare = (Student) arg0; 
		
		return age-studentToCompare.age;
	}
	
}
