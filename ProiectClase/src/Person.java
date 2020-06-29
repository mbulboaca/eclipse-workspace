
public class Person {
	
	private int age; 
	private String fname;
	private String lname; 
	String gender; 
	int Idiotlvl; 
	float weight;
	double neurons; 
    Person() {
    	age = 20; 
    	fname = "unknown";
    	lname = null;
    	gender = "unknown"; 
    	Idiotlvl = 10;
    	weight = 74f;
        neurons = 1; 
    }	
    	
    Person(int age, String fname) {
		this.age = age; 
		this.fname = fname;
				
    }
    
    Person(int age, String fname, int Idiotlvl, float weight, double neurons) { 
    	this.age = age; 
    	this.fname = fname;
    	this.Idiotlvl = Idiotlvl; 
    	this.weight = weight; 
    	this.neurons = neurons; 
    }

    public int getAge() {
    	return.this.age; 
    }
    
    public String toString() {
    	return "He has " + this.weight  + " kg of stupid meat on him" + " and only " + this.neurons + " neurons"; 
    
    }
    
}
	
	
