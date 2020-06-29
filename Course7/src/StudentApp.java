import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student("Marius", 21, "Poli", true);
		Student s2 = new Student("Jimi", 24, "UCDC", true);
		Student s3 = new Student("Laura", 28, "Poli", false);
		Student s4 = new Student("Vasile", 26, "ASE", true);
		Student s5 = new Student("Oana", 18, "Poli", false);
	
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, new NameComparator());
		
		System.out.println(list);
	}
	

}
