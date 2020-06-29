package zoo;

public class Parrots extends Animals implements Birds{

	public Parrots(String name, int age, String type, String origin) {
		super(name, age, type, origin);
	
	}

	@Override
	public String toString() {
		return "Parrots [name=" + name + ", age=" + age + ", type=" + type + ", origin=" + origin + "]";
	}

	@Override
	public void origin() {
		// TODO Auto-generated method stub
		
	}
	
	public void type() { 
		System.out.println("Bird");
	}
}
