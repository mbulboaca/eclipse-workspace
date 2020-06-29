package zoo;

public class Bears extends Animals implements Mammals{

	public Bears(String name, int age, String type, String origin) {
		super(name, age, type, origin); 
		
	
	}

	@Override
	public String toString() {
		return "Bears [name=" + name + ", age=" + age + ", type=" + type + ", origin=" + origin + "]";
	}

	@Override
	public void origin() {
		
		
	}


	public void type() { 
		System.out.println("Mammal");
	}
	
}
