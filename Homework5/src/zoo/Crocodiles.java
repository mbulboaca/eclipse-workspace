package zoo;

public class Crocodiles extends Animals implements Reptiles, Asia{

	public Crocodiles(String name, int age, String type, String origin) {
		super(name, age, type, origin);
		
	}
	public void origin() {
		System.out.println("This animal is from Asia");
	}
	public void type() { 
		System.out.println("Reptile");
	}
	@Override
	public String toString() {
		return "Crocodiles [name=" + name + ", age=" + age + ", type=" + type + ", origin=" + origin + "]";
	}
	

	
	
}
