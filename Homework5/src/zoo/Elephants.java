package zoo;

public class Elephants extends Animals implements Mammals {

	public Elephants(String name, int age, String type, String origin) {
		super(name, age, type, origin);
	}

	

	@Override
	public String toString() {
		return "Elephants [name=" + name + ", age=" + age + ", type=" + type + ", origin=" + origin + "]";
	}



	@Override
	public void origin() {
		// TODO Auto-generated method stub
		
	}
	
	public void type() { 
		System.out.println("Mammal");
	}
}
