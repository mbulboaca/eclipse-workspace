package zoo;

public class Lions extends Animals implements Mammals, Asia{

	public Lions(String name, int age, String type, String origin) {
		super(name, age, type, origin);
		
	}
	public void origin() {
		System.out.println("This animal is from Asia");

	}
	
	
	@Override
	public String toString() {
		return "Lions [name=" + name + ", age=" + age + ", type=" + type + ", origin=" + origin + "]";
	}
	public void type() { 
		System.out.println("Mammal");
	}
}
