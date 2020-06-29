package overriding;

public class SchoolApp {

	public static void main(String[] args) {
		
		MathsTeacher m1 = new MathsTeacher(); 
		MathsTeacher m2 = new MathsTeacher(); 
		m1.name = "Adrian"; 
		m1.action();
		PhysicsTeacher p1 = new PhysicsTeacher(); 
		p1.name = "Rodica" ;
		Teacher t = new Teacher();
		
		
		
		t.action();
		m1.action();
		p1.action();
		m2.name = "Marius"; 
		
		Teacher[] list = {m1, m2, p1, t}; 
		
		for(int i = 0; i<list.length; i++) {
			list[i].action();
		}

	}

}
