package zoo;

public class Lizard extends Animals implements Reptiles{

	public Lizard(String name, int age, String type, String origin) {
		super(name, age, type, origin);
	}

	@Override
	public void origin() {
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public String toString() {
		return "Lizard [name=" + name + ", age=" + age + ", type=" + type + ", origin=" + origin + "]";
	}

	public void type() { 
		System.out.println("Reptile");
	}
}
