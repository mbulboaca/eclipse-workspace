package zoo;

public abstract class Animals {
	String name; 
	int age;
	String type; 
	String origin; 
	
	public Animals(String name, int age, String type, String origin) {
		this.name = name;
		this.age = age;
		this.type = type;
		this.origin = origin; 
	}	
	abstract public void origin(); 
	
}

